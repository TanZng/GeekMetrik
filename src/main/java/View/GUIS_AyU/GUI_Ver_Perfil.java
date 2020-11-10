package View.GUIS_AyU;

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
public class GUI_Ver_Perfil extends javax.swing.JFrame {

    /**
     * Creates new form GUI_MiPerfil
     */
    public GUI_Ver_Perfil() {
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
        jLabelMETRIK2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBio = new javax.swing.JTextArea();
        jButtonSusRes = new javax.swing.JButton();

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

        jLabelMETRIK2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMETRIK2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMETRIK2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMETRIK2.setText("Ver Perfil");
        jLabelMETRIK2.setToolTipText("");

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setToolTipText("");
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextAreaBio.setEditable(false);
        jTextAreaBio.setBackground(new java.awt.Color(91, 91, 91));
        jTextAreaBio.setColumns(20);
        jTextAreaBio.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaBio.setRows(3);
        jTextAreaBio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane1.setViewportView(jTextAreaBio);

        jButtonSusRes.setBackground(new java.awt.Color(104, 164, 255));
        jButtonSusRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSusRes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSusRes.setText("Sus Reseñas");
        jButtonSusRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSusResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelGEEK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMETRIK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMETRIK2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonSusRes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMETRIK1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))))
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
                    .addComponent(jButtonSusRes))
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMETRIK1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonSusResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSusResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSusResActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Ver_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Ver_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Ver_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Ver_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Ver_Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonRegresar;
    public javax.swing.JButton jButtonSusRes;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGEEK;
    private javax.swing.JLabel jLabelMETRIK;
    public javax.swing.JLabel jLabelMETRIK1;
    private javax.swing.JLabel jLabelMETRIK2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextAreaBio;
    public javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
