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
    ArrayList<JButton> botones_ver;

    public OCatalogo(GUI_Catalogo gui) {
        this.gui = gui;


        this.gui.jButtonNext.addActionListener(this);
        this.gui.jButtonAfter.addActionListener(this);


        this.gui.jButtonActualizar.addActionListener(this);
        this.gui.jComboBoxGen.addActionListener(this);

        this.gui.jComboBoxGen.setSelectedItem(this.gui.genero);

        if(this.gui.v1 == null) {
            ver_todos_los_videojuegos();
        }
        else if(this.gui.genero != "Todos"){
            lista = dao.videojuegos_genero(this.gui.genero);
            preparar_labels();
            mostrar_tres_videojuegos();
        }
        else{
            lista = dao.listar_Videojuegos();
            preparar_labels();
            mostrar_tres_videojuegos();
        }
        //this.gui.jButtonListar.addActionListener(this);
    }

    public void cargar_videojuegos_a_gui(){
        vaciar_tresvideojuegos();
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

        botones_ver = new ArrayList(3);
        botones_ver.add(gui.jButtonVerVideojuego1);
        botones_ver.add(gui.jButtonVerVideojuego2);
        botones_ver.add(gui.jButtonVerVideojuego3);

    }

    public void ver_todos_los_videojuegos(){
        lista = dao.listar_Videojuegos();
        cargar_videojuegos_a_gui();
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
        if( actionEvent.getSource() == gui.jButtonActualizar){
            gui.genero = String.valueOf(gui.jComboBoxGen.getSelectedItem());
            if(gui.genero != "Todos") {
                lista = dao.videojuegos_genero(gui.genero);
                gui.cuenta = 0;
                cargar_videojuegos_a_gui();
            }
            else{
                ver_todos_los_videojuegos();
            }
        }
    }


    public void vaciar_tresvideojuegos(){
        gui.v1 = null;
        gui.v2 = null;
        gui.v3 = null;
    }

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


    public void mostrar_un_videojuego( JTextField titulo, JTextField estrellas, Videojuego v, JButton boton){
        if( v != null) {
            titulo.setText(v.getTitulo());
            estrellas.setText(String.valueOf(v.getEstrellas()));
            boton.setEnabled(true);
        }
        else{
            titulo.setText("Nada que mostrar :(");
            estrellas.setText(String.valueOf(404));
            boton.setEnabled(false);
        }
    }

    public void mostrar_tres_videojuegos(){
        for (int i = 0; i < 3; i++) {
            mostrar_un_videojuego( jTextFieldTitulos.get(i), jTextFieldEstrellas.get(i), bloques.get(i), botones_ver.get(i) );

        }
    }

    private void videojuegos_genero(String genero) {

    }

}
