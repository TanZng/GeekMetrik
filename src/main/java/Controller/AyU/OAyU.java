package Controller.AyU;

import Controller.OCatalogo.OMenuAdmin;
import Model.AyU.*;
import Model.Utilerias.hash;
import View.GUIS_AyU.*;
import View.GUIS_Catalogo.GUI_Menu_Admin;
import View.GUIS_Catalogo.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase oyente para Autenticación y Usuarios
 * @author Feth
 * @version 1.0
 */
public class OAyU implements ActionListener {
    
    private Geek geek;
    private GUISignUp gui;
    private GUILogin gui1;
    private GUI_MiPerfil gui2;
    private GestorAyU gestor;
    private Autenticacion autenticar;
    private Registro registrar;
    public static File imagen;
    public static String ruta;
    
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        
        if( this.registrar != null ) {
            
            if ( actionEvent.getSource() == gui.jButtonSignUp ) {
            
            registrar();
            
            }
            
        }
        
        else if( this.autenticar != null ) {
            
            if ( actionEvent.getSource() == gui1.jButtonLogin ) {
            
            autenticar();
            
            }
            
        }
        
        else if( this.gestor != null ) {
            
            if( actionEvent.getSource() == gui2.jButtonActualizar ) {
                
                actualizar();
                
            }
  
        }

    }
    
    public OAyU( GUISignUp gui ) {
        
        this.gui = gui;
        this.registrar = new Registro();
        
        this.gui.jButtonSignUp.addActionListener(this);
        this.gui.jButtonRegresar.addActionListener(this);
        
    }
    
    public OAyU( GUILogin gui ) {
        
        this.gui1 = gui;
        this.autenticar = new Autenticacion();
        
        this.gui1.jButtonLogin.addActionListener(this);
        this.gui1.jButtonRegresar.addActionListener(this);
        
    }
    
    public OAyU( GUI_MiPerfil gui ) {
        
        this.gui2 = gui;
        this.gestor = new GestorAyU();
        
        this.gui2.jTextFieldNombre.setText(GUILogin.autenticado.getNombre());
        this.gui2.jTextFieldApellP.setText(GUILogin.autenticado.getaPaterno());
        this.gui2.jTextFieldApellM.setText(GUILogin.autenticado.getaMaterno());
        this.gui2.jTextFieldMail.setText(GUILogin.autenticado.getCorreo());
        this.gui2.jTextAreaBio.setText(GUILogin.bio);
        this.gui2.jLabelMETRIK1.setText("@" + GUILogin.autenticado.getUsername());
        
        this.gui2.jButtonActualizar.addActionListener(this);
        
    }
    
    
    public void registrar() {
        
        // Creamos el Geek con la información dada
        this.geek = new Geek(gui.jTextFieldNombre.getText(), gui.jTextFieldMail.getText(), 0, gui.jTextFieldPassword.getText(), gui.jTextFieldUsuario.getText());
           
        FileInputStream fis = null;
        
        try {
            
            if( imagen != null) {
                
                fis = new FileInputStream( imagen );
            
                geek.setImagen_perfil((int) imagen.length());
                
            }            
            
            if( this.registrar.efectuarRegistroGeek( this.geek, fis ) ) {
                
                JOptionPane.showMessageDialog(null, "Registro exitoso!");
                
            } else{
                
                JOptionPane.showMessageDialog(null, "Hubo un error en el registro, intenta de nuevo mas tarde :(");
            
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorAyU.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                
                if( imagen != null) {
                
                    fis.close();
                
                }   

            } catch (IOException ex) {
                Logger.getLogger(GestorAyU.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public void autenticar() {
        
        this.autenticar.setContrasena(gui1.jTextFieldPassword.getText());
        this.autenticar.setUsername(gui1.jTextFieldUsuario.getText());
        
        Usuario usr = this.autenticar.autenticar();
        
        // Extraemos usuarios de la DB y esperamos autenticación
        if( usr != null ) {
        
            if( usr.getTipo() == 0 ) {
                
                this.gui1.autenticado = this.autenticar.autenticado;
                JOptionPane.showMessageDialog(null, "Bienvenido admin!");
                
                // Falta generar el oyente
                GUI_Menu_Admin admin = new GUI_Menu_Admin();
                OMenuAdmin con = new OMenuAdmin(admin);
                
                admin.setVisible(true);
                this.gui1.setVisible(false);
                
            }
            
            else {
                
                this.gui1.autenticado = this.autenticar.autenticado;
                JOptionPane.showMessageDialog(null, "Autenticación exitosa!");
                
            }
        
        }
        
        else {
            
            JOptionPane.showMessageDialog(null, "No se pudo autenticar :(");
            
        }
        
    }
    
    public void actualizar() {
        
        GUILogin.autenticado.setNombre(this.gui2.jTextFieldNombre.getText());
        GUILogin.autenticado.setaMaterno(this.gui2.jTextFieldApellP.getText());
        GUILogin.autenticado.setaPaterno(this.gui2.jTextFieldApellM.getText());
        GUILogin.autenticado.setCorreo(this.gui2.jTextFieldMail.getText());
        String bio = this.gui2.jTextAreaBio.getText();
        
        // Extraemos usuarios de la DB y esperamos autenticación
        if( gestor.modificarUsuario(GUILogin.autenticado, bio)) {
            
            JOptionPane.showMessageDialog(null, "Actualizado!");
            
        }
        
        else {
            
            JOptionPane.showMessageDialog(null, "Fallo al actualizar :(");
            
        }
        
    }
    
}

