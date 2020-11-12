/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OReseñas;

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

/**
 *
 * @author Delttoria
 */

public class OResenias_Videojuego implements ActionListener{
    
    //Atributos del oyente
    private Geek Usuario;
    private GUILogin Login;
    DefaultTableModel Modelo = new DefaultTableModel();
    
    //Gestor
    private Gestor_ReseniaVideojuego Gestor_resenias;
    
    //Guis
    private GUI_Gestionar_Resenias Gui_gestora_resenias;
    
    @Override
    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource() == Gui_gestora_resenias.jButtonEliminar){
            eliminar_reseña();
            limpiar_resenias();
            listar_resenias(Gui_gestora_resenias.jTable);
        }
    }
    
    
    //Gestor reseñas videojuegos
    public OResenias_Videojuego(GUI_Gestionar_Resenias gui_gestores_resenias){
        Gui_gestora_resenias = gui_gestores_resenias;
        listar_resenias(Gui_gestora_resenias.jTable);
    }
    
    //Metodo para la funcionalidad del gestor de reseñas de videojuegos y mis reseñas
    public void eliminar_reseña() {
        int fila = Gui_gestora_resenias.jTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(Gui_gestora_resenias, "Debe Seleccionar Una Fila!!!");
        } else {
            int id_resenia = Integer.parseInt((String) Gui_gestora_resenias.jTable.getValueAt(fila, 0).toString());
            Gestor_resenias.eliminar_resenia(id_resenia);
            System.out.println("Se elimino el Juego con id " + id_resenia);
            JOptionPane.showMessageDialog(Gui_gestora_resenias, "Videojuego Eliminado!!!");
        }
        limpiar_resenias();
    }
    //Metodo para la funcionalidad del gestor de reseñas de videojuegos
    public void listar_resenias(JTable tabla){
        System.out.println("LISTANDO...\n");
        Modelo = (DefaultTableModel) tabla.getModel();
        ListaResenias lista = Gestor_resenias.listar_resenias();
        Object[] objeto = new Object[6];
        for (int i = 0; i < lista.getResenias_totales().size(); i++) {
            objeto[0] = lista.getResenias_totales().get(i).getId_resenia();
            objeto[1] = lista.getResenias_totales().get(i).getId_videojuego_asociado();
            objeto[2] = lista.getResenias_totales().get(i).getId_geek_asociado();
            objeto[3] = lista.getResenias_totales().get(i).getTitulo_resenia();
            objeto[4] = lista.getResenias_totales().get(i).getContenido();
            objeto[5] = lista.getResenias_totales().get(i).getPuntuacion();
            Modelo.addRow(objeto);
        }
        tabla.setModel(Modelo);
    }
    
    //Metodo parala funcionalidad del gestor de reseñas de videojuegos y mis reseñas
    public void limpiar_resenias(){
        for (int i = 0; i < Gui_gestora_resenias.jTable.getRowCount(); i++) {
            Modelo.removeRow(i);
            i = i - 1;
        }
    }
}
