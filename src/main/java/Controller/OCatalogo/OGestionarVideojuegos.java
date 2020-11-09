package Controller.OCatalogo;

import Model.Catalogo.Gestor_Catalogo;
import Model.Catalogo.Videojuego;
import View.GUIS_Catalogo.GUI_Gestionar_Videojuegos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class OGestionarVideojuegos implements ActionListener {
    Gestor_Catalogo dao = new Gestor_Catalogo();
    Videojuego vid = new Videojuego();
    GUI_Gestionar_Videojuegos gui = new GUI_Gestionar_Videojuegos();
    DefaultTableModel modelo = new DefaultTableModel();

    public OGestionarVideojuegos(GUI_Gestionar_Videojuegos gui) {
        this.gui = gui;
        listar(gui.jTable);

        this.gui.jButtonRegresar.addActionListener(this);
        this.gui.jButtonEditar.addActionListener(this);
        this.gui.jButtonGuardar.addActionListener(this);
        this.gui.jButtonEliminar.addActionListener(this);

        //this.gui.jButtonListar.addActionListener(this);
        gui.jButtonListar.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //if (actionEvent.getSource() == gui.jButtonListar) {
        //    limpiarTabla();
        //    listar(gui.jTable);
        //    //nuevo();
        //}
        if (actionEvent.getSource() == gui.jButtonEditar){
            int fila = gui.jTable.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(gui, "Debe Seleccionar Una Fila!!");
            } else {
                modoEditar(fila);
            }
        }

        if( actionEvent.getSource() == gui.jButtonGuardar){
            actualizar();

        }

        if(actionEvent.getSource() == gui.jButtonEliminar){
            eliminar();
            limpiarTabla();
            listar(gui.jTable);
        }

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

    public void modoEditar(int fila){
        int id = Integer.parseInt((String) gui.jTable.getValueAt(fila, 0).toString());
        String titulo = (String) gui.jTable.getValueAt(fila, 1);
        String dec = (String) gui.jTable.getValueAt(fila, 2);
        String admin = (String) gui.jTable.getValueAt(fila, 5);
        String gen = (String) gui.jTable.getValueAt(fila, 3);

        gui.jTextFieldID.setText("" + id);
        gui.jTextFieldTitulo.setText(titulo);
        gui.jTextAreaDesc.setText(dec);
        gui.jTextFieldAdmin.setText(admin);

        gui.jComboBoxGen.setSelectedItem(gen);
        //gui.jTextFieldRFC.setEditable(false);

        gui.jButtonGuardar.setEnabled(true);

        gui.jButtonEliminar.setEnabled(false);
        gui.jButtonRegresar.setEnabled(false);
        gui.jButtonAgregar.setEnabled(false);
        gui.jButtonListar.setEnabled(false);

    }

    public void actualizar(){
        String titulo = gui.jTextFieldTitulo.getText();
        String desc = gui.jTextAreaDesc.getText();
        //String adminText = gui.jTextFieldAdmin.getText();
        String gen= String.valueOf(gui.jComboBoxGen.getSelectedItem());
        int id = Integer.parseInt(gui.jTextFieldID.getText() );
        //System.out.println(gen);

        vid.setGenero(gen);
        vid.setTitulo(titulo);
        vid.setDescripcion(desc);
        vid.setId_videojuego(id);

        int r = dao.actualizar(vid);
        if (r == 1) {
            JOptionPane.showMessageDialog(gui, "Videojuego Actualizado con Exito :) ");


        } else {
            JOptionPane.showMessageDialog(gui, "Error al actualizar");
        }

        limpiarCampos();
        limpiarTabla();
        listar(gui.jTable);

        gui.jButtonGuardar.setEnabled(false);

        gui.jButtonEliminar.setEnabled(true);
        gui.jButtonRegresar.setEnabled(true);
        gui.jButtonAgregar.setEnabled(true);
        gui.jButtonListar.setEnabled(true);
    }

    public void eliminar() {
        int fila = gui.jTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(gui, "Debe Seleccionar Una Fila!!!");
        } else {
            int id = Integer.parseInt((String) gui.jTable.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            System.out.println("Se elimino el Juego con id " + id);
            JOptionPane.showMessageDialog(gui, "Videojuego Eliminado!!!");
        }
        limpiarTabla();
    }


    public void limpiarCampos(){
        gui.jTextFieldID.setText("");
        gui.jTextFieldTitulo.setText("");
        gui.jTextAreaDesc.setText("");
        gui.jTextFieldAdmin.setText("");
        gui.jComboBoxGen.setSelectedItem("MOBA");
    }

    public void limpiarTabla() {
        for (int i = 0; i < gui.jTable.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }





}
