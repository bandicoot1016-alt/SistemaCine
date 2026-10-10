/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cine;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class SeleccionarComida extends javax.swing.JFrame {
    private ArrayList<DetalleCompra> detallesCompra = new ArrayList<>();
    private Venta venta;
private boolean vieneDeBoletas = false;

private String pelicula;
private String sala;
private String funcion;
private String asientos;
private Funcion funcionSeleccionada;
private ArrayList<Cliente> clientes;
private ArrayList<Double> precios;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SeleccionarComida.class.getName());

    /**
     * Creates new form SeleccionarComida
     */
    
public SeleccionarComida() {
    initComponents();
    
    jSpinner1.setModel(
    new javax.swing.SpinnerNumberModel(1, 1, 100, 1)
);

    
        // Fondo oscuro de cine
        getContentPane().setBackground(new java.awt.Color(20, 20, 20));

        // Títulos y etiquetas
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        jLabel1.setForeground(new java.awt.Color(220, 20, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        jLabel2.setForeground(java.awt.Color.WHITE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        jLabel3.setForeground(java.awt.Color.WHITE);

        // Lista de productos
        jComboBox1.setBackground(new java.awt.Color(40, 40, 40));
        jComboBox1.setForeground(java.awt.Color.WHITE);
        jComboBox1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));

        // Selector de cantidad
        jSpinner1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        jSpinner1.setBackground(new java.awt.Color(40, 40, 40));

        // Botón agregar
        btnAgregar.setBackground(new java.awt.Color(220, 20, 40));
        btnAgregar.setForeground(java.awt.Color.WHITE);
        btnAgregar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Botón quitar
        btnQuitar.setBackground(new java.awt.Color(130, 20, 30));
        btnQuitar.setForeground(java.awt.Color.WHITE);
        btnQuitar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnQuitar.setFocusPainted(false);
        btnQuitar.setBorderPainted(false);
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Botón continuar
        btnContinuar.setBackground(new java.awt.Color(220, 20, 40));
        btnContinuar.setForeground(java.awt.Color.WHITE);
        btnContinuar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnContinuar.setFocusPainted(false);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Botón volver
        btnVolver.setBackground(new java.awt.Color(70, 70, 70));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnVolver.setFocusPainted(false);
        btnVolver.setBorderPainted(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Resumen del pedido
        txtPedido.setBackground(new java.awt.Color(30, 30, 30));
        txtPedido.setForeground(java.awt.Color.WHITE);
        txtPedido.setFont(new java.awt.Font("Consolas", java.awt.Font.PLAIN, 13));
        txtPedido.setCaretColor(java.awt.Color.WHITE);


    setIconImage(new javax.swing.ImageIcon(
        getClass().getResource("/com/cine/claqueta.png")
    ).getImage());

    // Centrar horizontalmente los componentes
    jLabel1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel2.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel3.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jComboBox1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jSpinner1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtPedido.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnAgregar.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnQuitar.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnVolver.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnContinuar.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

    // Crear el panel de contenido
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setOpaque(false);
    panel.setLayout(new javax.swing.BoxLayout(
        panel, javax.swing.BoxLayout.Y_AXIS
    ));

    // Organizar los componentes verticalmente
    panel.add(jLabel1);
    panel.add(javax.swing.Box.createVerticalStrut(20));
    panel.add(jLabel2);
    panel.add(jComboBox1);
    panel.add(javax.swing.Box.createVerticalStrut(12));
    panel.add(jLabel3);
    panel.add(jSpinner1);
    panel.add(javax.swing.Box.createVerticalStrut(15));
panel.add(txtPedido);
    panel.add(javax.swing.Box.createVerticalStrut(20));
    
    panel.add(btnAgregar);
    panel.add(javax.swing.Box.createVerticalStrut(10));
    panel.add(btnQuitar);
    panel.add(javax.swing.Box.createVerticalStrut(25));
    panel.add(btnContinuar);
    panel.add(javax.swing.Box.createVerticalStrut(10));
    panel.add(btnVolver);

    // Centrar el conjunto en la ventana
    getContentPane().removeAll();
    getContentPane().setLayout(new java.awt.GridBagLayout());
    getContentPane().add(panel);

    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
}

public void cargarVenta(Venta venta) {
    this.venta = venta;
    this.vieneDeBoletas = true;
}
public void cargarDatosBoletas(String pelicula, String sala, String funcion, String asientos, Funcion funcionSeleccionada, ArrayList<Cliente> clientes, ArrayList<Double> precios) {
    this.pelicula = pelicula;
    this.sala = sala;
    this.funcion = funcion;
    this.asientos = asientos;
    this.funcionSeleccionada = funcionSeleccionada;
    this.clientes = clientes;
    this.precios = precios;
    this.vieneDeBoletas = true;
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPedido = new javax.swing.JTextArea();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SELECCIONAR COMIDA");

        jLabel2.setText("Producto:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto", "Crispetas - $10.000", "Gaseosa - $5.000", "Perro caliente - $12.000", "Combo - $18.000" }));

        jLabel3.setText("Cantidad:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        txtPedido.setColumns(20);
        txtPedido.setRows(5);
        jScrollPane1.setViewportView(txtPedido);

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(this::btnContinuarActionPerformed);

        btnVolver.setText("Volver");

        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(this::btnQuitarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnAgregar))
                                            .addComponent(jComboBox1, 0, 1, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnQuitar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnQuitar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnContinuar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
String productoSeleccionado = jComboBox1.getSelectedItem().toString();

if (productoSeleccionado.equals("Seleccionar producto")) {
    javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un producto.");
    return;
}

int cantidad = (int) jSpinner1.getValue();

if (cantidad <= 0) {
    JOptionPane.showMessageDialog(
        this,
        "La cantidad debe ser mayor que 0.",
        "Cantidad inválida",
        JOptionPane.WARNING_MESSAGE
    );
    return;
}

double precioUnitario = 0;

if (productoSeleccionado.equals("Crispetas - $10.000")) {
    precioUnitario = 10000;
} else if (productoSeleccionado.equals("Gaseosa - $5.000")) {
    precioUnitario = 5000;
} else if (productoSeleccionado.equals("Perro caliente - $12.000")) {
    precioUnitario = 12000;
} else if (productoSeleccionado.equals("Combo - $18.000")) {
    precioUnitario = 18000;
}

String nombreProducto = productoSeleccionado.split(" - ")[0];

Producto producto = new Producto(nombreProducto, precioUnitario);
DetalleCompra detalle = new DetalleCompra(producto, cantidad);
detallesCompra.add(detalle);

txtPedido.append(
    nombreProducto + " x" + cantidad +
    " - $" + String.format("%,.0f", detalle.getSubtotal()) + "\n"
);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
try {
    int linea = txtPedido.getLineOfOffset(txtPedido.getCaretPosition());

    if (linea < 0 || linea >= detallesCompra.size()) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Selecciona un producto del pedido para quitarlo."
        );
        return;
    }

    detallesCompra.remove(linea);

    String[] lineas = txtPedido.getText().split("\n");
    String nuevoTexto = "";

    for (int i = 0; i < lineas.length; i++) {
        if (i != linea) {
            nuevoTexto += lineas[i] + "\n";
        }
    }

    txtPedido.setText(nuevoTexto);

} catch (javax.swing.text.BadLocationException e) {
    javax.swing.JOptionPane.showMessageDialog(
        this,
        "No se pudo quitar el producto."
    );
}
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
if (detallesCompra.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this, "Agrega al menos un producto.");
    return;
}

ResumenVenta ventana = new ResumenVenta();

if (vieneDeBoletas) {
    ventana.cargarDatosBoletasYComida(
        pelicula,
        sala,
        funcion,
        asientos,
        funcionSeleccionada,
        clientes,
        precios,
        detallesCompra
    );
} else {
    ventana.cargarDatosComida(detallesCompra);
}

ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new SeleccionarComida().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea txtPedido;
    // End of variables declaration//GEN-END:variables
}
