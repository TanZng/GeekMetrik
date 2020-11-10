package Controller.OCatalogo;

import Model.Catalogo.Videojuego;
import View.GUIS_Catalogo.GUI_Catalogo;
import View.GUIS_Catalogo.GUI_Mostrar_Videojuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OMostrarVideojuego implements ActionListener {

    GUI_Mostrar_Videojuego gui;

    public OMostrarVideojuego(Videojuego vid, GUI_Mostrar_Videojuego gui) {
        this.gui = gui;
        gui.v = vid;
        mostrar_videojuego();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public void mostrar_videojuego(){
        gui.jLabelTitulo.setText(gui.v.getTitulo());
        gui.jTextAreaDesc.setText(gui.v.getDescripcion());
        gui.jTextFieldEstrellas.setText(String.valueOf(gui.v.getEstrellas()));
    }

}