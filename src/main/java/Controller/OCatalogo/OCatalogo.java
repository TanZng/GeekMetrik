package Controller.OCatalogo;

import Model.Catalogo.Gestor_Catalogo;
import Model.Catalogo.Videojuego;
import View.GUIS_AyU.GUILogin;
import View.GUIS_Catalogo.GUI_Catalogo;
import View.GUIS_Catalogo.GUI_Gestionar_Videojuegos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OCatalogo implements ActionListener {

    Gestor_Catalogo dao = new Gestor_Catalogo();
    GUILogin login = new GUILogin();
    GUI_Catalogo gui;

    List<Videojuego> lista;

    ArrayList<JTextField> jTextFieldTitulos;
    ArrayList<JTextField> jTextFieldEstrellas;
    ArrayList<Videojuego> bloques;

    public OCatalogo(GUI_Catalogo gui) {
        this.gui = gui;
        lista = dao.listar_Videojuegos();

        this.gui.jButtonNext.addActionListener(this);
        this.gui.jButtonAfter.addActionListener(this);

        this.gui.jButtonMoba.addActionListener(this);
        this.gui.jButtonRPG.addActionListener(this);
        this.gui.jButtonTerror.addActionListener(this);
        this.gui.jButtonAccion.addActionListener(this);

        if(this.gui.v1 == null) {
            cargar_videojuegos_a_gui();
        }
        else{
            preparar_labels();
            mostrar_tres_videojuegos();
        }
        //this.gui.jButtonListar.addActionListener(this);
    }



    public void cargar_videojuegos_a_gui(){
        //vaciar_tresvideojuegos();
        next();
        preparar_labels();
        mostrar_tres_videojuegos();
    }

    private int contar_juegos_mostrados() {
        int x = 0;
        for (int i = 0; i < 3; i++) {
            if (bloques.get(i) != null)
                x++;
        }
        return x;
    }


    private void preparar_labels() {
        jTextFieldTitulos = new ArrayList(3);
        jTextFieldTitulos.add(gui.jTextFieldTituloVideojuego1);
        jTextFieldTitulos.add(gui.jTextFieldTituloVideojuego2);
        jTextFieldTitulos.add(gui.jTextFieldTituloVideojuego3);

        jTextFieldEstrellas = new ArrayList(3);
        jTextFieldEstrellas.add(gui.jTextFieldEstr1);
        jTextFieldEstrellas.add(gui.jTextFieldEstr2);
        jTextFieldEstrellas.add(gui.jTextFieldEstr3);

        bloques = new ArrayList(3);
        bloques.add(gui.v1);
        bloques.add(gui.v2);
        bloques.add(gui.v3);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == gui.jButtonNext){
            if ( gui.cuenta < lista.size()) {
                cargar_videojuegos_a_gui();
            }
            else {
                JOptionPane.showMessageDialog(gui, "Ya no hay más videojuegos por mostrar!");
            }
        }
        if (actionEvent.getSource() == gui.jButtonAfter){
            int restar = contar_juegos_mostrados();
            gui.cuenta = gui.cuenta - restar - 3;
            if ( gui.cuenta < 0) {
                JOptionPane.showMessageDialog(gui, "Ya no hay más videojuegos por mostrar!");
                gui.cuenta = 3;
            }
            else {
                cargar_videojuegos_a_gui();
            }
        }
    }

    /*
    public void vaciar_tresvideojuegos(){
        v1 = null;
        v2 = null;
        v3 = null;
    }
    */

    public void next(){

        if(gui.cuenta < lista.size()) {
            gui.v1 = lista.get(gui.cuenta);
            gui.cuenta++;
            }
        if(gui.cuenta < lista.size()) {
            gui.v2 = lista.get(gui.cuenta);
            gui.cuenta++;
        }
        if(gui.cuenta < lista.size()) {
            gui.v3 = lista.get(gui.cuenta);
            gui.cuenta++;
        }
    }


    public void mostrar_un_videojuego( JTextField titulo, JTextField estrellas, Videojuego v){
        if( v != null) {
            titulo.setText(v.getTitulo());
            estrellas.setText(String.valueOf(v.getEstrellas()));
        }
        else{
            titulo.setText("Nada que mostrar :(");
            estrellas.setText(String.valueOf(404));
        }
    }

    public void mostrar_tres_videojuegos(){
        for (int i = 0; i < 3; i++) {
            mostrar_un_videojuego( jTextFieldTitulos.get(i), jTextFieldEstrellas.get(i), bloques.get(i) );

        }
    }

}
