/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIS_Catalogo;

import Controller.OCatalogo.OCatalogo;
import Controller.OReseñas.OResenias_Videojuego;
import Model.Catalogo.Videojuego;
import Model.Resenias_Videojuego.Resenia;
import View.GUIS_AyU.GUILogin;
import View.GUIS_Resenias.GUI_EscribirResenia;
import View.GUIS_Resenias.GUI_Ver_Resenias;

/**
 *
 * @author thann
 */
public class GUI_Mostrar_Videojuego extends javax.swing.JFrame {

    public static Videojuego v;

    /**
     * Creates new form GUI_Mostrar_Videojuego
     */
    public GUI_Mostrar_Videojuego() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(72, 72, 72));
        jTextAreaDesc.setLineWrap(true);
        jTextAreaDesc.setWrapStyleWord(true);
        
        
        if(GUILogin.autenticado != null) {

            if( GUILogin.autenticado.getTipo() == 1 ) {
                this.jButtonSignCrearRes.setEnabled(true);
            }
        }

        else {

            //JOptionPane.showMessageDialog(null, "Hola publico en general!");
            this.jButtonSignCrearRes.setEnabled(false);


        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMETRIK = new javax.swing.JLabel();
        jLabelGEEK = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jTextFieldEstrellas = new javax.swing.JTextField();
        jLabelE = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonSignCrearRes = new javax.swing.JButton();
        jButtonVerRes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMETRIK.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMETRIK.setForeground(new java.awt.Color(186, 126, 255));
        jLabelMETRIK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMETRIK.setText("Metrik");
        jLabelMETRIK.setToolTipText("");

        jLabelGEEK.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelGEEK.setForeground(new java.awt.Color(104, 164, 255));
        jLabelGEEK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGEEK.setText("Geek");
        jLabelGEEK.setToolTipText("");

        jButtonRegresar.setBackground(new java.awt.Color(186, 126, 255));
        jButtonRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Imagen");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextAreaDesc.setEditable(false);
        jTextAreaDesc.setBackground(new java.awt.Color(91, 91, 91));
        jTextAreaDesc.setColumns(5);
        jTextAreaDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDesc.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaDesc.setRows(5);
        jTextAreaDesc.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextAreaDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextAreaDesc);

        jTextFieldEstrellas.setEditable(false);
        jTextFieldEstrellas.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldEstrellas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldEstrellas.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEstrellas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEstrellas.setText("5");
        jTextFieldEstrellas.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldEstrellas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstrellasActionPerformed(evt);
            }
        });

        jLabelE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE.setText("Estrellas");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Titulo");

        jButtonSignCrearRes.setBackground(new java.awt.Color(186, 126, 255));
        jButtonSignCrearRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSignCrearRes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignCrearRes.setText("+ crear reseña");
        jButtonSignCrearRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignCrearResActionPerformed(evt);
            }
        });

        jButtonVerRes.setBackground(new java.awt.Color(104, 164, 255));
        jButtonVerRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonVerRes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerRes.setText("ver reseñas");
        jButtonVerRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelGEEK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMETRIK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jButtonVerRes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonSignCrearRes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGEEK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMETRIK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonRegresar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSignCrearRes)
                    .addComponent(jButtonVerRes))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        GUI_Catalogo gui = new GUI_Catalogo();
        OCatalogo ocat = new OCatalogo(gui);
        gui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldEstrellasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstrellasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstrellasActionPerformed

    private void jButtonSignCrearResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignCrearResActionPerformed
        // TODO add your handling code here:
        GUI_EscribirResenia gui = new GUI_EscribirResenia();
        OResenias_Videojuego con = new OResenias_Videojuego(gui,v);
        gui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSignCrearResActionPerformed

    private void jButtonVerResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerResActionPerformed
        // TODO add your handling code here:
        GUI_Ver_Resenias gui = new GUI_Ver_Resenias();
        OResenias_Videojuego con = new OResenias_Videojuego(gui,v);
        gui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVerResActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Mostrar_Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Mostrar_Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Mostrar_Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Mostrar_Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Mostrar_Videojuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonRegresar;
    public javax.swing.JButton jButtonSignCrearRes;
    public javax.swing.JButton jButtonVerRes;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelE;
    private javax.swing.JLabel jLabelGEEK;
    private javax.swing.JLabel jLabelMETRIK;
    public javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaDesc;
    public javax.swing.JTextField jTextFieldEstrellas;
    // End of variables declaration//GEN-END:variables
}
