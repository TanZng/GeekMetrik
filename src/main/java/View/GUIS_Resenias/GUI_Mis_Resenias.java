/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIS_Resenias;

import View.GUIS_AyU.GUI_MiPerfil;

/**
 *
 * @author thann
 */
public class GUI_Mis_Resenias extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Mis_Resenias
     */
    public GUI_Mis_Resenias() {
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
        jLabelGEEK = new javax.swing.JLabel();
        jLabelMETRIK2 = new javax.swing.JLabel();
        jLabelMETRIK = new javax.swing.JLabel();
        jLabelPassword1 = new javax.swing.JLabel();
        jTextFieldVideojuego = new javax.swing.JTextField();
        jLabelPassword2 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelPassword8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaContenido = new javax.swing.JTextArea();
        jLabelPassword3 = new javax.swing.JLabel();
        jTextFieldEstrellas = new javax.swing.JTextField();
        jTextFieldLikes = new javax.swing.JTextField();
        jLabelPassword4 = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRes = new javax.swing.JTable();

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

        jLabelGEEK.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelGEEK.setForeground(new java.awt.Color(104, 164, 255));
        jLabelGEEK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGEEK.setText("Geek");
        jLabelGEEK.setToolTipText("");

        jLabelMETRIK2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMETRIK2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMETRIK2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMETRIK2.setText("Mis Reseñas");
        jLabelMETRIK2.setToolTipText("");

        jLabelMETRIK.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMETRIK.setForeground(new java.awt.Color(186, 126, 255));
        jLabelMETRIK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMETRIK.setText("Metrik");
        jLabelMETRIK.setToolTipText("");

        jLabelPassword1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword1.setText("Videojuego");
        jLabelPassword1.setToolTipText("ff");

        jTextFieldVideojuego.setEditable(false);
        jTextFieldVideojuego.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldVideojuego.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldVideojuego.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldVideojuego.setToolTipText("");
        jTextFieldVideojuego.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldVideojuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVideojuegoActionPerformed(evt);
            }
        });

        jLabelPassword2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword2.setText("Titulo");
        jLabelPassword2.setToolTipText("ff");

        jTextFieldTitulo.setEditable(false);
        jTextFieldTitulo.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTitulo.setToolTipText("");
        jTextFieldTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jLabelPassword8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword8.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword8.setText("Contenido");
        jLabelPassword8.setToolTipText("ff");

        jTextAreaContenido.setEditable(false);
        jTextAreaContenido.setBackground(new java.awt.Color(91, 91, 91));
        jTextAreaContenido.setColumns(20);
        jTextAreaContenido.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaContenido.setRows(3);
        jTextAreaContenido.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane1.setViewportView(jTextAreaContenido);

        jLabelPassword3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword3.setText("Estrellas");
        jLabelPassword3.setToolTipText("ff");

        jTextFieldEstrellas.setEditable(false);
        jTextFieldEstrellas.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldEstrellas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEstrellas.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEstrellas.setToolTipText("");
        jTextFieldEstrellas.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldEstrellas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstrellasActionPerformed(evt);
            }
        });

        jTextFieldLikes.setEditable(false);
        jTextFieldLikes.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldLikes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldLikes.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldLikes.setToolTipText("");
        jTextFieldLikes.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldLikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLikesActionPerformed(evt);
            }
        });

        jLabelPassword4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword4.setText("Likes");
        jLabelPassword4.setToolTipText("ff");

        jButtonEliminar.setBackground(new java.awt.Color(255, 104, 104));
        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("- Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTableRes.setAutoCreateRowSorter(true);
        jTableRes.setBackground(new java.awt.Color(91, 91, 91));
        jTableRes.setForeground(new java.awt.Color(255, 255, 255));
        jTableRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Videojuego", "Titulo", "Contenido", "Estrellas", "Likes"
            }
        ));
        jTableRes.setGridColor(new java.awt.Color(255, 255, 255));
        jTableRes.setSelectionBackground(new java.awt.Color(104, 164, 255));
        jTableRes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTableRes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelGEEK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMETRIK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMETRIK2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldVideojuego)
                                .addGap(155, 155, 155))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPassword4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTitulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGEEK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMETRIK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMETRIK2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        GUI_MiPerfil guiMP = new GUI_MiPerfil();
        guiMP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldVideojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVideojuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVideojuegoActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jTextFieldEstrellasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstrellasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstrellasActionPerformed

    private void jTextFieldLikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLikesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLikesActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Mis_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Mis_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Mis_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Mis_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Mis_Resenias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonEliminar;
    public javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelGEEK;
    private javax.swing.JLabel jLabelMETRIK;
    private javax.swing.JLabel jLabelMETRIK2;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPassword2;
    private javax.swing.JLabel jLabelPassword3;
    private javax.swing.JLabel jLabelPassword4;
    private javax.swing.JLabel jLabelPassword8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTableRes;
    public javax.swing.JTextArea jTextAreaContenido;
    public javax.swing.JTextField jTextFieldEstrellas;
    public javax.swing.JTextField jTextFieldLikes;
    public javax.swing.JTextField jTextFieldTitulo;
    public javax.swing.JTextField jTextFieldVideojuego;
    // End of variables declaration//GEN-END:variables
}