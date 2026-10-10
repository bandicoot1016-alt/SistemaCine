/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cine;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
/**
 *
 * @author user
 */
public class SeleccionarAsientos extends javax.swing.JFrame {
    
    private ArrayList<Asiento> asientos;
    
    private Funcion funcion;
    
    private ArrayList<Asiento> asientosSeleccionados = new ArrayList<>();
    
    private boolean incluyeComida = false;
    
    private void mostrarAsientos() {
    jPanel1.setLayout(new java.awt.GridLayout(0, 10, 8, 8));
    jPanel1.removeAll();

    if (asientos == null) {
        return;
    }

    for (Asiento asiento : asientos) {

        JButton boton = new JButton(
            asiento.getFila() + asiento.getNumero()
        );

        boton.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 11));
        boton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        boton.setFocusPainted(false);
        boton.setOpaque(true);

        // ASIENTO DISPONIBLE
        boton.setBackground(new java.awt.Color(50, 160, 80));
        boton.setForeground(java.awt.Color.WHITE);

        // ASIENTO OCUPADO
        if (asiento.isOcupado()) {
            boton.setEnabled(false);
            boton.setBackground(new java.awt.Color(180, 40, 40));
            boton.setForeground(java.awt.Color.WHITE);
        }

        boton.addActionListener(e -> {

            if (asientosSeleccionados.contains(asiento)) {

                asientosSeleccionados.remove(asiento);

                boton.setText(
                    asiento.getFila() + asiento.getNumero()
                );

                boton.setBackground(
                    new java.awt.Color(50, 160, 80)
                );

            } else {

                asientosSeleccionados.add(asiento);

                boton.setText("✓");

                boton.setBackground(
                    new java.awt.Color(50, 100, 200)
                );
            }

            String seleccionados = "";

            for (Asiento seleccionado : asientosSeleccionados) {

                if (!seleccionados.isEmpty()) {
                    seleccionados += ", ";
                }

                seleccionados += seleccionado.getFila()
                        + seleccionado.getNumero();
            }

            jTextField1.setText(seleccionados);
        });

        jPanel1.add(boton);
    }

    jPanel1.revalidate();
    jPanel1.repaint();
}
    
    public void cargarAsientos(ArrayList<Asiento> asientos) {
    this.asientos = asientos;
    mostrarAsientos();
}
    public void cargarFuncion(Funcion funcion) {
        this.funcion = funcion;
    this.asientos = funcion.getAsientos();
    mostrarAsientos();
}
    public void activarCompraConComida() {
    this.incluyeComida = true;
}
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SeleccionarAsientos.class.getName());

    /**
     * Creates new form SeleccionarAsientos
     */
    
public SeleccionarAsientos() {
    initComponents();

    getContentPane().setBackground(new java.awt.Color(25, 25, 25));

    setIconImage(new javax.swing.ImageIcon(
        getClass().getResource("/com/cine/claqueta.png")
    ).getImage());

    // Crear el panel que agrupa los componentes
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setOpaque(false);
    panel.setLayout(new javax.swing.BoxLayout(
        panel, javax.swing.BoxLayout.Y_AXIS
    ));

    // Centrar horizontalmente los componentes
    jLabel1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel2.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jPanel1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel3.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jTextField1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnContinuar.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnVolver.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

    // Organizar el contenido de arriba hacia abajo
    panel.add(jLabel1);
    panel.add(javax.swing.Box.createVerticalStrut(20));
    panel.add(jLabel2);
    panel.add(javax.swing.Box.createVerticalStrut(15));
    panel.add(jPanel1);
    panel.add(javax.swing.Box.createVerticalStrut(15));
    panel.add(jLabel3);
    panel.add(jTextField1);
    panel.add(javax.swing.Box.createVerticalStrut(20));
    panel.add(btnContinuar);
    panel.add(javax.swing.Box.createVerticalStrut(10));
    panel.add(btnVolver);

    // Centrar el conjunto en la ventana
    getContentPane().removeAll();
    getContentPane().setLayout(new java.awt.GridBagLayout());
    getContentPane().add(panel);

    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 540));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 20, 40));
        jLabel1.setText("SELECCIONAR ASIENTOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Asientos seleccionados:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(245, 245, 245));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(20, 20, 20));
        jTextField1.setText("Ningun asiento seleccionado");

        btnContinuar.setBackground(new java.awt.Color(180, 20, 35));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setFocusPainted(false);
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuarMouseExited(evt);
            }
        });
        btnContinuar.addActionListener(this::btnContinuarActionPerformed);

        btnVolver.setBackground(new java.awt.Color(100, 20, 25));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setFocusPainted(false);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(180, 180, 180));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 20, 20));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PANTALLA");
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(350, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnContinuar)
                            .addComponent(btnVolver))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
SeleccionarPelicula ventana = new SeleccionarPelicula();
ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
if (asientosSeleccionados.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Selecciona al menos un asiento.");
    return;
}

String pelicula = funcion.getPelicula().getNombre();
String sala = String.valueOf(funcion.getSala().getNumero());
String funcionTexto = funcion.getFecha() + " - " + funcion.getHora();

String asientosTexto = "";

for (Asiento asiento : asientosSeleccionados) {
    if (!asientosTexto.isEmpty()) {
        asientosTexto += ", ";
    }
    asientosTexto += asiento.getFila() + asiento.getNumero();
}

DatosCliente ventana = new DatosCliente();
ventana.cargarDatosVenta(pelicula, sala, funcionTexto, asientosTexto, funcion, 0);

if (incluyeComida) {
    ventana.activarCompraConComida();
}

ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
btnContinuar.setBackground(new java.awt.Color(220, 20, 40));    }//GEN-LAST:event_btnContinuarMouseEntered

    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
btnContinuar.setBackground(new java.awt.Color(180, 20, 35));    }//GEN-LAST:event_btnContinuarMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
btnVolver.setBackground(new java.awt.Color(180, 20, 35));    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
btnVolver.setBackground(new java.awt.Color(100, 20, 25));    }//GEN-LAST:event_btnVolverMouseExited

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SeleccionarAsientos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
