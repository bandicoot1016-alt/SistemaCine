/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cine;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ventas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventas.class.getName());

    /**
     * Creates new form Ventas
     */
    
public Ventas() {
    initComponents();

    
        // Fondo de la ventana
        getContentPane().setBackground(new java.awt.Color(20, 20, 20));

        // Título principal
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        jLabel1.setForeground(new java.awt.Color(220, 20, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // Etiqueta del selector
        jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        jLabel2.setForeground(java.awt.Color.WHITE);

        // Selector de ventas
        cmbVentas.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        cmbVentas.setBackground(new java.awt.Color(40, 40, 40));
        cmbVentas.setForeground(java.awt.Color.WHITE);

        // Área donde se muestra la información de las ventas
        txtVentas.setFont(new java.awt.Font("Consolas", java.awt.Font.PLAIN, 14));
        txtVentas.setBackground(new java.awt.Color(30, 30, 30));
        txtVentas.setForeground(java.awt.Color.WHITE);
        txtVentas.setCaretColor(java.awt.Color.WHITE);

        // Botón para eliminar una venta
        btnEliminarVenta.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        btnEliminarVenta.setBackground(new java.awt.Color(220, 20, 40));
        btnEliminarVenta.setForeground(java.awt.Color.WHITE);
        btnEliminarVenta.setFocusPainted(false);
        btnEliminarVenta.setBorderPainted(false);
        btnEliminarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Botón para volver
        btnVolver.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        btnVolver.setBackground(new java.awt.Color(100, 20, 25));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setFocusPainted(false);
        btnVolver.setBorderPainted(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


    setIconImage(new javax.swing.ImageIcon(
        getClass().getResource("/com/cine/claqueta.png")
    ).getImage());

    // Centrar horizontalmente los componentes
    jLabel1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel2.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    cmbVentas.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtVentas.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnEliminarVenta.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnVolver.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

    // Crear el panel de contenido
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setOpaque(false);
    panel.setLayout(new javax.swing.BoxLayout(
        panel, javax.swing.BoxLayout.Y_AXIS
    ));

    // Organizar los componentes
    panel.add(jLabel1);
    panel.add(javax.swing.Box.createVerticalStrut(20));
    panel.add(jLabel2);
    panel.add(cmbVentas);
    panel.add(javax.swing.Box.createVerticalStrut(15));
    panel.add(txtVentas);
    panel.add(javax.swing.Box.createVerticalStrut(20));
    panel.add(btnEliminarVenta);
    panel.add(javax.swing.Box.createVerticalStrut(12));
    panel.add(btnVolver);

    // Centrar el conjunto en la ventana
    getContentPane().removeAll();
    getContentPane().setLayout(new java.awt.GridBagLayout());
    getContentPane().add(panel);

    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

    // Cargar la información de las ventas
    mostrarVentas();
    cargarVentasCombo();
}

    
    private void cargarVentasCombo() {
    cmbVentas.removeAllItems();

    for (int i = 0; i < DatosCine.ventas.size(); i++) {
        cmbVentas.addItem("Venta " + (i + 1));
    }
}
    
    private void mostrarVentas() {
    txtVentas.setText("");

    if (DatosCine.ventas.isEmpty()) {
        txtVentas.setText("No hay ventas registradas.");
        return;
    }

    int contador = 1;

    for (Venta venta : DatosCine.ventas) {

        txtVentas.append("========== VENTA " + contador + " ==========\n");
        txtVentas.append("Fecha: " + venta.getFecha() + "\n");
        txtVentas.append("Hora: " + venta.getHora() + "\n");

        if (!venta.getBoletas().isEmpty() && !venta.getDetallesCompra().isEmpty()) {
            txtVentas.append("Tipo: BOLETAS + COMIDA\n");
        } else if (!venta.getBoletas().isEmpty()) {
            txtVentas.append("Tipo: BOLETAS\n");
        } else {
            txtVentas.append("Tipo: COMIDA\n");
        }

        if (!venta.getBoletas().isEmpty()) {
            txtVentas.append("\n--- BOLETAS ---\n");

            for (Boleta boleta : venta.getBoletas()) {
                txtVentas.append("Película: " + boleta.getFuncion().getPelicula().getNombre() + "\n");
                txtVentas.append("Sala: " + boleta.getFuncion().getSala().getNumero() + "\n");
                txtVentas.append("Asiento: " + boleta.getAsiento().getFila()
                        + boleta.getAsiento().getNumero() + "\n");
                txtVentas.append("Cliente: " + boleta.getCliente().getNombre() + "\n");
                txtVentas.append("Precio: $" + String.format("%,.0f", boleta.getPrecio()) + "\n");
                txtVentas.append("\n");
            }
        }

        if (!venta.getDetallesCompra().isEmpty()) {
            txtVentas.append("--- COMIDA ---\n");

            for (DetalleCompra detalle : venta.getDetallesCompra()) {
                txtVentas.append("Producto: " + detalle.getProducto().getNombre() + "\n");
                txtVentas.append("Cantidad: " + detalle.getCantidad() + "\n");
                txtVentas.append("Subtotal: $" + String.format("%,.0f", detalle.getSubtotal()) + "\n");
                txtVentas.append("\n");
            }
        }

        txtVentas.append("TOTAL DE LA VENTA: $"
                + String.format("%,.0f", venta.calcularTotal()) + "\n");

        txtVentas.append("====================================\n\n");

        contador++;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVentas = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        cmbVentas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VENTAS REGISTRADAS");

        txtVentas.setColumns(20);
        txtVentas.setRows(5);
        jScrollPane1.setViewportView(txtVentas);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnEliminarVenta.setText("Eliminar venta");
        btnEliminarVenta.addActionListener(this::btnEliminarVentaActionPerformed);

        cmbVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbVentas.addActionListener(this::cmbVentasActionPerformed);

        jLabel2.setText("Seleccionar venta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addGap(70, 70, 70)
                        .addComponent(btnEliminarVenta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbVentas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnEliminarVenta))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
VentanaPrincipal ventana = new VentanaPrincipal();
ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
int indice = cmbVentas.getSelectedIndex();

if (indice == -1) {
    JOptionPane.showMessageDialog(this, "Selecciona una venta para eliminar.");
    return;
}

Venta venta = DatosCine.ventas.get(indice);

int respuesta = JOptionPane.showConfirmDialog(
    this,
    "¿Seguro que deseas eliminar la Venta " + (indice + 1) + "?",
    "Confirmar eliminación",
    JOptionPane.YES_NO_OPTION
);

if (respuesta == JOptionPane.YES_OPTION) {

    for (Boleta boleta : venta.getBoletas()) {
        boleta.getAsiento().setOcupado(false);
        DatosCine.boletas.remove(boleta);
    }

    DatosCine.ventas.remove(indice);

    mostrarVentas();
    cargarVentasCombo();

    JOptionPane.showMessageDialog(
        this,
        "Venta eliminada correctamente.\nLos asientos han quedado disponibles nuevamente."
    );
}
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void cmbVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVentasActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Ventas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtVentas;
    // End of variables declaration//GEN-END:variables
}
