/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OReseñas;

import Controller.OCatalogo.OMostrarVideojuego;
import Model.Resenias_Videojuego.*;
import Model.Catalogo.*;
import Model.AyU.*;
import View.GUIS_AyU.*;
import View.GUIS_Catalogo.*;
import View.GUIS_Resenias.*;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Delttoria
 */

public class OResenias_Videojuego implements ActionListener{
    
    //Atributos del oyente
    private GUILogin Login = new GUILogin();
    DefaultTableModel Modelo = new DefaultTableModel();
    Videojuego videojuego = new Videojuego();
    
    //Gestor
    private Gestor_ReseniaVideojuego Gestor_resenias = new Gestor_ReseniaVideojuego();
    
    //Guis
    private GUI_Gestionar_Resenias Gui_gestora_resenias;
    private GUI_EscribirResenia Gui_escritora;
    private GUI_Ver_Resenias Gui_reseñas_videojuegoP;
    private GUI_Mis_Resenias mis_resenias;
    
    //Corroborar autenticacion
    private GUILogin login = new GUILogin();
    
    //Mis resenias
    ArrayList<JTextField> Titulos;
    ArrayList<JTextField> Estrellas;
    ArrayList<JTextArea> Contenidos;
    ArrayList<JTextField> geeks;
    ArrayList<Resenia> bloques;
    List<Resenia> lista;
    ListaResenias lista_clase;
    
    @Override
    public void actionPerformed(ActionEvent actionEvent){
        if(Gui_gestora_resenias != null){
            if(actionEvent.getSource() == Gui_gestora_resenias.jButtonEliminar){
                eliminar_reseña();
                limpiar_resenias();
                listar_resenias_o(Gui_gestora_resenias.jTable);
            }
        }else if(Gui_escritora != null){
        
            if(actionEvent.getSource() == Gui_escritora.jButtonGuardar){
                if (Gui_escritora.jTextFieldTitulo.getText().equals("") || Gui_escritora.jTextAreaContenido.getText().equals("")) {
                    JOptionPane.showMessageDialog(Gui_escritora, "Imposible intentar agregar una reseña sin todos los campos.");
                }
                else {
                    escribir_reseña();
                    GUI_Mostrar_Videojuego gui = new GUI_Mostrar_Videojuego();
                    OMostrarVideojuego con = new OMostrarVideojuego(gui.v, gui);
                    gui.setVisible(true);
                    Gui_escritora.setVisible(false);
                }
            }
        }else if(Gui_reseñas_videojuegoP != null){
            if (actionEvent.getSource() == Gui_reseñas_videojuegoP.jButtonNext){
                if ( Gui_reseñas_videojuegoP.cuenta < lista_clase.getResenias_totales().size()) {
                    cargar_resenias();
                }
                else {
                    JOptionPane.showMessageDialog(Gui_reseñas_videojuegoP, "Ya no hay más reseñas por mostrar!");
                }
            }
            if (actionEvent.getSource() == Gui_reseñas_videojuegoP.jButtonAfter){
                int restar = contar_resenias();
                Gui_reseñas_videojuegoP.cuenta = Gui_reseñas_videojuegoP.cuenta - restar - 3;
                if ( Gui_reseñas_videojuegoP.cuenta < 0) {
                    JOptionPane.showMessageDialog(Gui_reseñas_videojuegoP, "Ya no hay más reseñas por mostrar!");
                    Gui_reseñas_videojuegoP.cuenta = 3;
                }
                else {
                    cargar_resenias();
                }
            }
        }else if(mis_resenias != null){
            if(actionEvent.getSource() == mis_resenias.jButtonEliminar){
                eliminar_reseña_mis();
                limpiar_mis_resenias();
                listar_mis_resenias(mis_resenias.jTableRes);
            }
        }
    }
    
    //Escritor de reseñas de videojuegos
    public OResenias_Videojuego(GUI_EscribirResenia Gui_escritora,Videojuego videojuego){
        this.Gui_escritora = Gui_escritora;
        this.videojuego = videojuego;
        this.Gui_escritora.jButtonGuardar.addActionListener(this);
        this.Gui_escritora.jButtonRegresar.addActionListener(this);
    }
    //Gestor reseñas videojuegos
    public OResenias_Videojuego(GUI_Gestionar_Resenias gui_gestores_resenias){
        this.Gui_gestora_resenias = gui_gestores_resenias;
        listar_resenias_o(this.Gui_gestora_resenias.jTable);
        this.Gui_gestora_resenias.jButtonRegresar.addActionListener(this);
        this.Gui_gestora_resenias.jButtonEliminar.addActionListener(this);
        
    }
    
