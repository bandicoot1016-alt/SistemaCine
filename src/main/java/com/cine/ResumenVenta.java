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
public class ResumenVenta extends javax.swing.JFrame {
    private String pelicula;
private String sala;
private String funcion;
private String asientos;
private String cliente;
private String documento;
private String edad;
private String estudiante;
private Funcion funcionSeleccionada;
private ArrayList<Cliente> clientes;
private ArrayList<Double> precios;
private ArrayList<DetalleCompra> detallesCompra;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ResumenVenta.class.getName());

    /**
     * Creates new form ResumenVenta
     */
    public ResumenVenta() {
        initComponents();
    }
public void cargarDatos(String pelicula, String sala, String funcion, String asientos, ArrayList<Cliente> clientes, ArrayList<Double> precios, Funcion funcionSeleccionada) {
    this.pelicula = pelicula;
    this.sala = sala;
    this.funcion = funcion;
    this.asientos = asientos;
    this.clientes = clientes;
    this.precios = precios;
    this.funcionSeleccionada = funcionSeleccionada;

    String[] listaAsientos = asientos.split(", ");

    String texto = "";

    texto += "PELÍCULA: " + pelicula + "\n";
    texto += "SALA: " + sala + "\n";
    texto += "FUNCIÓN: " + funcion + "\n";
    texto += "ASIENTOS: " + asientos + "\n\n";

    double total = 0;

    for (int i = 0; i < clientes.size(); i++) {
        Cliente cliente = clientes.get(i);
        double precio = precios.get(i);

        texto += "CLIENTE " + (i + 1);

        if (i < listaAsientos.length) {
            texto += " - ASIENTO " + listaAsientos[i];
        }

        texto += "\n";
        texto += "Nombre: " + cliente.getNombre() + "\n";
        texto += "Documento: " + cliente.getDocumento() + "\n";
        texto += "Edad: " + cliente.getEdad() + "\n";
        texto += "Estudiante: " + (cliente.isEstudiante() ? "Sí" : "No") + "\n";
        texto += "Precio: $" + String.format("%,.0f", precio) + "\n\n";

        total += precio;
    }
    
    

    texto += "TOTAL: $" + String.format("%,.0f", total);

    txtResumen.setText(texto);
}
public void cargarDatosComida(ArrayList<DetalleCompra> detallesCompra) {
    this.detallesCompra = detallesCompra;
    String texto = "";

    texto += "COMIDA\n\n";

    double total = 0;

    for (DetalleCompra detalle : detallesCompra) {
        texto += detalle.getProducto().getNombre();
        texto += " x" + detalle.getCantidad();
        texto += " - $" + String.format("%,.0f", detalle.getSubtotal());
        texto += "\n";

        total += detalle.getSubtotal();
    }

    texto += "\nTOTAL COMIDA: $" + String.format("%,.0f", total);

    txtResumen.setText(texto);
}
public void cargarDatosBoletasYComida(
        String pelicula,
        String sala,
        String funcion,
        String asientos,
        Funcion funcionSeleccionada,
        ArrayList<Cliente> clientes,
        ArrayList<Double> precios,
        ArrayList<DetalleCompra> detallesCompra) {

    this.pelicula = pelicula;
    this.sala = sala;
    this.funcion = funcion;
    this.asientos = asientos;
    this.funcionSeleccionada = funcionSeleccionada;
    this.clientes = clientes;
    this.precios = precios;
    this.detallesCompra = detallesCompra;

    String[] listaAsientos = asientos.split(", ");

    String texto = "";

    texto += "========== BOLETAS ==========\n\n";
    texto += "PELÍCULA: " + pelicula + "\n";
    texto += "SALA: " + sala + "\n";
    texto += "FUNCIÓN: " + funcion + "\n";
    texto += "ASIENTOS: " + asientos + "\n\n";

    double totalBoletas = 0;

    for (int i = 0; i < clientes.size(); i++) {
        Cliente cliente = clientes.get(i);
        double precio = precios.get(i);

        texto += "CLIENTE " + (i + 1);

        if (i < listaAsientos.length) {
            texto += " - ASIENTO " + listaAsientos[i];
        }

        texto += "\n";
        texto += "Nombre: " + cliente.getNombre() + "\n";
        texto += "Documento: " + cliente.getDocumento() + "\n";
        texto += "Edad: " + cliente.getEdad() + "\n";
        texto += "Estudiante: " + (cliente.isEstudiante() ? "Sí" : "No") + "\n";
        texto += "Precio: $" + String.format("%,.0f", precio) + "\n\n";

        totalBoletas += precio;
    }

    texto += "TOTAL BOLETAS: $" + String.format("%,.0f", totalBoletas);
    texto += "\n\n";

    texto += "========== COMIDA ==========\n\n";

    double totalComida = 0;

    for (DetalleCompra detalle : detallesCompra) {
        texto += detalle.getProducto().getNombre();
        texto += " x" + detalle.getCantidad();
        texto += " - $" + String.format("%,.0f", detalle.getSubtotal());
        texto += "\n";

        totalComida += detalle.getSubtotal();
    }

    texto += "\nTOTAL COMIDA: $" + String.format("%,.0f", totalComida);
    texto += "\n\n";

    double totalVenta = totalBoletas + totalComida;

    texto += "============================\n";
    texto += "TOTAL DE LA VENTA: $" + String.format("%,.0f", totalVenta);

    txtResumen.setText(texto);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RESUMEN DE VENTA");

        jButton1.setText("Confirmar venta");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Volver");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        txtResumen.setEditable(false);
        txtResumen.setColumns(20);
        txtResumen.setLineWrap(true);
        txtResumen.setRows(5);
        txtResumen.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtResumen);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(249, 249, 249)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
