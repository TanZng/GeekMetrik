package Controller.OCatalogo;

import Model.Catalogo.Gestor_Catalogo;
import Model.Catalogo.Videojuego;
import View.GUIS_Catalogo.GUI_Gestionar_Videojuegos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class OGestionarVideojuegos implements ActionListener {
    Gestor_Catalogo dao = new Gestor_Catalogo();
    Videojuego cliente = new Videojuego();
    GUI_Gestionar_Videojuegos gui = new GUI_Gestionar_Videojuegos();
    DefaultTableModel modelo = new DefaultTableModel();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == gui.jButtonListar) {
            //limpiarTabla();
            listar(gui.jTable);
            //nuevo();
        }


    }

    public OGestionarVideojuegos(GUI_Gestionar_Videojuegos gui) {
        this.gui = gui;
        //listar(gui.jTable);

        this.gui.jButtonRegresar.addActionListener(this);
        this.gui.jButtonEditar.addActionListener(this);
        this.gui.jButtonGuardar.addActionListener(this);
        this.gui.jButtonEliminar.addActionListener(this);
        this.gui.jButtonListar.addActionListener(this);
    }

    public void listar(JTable tabla){
        System.out.println("LISTANDO...\n");
        modelo = (DefaultTableModel) tabla.getModel();
        List<Videojuego> lista = dao.listar_Videojuegos();
        Object[] objeto = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId_videojuego();
            objeto[1] = lista.get(i).getTitulo();
            objeto[2] = lista.get(i).getDescripcion();
            objeto[3] = lista.get(i).getGenero();
            objeto[4] = lista.get(i).getEstrellas();
            objeto[5] = lista.get(i).getId_admin_asociado();
            modelo.addRow(objeto);
        }
        tabla.setModel(modelo);
    }



}
