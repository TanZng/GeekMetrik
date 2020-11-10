/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIS_Resenias;

import Controller.OCatalogo.OMostrarVideojuego;
import View.GUIS_Catalogo.GUI_Mostrar_Videojuego;

/**
 *
 * @author thann
 */
public class GUI_Ver_Resenias extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Ver_Resenias
     */
    public GUI_Ver_Resenias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(72, 72, 72));
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
        jLabelMETRIK = new javax.swing.JLabel();
        jLabelMETRIK2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelImagen1 = new javax.swing.JLabel();
        jTextFieldTitulo1 = new javax.swing.JTextField();
        jTextFieldEstrellas1 = new javax.swing.JTextField();
        jLabelEstrellas1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaContenido1 = new javax.swing.JTextArea();
        jTextFieldUser1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelImagen2 = new javax.swing.JLabel();
        jTextFieldTitulo2 = new javax.swing.JTextField();
        jTextFieldEstrellas2 = new javax.swing.JTextField();
        jLabelEstrellas2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaContenido2 = new javax.swing.JTextArea();
        jTextFieldUser2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelImagen3 = new javax.swing.JLabel();
        jTextFieldTitulo3 = new javax.swing.JTextField();
        jTextFieldEstrellas3 = new javax.swing.JTextField();
        jLabelEstrellas3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaContenido3 = new javax.swing.JTextArea();
        jTextFieldUser3 = new javax.swing.JTextField();
        jButtonAfter = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();

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

        jLabelMETRIK.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMETRIK.setForeground(new java.awt.Color(186, 126, 255));
        jLabelMETRIK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMETRIK.setText("Metrik");
        jLabelMETRIK.setToolTipText("");

        jLabelMETRIK2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMETRIK2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMETRIK2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMETRIK2.setText("Ver Reseñas");
        jLabelMETRIK2.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(91, 91, 91));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        labelImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen1.setText("Imagen");

        jTextFieldTitulo1.setEditable(false);
        jTextFieldTitulo1.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTitulo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTitulo1.setText("Titulo 1");
        jTextFieldTitulo1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulo1ActionPerformed(evt);
            }
        });

        jTextFieldEstrellas1.setEditable(false);
        jTextFieldEstrellas1.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldEstrellas1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldEstrellas1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEstrellas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEstrellas1.setText("#");
        jTextFieldEstrellas1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldEstrellas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstrellas1ActionPerformed(evt);
            }
        });

        jLabelEstrellas1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEstrellas1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstrellas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstrellas1.setText("Estrellas");
        jLabelEstrellas1.setToolTipText("");

        jTextAreaContenido1.setEditable(false);
        jTextAreaContenido1.setBackground(new java.awt.Color(91, 91, 91));
        jTextAreaContenido1.setColumns(20);
        jTextAreaContenido1.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaContenido1.setRows(5);
        jScrollPane1.setViewportView(jTextAreaContenido1);

        jTextFieldUser1.setEditable(false);
        jTextFieldUser1.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldUser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUser1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUser1.setText("@User");
        jTextFieldUser1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(labelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEstrellas1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jTextFieldEstrellas1))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldEstrellas1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstrellas1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(91, 91, 91));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        labelImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen2.setText("Imagen");

        jTextFieldTitulo2.setEditable(false);
        jTextFieldTitulo2.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTitulo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTitulo2.setText("Titulo 2");
        jTextFieldTitulo2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTitulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulo2ActionPerformed(evt);
            }
        });

        jTextFieldEstrellas2.setEditable(false);
        jTextFieldEstrellas2.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldEstrellas2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldEstrellas2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEstrellas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEstrellas2.setText("#");
        jTextFieldEstrellas2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldEstrellas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstrellas2ActionPerformed(evt);
            }
        });

        jLabelEstrellas2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEstrellas2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstrellas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstrellas2.setText("Estrellas");
        jLabelEstrellas2.setToolTipText("");

        jTextAreaContenido2.setEditable(false);
        jTextAreaContenido2.setBackground(new java.awt.Color(91, 91, 91));
        jTextAreaContenido2.setColumns(20);
        jTextAreaContenido2.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaContenido2.setRows(5);
        jScrollPane2.setViewportView(jTextAreaContenido2);

        jTextFieldUser2.setEditable(false);
        jTextFieldUser2.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldUser2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUser2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUser2.setText("@User");
        jTextFieldUser2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUser2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(labelImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEstrellas2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jTextFieldEstrellas2))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldEstrellas2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstrellas2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(91, 91, 91));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        labelImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen3.setText("Imagen");

        jTextFieldTitulo3.setEditable(false);
        jTextFieldTitulo3.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldTitulo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTitulo3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTitulo3.setText("Titulo 3");
        jTextFieldTitulo3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldTitulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulo3ActionPerformed(evt);
            }
        });

        jTextFieldEstrellas3.setEditable(false);
        jTextFieldEstrellas3.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldEstrellas3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldEstrellas3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEstrellas3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEstrellas3.setText("#");
        jTextFieldEstrellas3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldEstrellas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstrellas3ActionPerformed(evt);
            }
        });

        jLabelEstrellas3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEstrellas3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstrellas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstrellas3.setText("Estrellas");
        jLabelEstrellas3.setToolTipText("");

        jTextAreaContenido3.setEditable(false);
        jTextAreaContenido3.setBackground(new java.awt.Color(91, 91, 91));
        jTextAreaContenido3.setColumns(20);
        jTextAreaContenido3.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaContenido3.setRows(5);
        jScrollPane3.setViewportView(jTextAreaContenido3);

        jTextFieldUser3.setEditable(false);
        jTextFieldUser3.setBackground(new java.awt.Color(91, 91, 91));
        jTextFieldUser3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUser3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUser3.setText("@User");
        jTextFieldUser3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldUser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUser3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(labelImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEstrellas3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jTextFieldEstrellas3))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldEstrellas3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstrellas3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jButtonAfter.setBackground(new java.awt.Color(104, 164, 255));
        jButtonAfter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAfter.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAfter.setText("<");
        jButtonAfter.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jButtonAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAfterActionPerformed(evt);
            }
        });

        jButtonNext.setBackground(new java.awt.Color(104, 164, 255));
        jButtonNext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonNext.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNext.setText(">");
        jButtonNext.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonRegresar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelGEEK)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelMETRIK)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelMETRIK2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jButtonAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGEEK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMETRIK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMETRIK2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        GUI_Mostrar_Videojuego gui = new GUI_Mostrar_Videojuego();
        OMostrarVideojuego con = new OMostrarVideojuego(gui.v, gui);
        gui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldTitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitulo1ActionPerformed

    private void jTextFieldEstrellas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstrellas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstrellas1ActionPerformed

    private void jTextFieldUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUser1ActionPerformed

    private void jTextFieldTitulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitulo2ActionPerformed

    private void jTextFieldEstrellas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstrellas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstrellas2ActionPerformed

    private void jTextFieldUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUser2ActionPerformed

    private void jTextFieldTitulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitulo3ActionPerformed

    private void jTextFieldEstrellas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstrellas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstrellas3ActionPerformed

    private void jTextFieldUser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUser3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUser3ActionPerformed

    private void jButtonAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAfterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAfterActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNextActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Ver_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Ver_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Ver_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Ver_Resenias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Ver_Resenias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAfter;
    public javax.swing.JButton jButtonNext;
    public javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelEstrellas1;
    private javax.swing.JLabel jLabelEstrellas2;
    private javax.swing.JLabel jLabelEstrellas3;
    private javax.swing.JLabel jLabelGEEK;
    private javax.swing.JLabel jLabelMETRIK;
    private javax.swing.JLabel jLabelMETRIK2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaContenido1;
    private javax.swing.JTextArea jTextAreaContenido2;
    private javax.swing.JTextArea jTextAreaContenido3;
    public javax.swing.JTextField jTextFieldEstrellas1;
    public javax.swing.JTextField jTextFieldEstrellas2;
    public javax.swing.JTextField jTextFieldEstrellas3;
    public javax.swing.JTextField jTextFieldTitulo1;
    public javax.swing.JTextField jTextFieldTitulo2;
    public javax.swing.JTextField jTextFieldTitulo3;
    public javax.swing.JTextField jTextFieldUser1;
    public javax.swing.JTextField jTextFieldUser2;
    public javax.swing.JTextField jTextFieldUser3;
    private javax.swing.JLabel labelImagen1;
    private javax.swing.JLabel labelImagen2;
    private javax.swing.JLabel labelImagen3;
    // End of variables declaration//GEN-END:variables
}
