/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIS_AyU;

import View.GUIS_Catalogo.GUI_Catalogo;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author thann
 */
public class GUISignUp extends javax.swing.JFrame {

    /**
     * Creates new form GUISignU
     */
    public GUISignUp() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(72, 72, 72));
        resizeImage();
    }
    
    public void resizeImage(){
        ImageIcon icon = new ImageIcon( GUISignUp.class.getResource("/GeekMetrik.png") );
        Image image = icon.getImage();
        Image scale = image.getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scale);
        labelLogo.setIcon(scaledIcon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelGEEK = new javax.swing.JLabel();
        jLabelPassword1 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelPassword2 = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jButtonSignUp = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        jLabelMETRIK = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelGEEK.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelGEEK.setForeground(new java.awt.Color(104, 164, 255));
        jLabelGEEK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGEEK.setText("Geek");
        jLabelGEEK.setToolTipText("");

        jLabelPassword1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword1.setText("eMail");
        jLabelPassword1.setToolTipText("ff");

        jTextFieldUsuario.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setToolTipText("");
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jLabelPassword2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPassword2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword2.setText("Password");
        jLabelPassword2.setToolTipText("ff");

        jLabelUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUser.setText("Username");

        jTextFieldPassword.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPassword.setToolTipText("");
        jTextFieldPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jTextFieldNombre.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setToolTipText("");
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPassword.setText("Nombre");
        jLabelPassword.setToolTipText("ff");

        jButtonSignUp.setBackground(new java.awt.Color(186, 126, 255));
        jButtonSignUp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUp.setText("signup");
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });

        jButtonRegresar.setBackground(new java.awt.Color(104, 164, 255));
        jButtonRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabelMETRIK.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelMETRIK.setForeground(new java.awt.Color(186, 126, 255));
        jLabelMETRIK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMETRIK.setText("Metrik");
        jLabelMETRIK.setToolTipText("");

        jTextFieldMail.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldMail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldMail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldMail.setToolTipText("");
        jTextFieldMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jTextFieldMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelPassword1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabelPassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelGEEK))
                                    .addComponent(jLabelMETRIK))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelGEEK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelMETRIK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButtonSignUp))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSignUpActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        
        GUI_Catalogo gui = new GUI_Catalogo();
        gui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(GUISignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonRegresar;
    public javax.swing.JButton jButtonSignUp;
    public javax.swing.JLabel jLabelGEEK;
    public javax.swing.JLabel jLabelMETRIK;
    public javax.swing.JLabel jLabelPassword;
    public javax.swing.JLabel jLabelPassword1;
    public javax.swing.JLabel jLabelPassword2;
    public javax.swing.JLabel jLabelUser;
    public javax.swing.JTextField jTextFieldMail;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JTextField jTextFieldPassword;
    public javax.swing.JTextField jTextFieldUsuario;
    public javax.swing.JLabel labelLogo;
    // End of variables declaration//GEN-END:variables
}
