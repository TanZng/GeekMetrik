package Controller.OCatalogo;

import View.GUIS_AyU.GUILogin;
import View.GUIS_Catalogo.GUI_Catalogo;
import View.GUIS_Catalogo.GUI_Menu_Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OMenuAdmin implements ActionListener {

    GUI_Menu_Admin gui;

    public OMenuAdmin(GUI_Menu_Admin gui) {
        this.gui = gui;
        this.gui.jButtonLogout.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == gui.jButtonLogout){
            GUILogin.autenticado = null;
            JOptionPane.showMessageDialog(null, "Adios!");
            GUI_Catalogo cat = new GUI_Catalogo();
            OCatalogo con = new OCatalogo(cat);
            cat.setVisible(true);
            gui.setVisible(false);
        }
    }
}
