package View.GUIS_AyU;

import Controller.OCatalogo.OCatalogo;
import Controller.OReseñas.OResenias_Videojuego;
import View.GUIS_Catalogo.GUI_Catalogo;
import View.GUIS_Resenias.GUI_Mis_Resenias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thann
 */
public class GUI_MiPerfil extends javax.swing.JFrame {

    /**
     * Creates new form GUI_MiPerfil
     */
    public GUI_MiPerfil() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(72, 72, 72));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegresar = new javax.swing.JButton();
        jLabelMETRIK = new javax.swing.JLabel();
        jLabelGEEK = new javax.swing.JLabel();
        jLabelMETRIK1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonMisReseñas = new javax.swing.JButton();
        jLabelMETRIK2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPassword1 = new javax.swing.JLabel();
        jLabelPassword2 = new javax.swing.JLabel();
        jTextFieldApellP = new javax.swing.JTextField();
        jTextFieldApellM = new javax.swing.JTextField();
        jLabelPassword3 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldMail = new javax.swing.JTextField();
        jLabelPassword7 = new javax.swing.JLabel();
        jLabelPassword8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRegresar.setBackground(new java.awt.Color(186, 126, 255));
        jButtonRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

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

        jLabelMETRIK1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMETRIK1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMETRIK1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMETRIK1.setText("@usuario");
        jLabelMETRIK1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Imagen");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonMisReseñas.setBackground(new java.awt.Color(186, 126, 255));
        jButtonMisReseñas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonMisReseñas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMisReseñas.setText("Mis reseñas");
        jButtonMisReseñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMisReseñasActionPerformed(evt);
            }
        });

        jLabelMETRIK2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMETRIK2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMETRIK2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMETRIK2.setText("Mi Perfil");
        jLabelMETRIK2.setToolTipText("");

        jTextFieldNombre.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setToolTipText("");
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabelPassword1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword1.setText("Nombre");
        jLabelPassword1.setToolTipText("ff");

        jLabelPassword2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword2.setText("Apellido P");
        jLabelPassword2.setToolTipText("ff");

        jTextFieldApellP.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldApellP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldApellP.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldApellP.setToolTipText("");
        jTextFieldApellP.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldApellP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellPActionPerformed(evt);
            }
        });

        jTextFieldApellM.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldApellM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldApellM.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldApellM.setToolTipText("");
        jTextFieldApellM.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldApellM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellMActionPerformed(evt);
            }
        });

        jLabelPassword3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword3.setText("Apellido M");
        jLabelPassword3.setToolTipText("ff");

        jButtonActualizar.setBackground(new java.awt.Color(104, 164, 255));
        jButtonActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextFieldMail.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldMail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldMail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldMail.setToolTipText("");
        jTextFieldMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMailActionPerformed(evt);
            }
        });

        jLabelPassword7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword7.setText("email");
        jLabelPassword7.setToolTipText("ff");

        jLabelPassword8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword8.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword8.setText("Bio");
        jLabelPassword8.setToolTipText("ff");

        jTextAreaBio.setBackground(new java.awt.Color(91, 91, 91));
        jTextAreaBio.setColumns(20);
        jTextAreaBio.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaBio.setRows(3);
        jTextAreaBio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane1.setViewportView(jTextAreaBio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(258, 258, 258)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMETRIK1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(264, 264, 264))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelGEEK)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelMETRIK)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelMETRIK2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(jButtonMisReseñas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelPassword7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelPassword3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldApellM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPassword2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldApellP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGEEK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMETRIK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMETRIK2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButtonMisReseñas))
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMETRIK1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE))
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

    private void jButtonMisReseñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMisReseñasActionPerformed
        // TODO add your handling code here:
        GUI_Mis_Resenias guiMR = new GUI_Mis_Resenias();
        OResenias_Videojuego con = new OResenias_Videojuego(guiMR);
        guiMR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMisReseñasActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellPActionPerformed

    private void jTextFieldApellMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellMActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMailActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_MiPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonActualizar;
    public javax.swing.JButton jButtonMisReseñas;
    public javax.swing.JButton jButtonRegresar;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGEEK;
    private javax.swing.JLabel jLabelMETRIK;
    public javax.swing.JLabel jLabelMETRIK1;
    private javax.swing.JLabel jLabelMETRIK2;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPassword2;
    private javax.swing.JLabel jLabelPassword3;
    private javax.swing.JLabel jLabelPassword7;
    private javax.swing.JLabel jLabelPassword8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaBio;
    public javax.swing.JTextField jTextFieldApellM;
    public javax.swing.JTextField jTextFieldApellP;
    public javax.swing.JTextField jTextFieldMail;
    public javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