DatosCliente ventana = new DatosCliente();

String[] listaAsientos = asientos.split(", ");

int ultimoCliente = DatosCliente.obtenerCantidadClientes() - 1;

if (ultimoCliente >= 0 && ultimoCliente < listaAsientos.length) {
    Cliente clienteActual = DatosCliente.obtenerCliente(ultimoCliente);

    ventana.cargarDatosVenta(
        pelicula,
        sala,
        funcion,
        asientos,
        clienteActual.getNombre(),
        clienteActual.getDocumento(),
        String.valueOf(clienteActual.getEdad()),
        clienteActual.isEstudiante() ? "Sí" : "No"
    );
}

ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String[] listaAsientos = asientos != null ? asientos.split(", ") : new String[0];

Venta venta = new Venta();

if (clientes != null && precios != null && funcionSeleccionada != null) {

    for (int i = 0; i < clientes.size(); i++) {

        if (i >= listaAsientos.length) {
            break;
        }

        Cliente cliente = clientes.get(i);
        double precio = precios.get(i);
        String codigoAsiento = listaAsientos[i];

        for (Asiento asiento : funcionSeleccionada.getAsientos()) {

            String codigo = asiento.getFila() + asiento.getNumero();

            if (codigo.equals(codigoAsiento)) {

                asiento.setOcupado(true);

                Boleta boleta = new Boleta(
                    cliente,
                    funcionSeleccionada,
                    asiento,
                    precio
                );

                venta.agregarBoleta(boleta);
                DatosCine.boletas.add(boleta);

                break;
            }
        }
    }
}

if (detallesCompra != null) {

    for (DetalleCompra detalle : detallesCompra) {
        venta.agregarDetalleCompra(detalle);
    }
}

DatosCine.ventas.add(venta);

JOptionPane.showMessageDialog(
    this,
    "Venta confirmada correctamente."
);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
VentanaPrincipal ventana = new VentanaPrincipal();
ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ResumenVenta().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResumen;
    // End of variables declaration//GEN-END:variables
}