    //Reseñas de un videojuego en particular
    public OResenias_Videojuego(GUI_Ver_Resenias reseñas_particulares,Videojuego videojuego){
        this.Gui_reseñas_videojuegoP = reseñas_particulares;
        this.Gui_reseñas_videojuegoP.jButtonAfter.addActionListener(this);
        this.Gui_reseñas_videojuegoP.jButtonNext.addActionListener(this);
        this.Gui_reseñas_videojuegoP.jButtonRegresar.addActionListener(this);
        this.videojuego = videojuego;
        if(this.Gui_reseñas_videojuegoP.r1 == null) {
            ver_todas_resenias();
        }else{
            lista_clase = Gestor_resenias.listar_resenias_particulares(videojuego.getId_videojuego());
            preparar_labels();
            mostrar_3resenias();
        }
        this.Gui_reseñas_videojuegoP.r1 = null;
        this.Gui_reseñas_videojuegoP.r2 = null;
        this.Gui_reseñas_videojuegoP.r3 = null;
    }
    
    //Mis reseñas
    public OResenias_Videojuego(GUI_Mis_Resenias mis_resenias){
        this.mis_resenias = mis_resenias;
        listar_mis_resenias(this.mis_resenias.jTableRes);
        this.mis_resenias.jButtonEliminar.addActionListener(this);
        this.mis_resenias.jButtonRegresar.addActionListener(this);
    }
    //Metodo para la funcionalidad del gestor de reseñas de videojuegos y mis reseñas
    public void eliminar_reseña() {
        int fila = Gui_gestora_resenias.jTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(Gui_gestora_resenias, "Selecciona una fila, por favor.");
        } else {
            int id_resenia = Integer.parseInt((String) Gui_gestora_resenias.jTable.getValueAt(fila, 0).toString());
            Gestor_resenias.eliminar_resenia(id_resenia);
            JOptionPane.showMessageDialog(Gui_gestora_resenias, "Reseña eliminada.");
        }
        limpiar_resenias();
    }
    //Metodo para la funcionalidad del gestor de reseñas de videojuegos
    public void listar_resenias_o(JTable tabla){
        Modelo = (DefaultTableModel) tabla.getModel();
        List<Resenia> lista = Gestor_resenias.listar_resenias();
        Object[] objeto = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId_resenia();
            objeto[1] = lista.get(i).getId_videojuego_asociado();
            objeto[2] = lista.get(i).getId_geek_asociado();
            objeto[3] = lista.get(i).getTitulo_resenia();
            objeto[4] = lista.get(i).getContenido();
            objeto[5] = lista.get(i).getPuntuacion();
            Modelo.addRow(objeto);
        }
        tabla.setModel(Modelo);
    }
    
    //Metodo para la funcionalidad del gestor de reseñas de videojuegos y mis reseñas
    public void limpiar_resenias(){
        for (int i = 0; i < Gui_gestora_resenias.jTable.getRowCount(); i++) {
            Modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    
    //Metodo para la funcionalidad del escritor de reseñas
    public void escribir_reseña(){
        String titulo = Gui_escritora.jTextFieldTitulo.getText();
        String contenido = Gui_escritora.jTextAreaContenido.getText();
        int estrellas = (Integer) Gui_escritora.jSpinnerEstrellas.getValue();
        Usuario geek = login.autenticado;
        String user_geek = geek.getUsername();
        int id_videojuego = videojuego.getId_videojuego();
        if(Gestor_resenias.aniadir_resenia(estrellas,titulo,contenido,user_geek,id_videojuego) == true){
            JOptionPane.showMessageDialog(Gui_escritora, "Reseña agregada con exito.");
        }else{
            JOptionPane.showMessageDialog(Gui_escritora, "Error :(");
        }
    }
    
    
    //Metodo para ver reseñas
    public void mostrar_3resenias(){
        for (int i = 0; i < 3; i++) {
            mostrar_una_resenia( Titulos.get(i), Estrellas.get(i), bloques.get(i), geeks.get(i),Contenidos.get(i));
        }
    }
    //Muestra una reseña de un videojuego
    public void mostrar_una_resenia( JTextField titulo, JTextField estrellas, Resenia resena, JTextField geek,JTextArea contenido){
        if( resena != null) {
            titulo.setText(resena.getTitulo_resenia());
            estrellas.setText(String.valueOf(resena.getPuntuacion()));
            geek.setText(String.valueOf(resena.getId_geek_asociado()));
            contenido.setText(resena.getContenido());
        }
        else{
            titulo.setText("Nada que mostrar :(");
            estrellas.setText(String.valueOf(404));
            geek.setText("@Geek_desconocido");
        }
    }
    //Prepara los labels
    private void preparar_labels() {
        Titulos = new ArrayList(3);
        Titulos.add(Gui_reseñas_videojuegoP.jTextFieldTitulo1);
        Titulos.add(Gui_reseñas_videojuegoP.jTextFieldTitulo2);
        Titulos.add(Gui_reseñas_videojuegoP.jTextFieldTitulo3);

        Estrellas = new ArrayList(3);
        Estrellas.add(Gui_reseñas_videojuegoP.jTextFieldEstrellas1);
        Estrellas.add(Gui_reseñas_videojuegoP.jTextFieldEstrellas2);
        Estrellas.add(Gui_reseñas_videojuegoP.jTextFieldEstrellas3);

        bloques = new ArrayList(3);
        bloques.add(Gui_reseñas_videojuegoP.r1);
        bloques.add(Gui_reseñas_videojuegoP.r2);
        bloques.add(Gui_reseñas_videojuegoP.r3);
        
        geeks = new ArrayList(3);
        geeks.add(Gui_reseñas_videojuegoP.jTextFieldUser1);
        geeks.add(Gui_reseñas_videojuegoP.jTextFieldUser2);
        geeks.add(Gui_reseñas_videojuegoP.jTextFieldUser3);

        Contenidos = new ArrayList(3);
        Contenidos.add(Gui_reseñas_videojuegoP.jTextAreaContenido1);
        Contenidos.add(Gui_reseñas_videojuegoP.jTextAreaContenido2);
        Contenidos.add(Gui_reseñas_videojuegoP.jTextAreaContenido3);

    }
    
    //Limpiar resenias
    public void vaciar_3resenias(){
        Gui_reseñas_videojuegoP.r1 = null;
        Gui_reseñas_videojuegoP.r2 = null;
        Gui_reseñas_videojuegoP.r3 = null;
    }
    
    //Siguiente resenias
    public void next(){
        if(Gui_reseñas_videojuegoP.cuenta < lista_clase.getResenias_totales().size()) {
            Gui_reseñas_videojuegoP.r1 = lista_clase.getResenias_totales().get(Gui_reseñas_videojuegoP.cuenta);
            Gui_reseñas_videojuegoP.cuenta++;
        }
        if(Gui_reseñas_videojuegoP.cuenta < lista_clase.getResenias_totales().size()) {
            Gui_reseñas_videojuegoP.r2 = lista_clase.getResenias_totales().get(Gui_reseñas_videojuegoP.cuenta);
            Gui_reseñas_videojuegoP.cuenta++;
        }
        if(Gui_reseñas_videojuegoP.cuenta < lista_clase.getResenias_totales().size()) {
            Gui_reseñas_videojuegoP.r3 = lista_clase.getResenias_totales().get(Gui_reseñas_videojuegoP.cuenta);
            Gui_reseñas_videojuegoP.cuenta++;
        }
    }
    
    //Ver todas las reseñas
    public void ver_todas_resenias(){
        lista_clase = Gestor_resenias.listar_resenias_particulares(videojuego.getId_videojuego());
        cargar_resenias();
    }
    
    public void cargar_resenias(){
        vaciar_3resenias();
        next();
        preparar_labels();
        mostrar_3resenias();
    }

    private int contar_resenias() {
        int x = 0;
        for (int i = 0; i < 3; i++) {
            if (bloques.get(i) != null)
                x++;
        }
        return x;
    }
    
    //Metodo para la funcionalidad del gestor de reseñas de videojuegos
    public void listar_mis_resenias(JTable tabla){
        this.Modelo = (DefaultTableModel) tabla.getModel();
        List<Resenia> lista = Gestor_resenias.listar_mis_resenias(login.autenticado.getID_User());
        Object[] objeto = new Object[5];
        Random random = new Random();
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId_videojuego_asociado();
            objeto[1] = lista.get(i).getTitulo_resenia();
            objeto[2] = lista.get(i).getContenido();
            objeto[3] = lista.get(i).getPuntuacion();
            objeto[4] = random.nextInt(i+2%200);
            Modelo.addRow(objeto);
        }
        tabla.setModel(Modelo);
    }
    
    public void eliminar_reseña_mis() {
        int fila = mis_resenias.jTableRes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(mis_resenias, "Selecciona una fila, por favor.");
        } else {
            int id_resenia = Integer.parseInt((String) mis_resenias.jTableRes.getValueAt(fila, 0).toString());
            Gestor_resenias.eliminar_resenia(id_resenia);
            JOptionPane.showMessageDialog(mis_resenias, "Reseña eliminada.");
        }
        limpiar_resenias();
    }
    
    //Metodo para la funcionalidad del gestor de reseñas de videojuegos y mis reseñas
    public void limpiar_mis_resenias(){
        for (int i = 0; i < mis_resenias.jTableRes.getRowCount(); i++) {
            Modelo.removeRow(i);
            i = i - 1;
        }
    }
}
