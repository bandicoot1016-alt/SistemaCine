/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cine;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DatosCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DatosCliente.class.getName());

    /**
     * Creates new form DatosCliente
     */
    
public DatosCliente() {
    initComponents();
    
    jTextField1.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
jTextField2.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
jTextField3.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));

jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
    javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 120, 120)),
    javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)
));
    jTextField1.setPreferredSize(new java.awt.Dimension(250, 36));
jTextField2.setPreferredSize(new java.awt.Dimension(250, 36));
jTextField3.setPreferredSize(new java.awt.Dimension(250, 36));

jTextField1.setMargin(new java.awt.Insets(0, 6, 0, 6));
jTextField2.setMargin(new java.awt.Insets(0, 6, 0, 6));
jTextField3.setMargin(new java.awt.Insets(0, 6, 0, 6));
        // Aumentar ligeramente la altura de los campos
        java.awt.Dimension tamCampo =
                new java.awt.Dimension(250, 30);

        jTextField1.setPreferredSize(tamCampo);
        jTextField1.setMinimumSize(tamCampo);

        jTextField2.setPreferredSize(tamCampo);
        jTextField2.setMinimumSize(tamCampo);

        jTextField3.setPreferredSize(tamCampo);
        jTextField3.setMinimumSize(tamCampo);

        // Mejorar la legibilidad del texto
        java.awt.Font fuenteCampos =
                new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15);

        jTextField1.setFont(fuenteCampos);
        jTextField2.setFont(fuenteCampos);
        jTextField3.setFont(fuenteCampos);
        
        jTextField1.setMargin(new java.awt.Insets(4, 6, 4, 6));
jTextField2.setMargin(new java.awt.Insets(4, 6, 4, 6));
jTextField3.setMargin(new java.awt.Insets(4, 6, 4, 6));


    
        // Fondo oscuro de cine
        getContentPane().setBackground(new java.awt.Color(20, 20, 20));

        // Título principal
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        jLabel1.setForeground(new java.awt.Color(220, 20, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // Etiquetas de los datos del cliente
        jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        jLabel2.setForeground(java.awt.Color.WHITE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        jLabel3.setForeground(java.awt.Color.WHITE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        jLabel4.setForeground(java.awt.Color.WHITE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        jLabel5.setForeground(java.awt.Color.WHITE);

        // Campos de texto
        java.awt.Color fondoCampos = new java.awt.Color(40, 40, 40);
        java.awt.Color rojoCine = new java.awt.Color(220, 20, 40);

        jTextField1.setBackground(fondoCampos);
        jTextField1.setForeground(java.awt.Color.WHITE);
        jTextField1.setCaretColor(rojoCine);
        jTextField1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));

        jTextField2.setBackground(fondoCampos);
        jTextField2.setForeground(java.awt.Color.WHITE);
        jTextField2.setCaretColor(rojoCine);
        jTextField2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));

        jTextField3.setBackground(fondoCampos);
        jTextField3.setForeground(java.awt.Color.WHITE);
        jTextField3.setCaretColor(rojoCine);
        jTextField3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));

        // Lista desplegable
        jComboBox1.setBackground(fondoCampos);
        jComboBox1.setForeground(java.awt.Color.WHITE);
        jComboBox1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));

        // Botón principal
        jButton1.setBackground(rojoCine);
        jButton1.setForeground(java.awt.Color.WHITE);
        jButton1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        jButton1.setFocusPainted(false);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Botón secundario
        jButton2.setBackground(new java.awt.Color(100, 20, 25));
        jButton2.setForeground(java.awt.Color.WHITE);
        jButton2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        jButton2.setFocusPainted(false);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


    setIconImage(new javax.swing.ImageIcon(
        getClass().getResource("/com/cine/claqueta.png")
    ).getImage());

    // Centrar los componentes horizontalmente
    jLabel1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel2.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jTextField1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel3.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jTextField2.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel4.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jTextField3.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel5.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jComboBox1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jButton1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jButton2.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

    // Crear el panel de contenido
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setOpaque(false);
    panel.setLayout(new javax.swing.BoxLayout(
        panel, javax.swing.BoxLayout.Y_AXIS
    ));

    // Organizar el formulario
    panel.add(jLabel1);
    panel.add(javax.swing.Box.createVerticalStrut(25));
    panel.add(jLabel2);
    panel.add(jTextField1);
    panel.add(javax.swing.Box.createVerticalStrut(12));
    panel.add(jLabel3);
    panel.add(jTextField2);
    panel.add(javax.swing.Box.createVerticalStrut(12));
    panel.add(jLabel4);
    panel.add(jTextField3);
    panel.add(javax.swing.Box.createVerticalStrut(12));
    panel.add(jLabel5);
    panel.add(jComboBox1);
    panel.add(javax.swing.Box.createVerticalStrut(25));
    panel.add(jButton1);
    panel.add(javax.swing.Box.createVerticalStrut(12));
    panel.add(jButton2);

    // Centrar todo el formulario
    getContentPane().removeAll();
    getContentPane().setLayout(new java.awt.GridBagLayout());
    getContentPane().add(panel);

    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
}

    private String pelicula;
private String sala;
private String funcion;
private String asientos;
private Funcion funcionSeleccionada;
private int indicePersona;
private boolean incluyeComida = false;
private static ArrayList<Cliente> clientes = new ArrayList<>();
private static ArrayList<Double> precios = new ArrayList<>();

public static void limpiarDatosVenta() {
    clientes.clear();
    precios.clear();
}
public static int obtenerCantidadClientes() {
    return clientes.size();
}

public static Cliente obtenerCliente(int indice) {
    return clientes.get(indice);
}

public void cargarDatosVenta(String pelicula, String sala, String funcion, String asientos, String nombre, String documento, String edad, String estudiante) {
    this.pelicula = pelicula;
    this.sala = sala;
    this.funcion = funcion;
    this.asientos = asientos;

    jTextField1.setText(nombre);
    jTextField2.setText(documento);
    jTextField3.setText(edad);
    jComboBox1.setSelectedItem(estudiante.equals("Sí") ? "Sí" : "No");
}
public void activarCompraConComida() {
    this.incluyeComida = true;
}

public void cargarDatosVenta(String pelicula, String sala, String funcion, String asientos) {
    this.pelicula = pelicula;
    this.sala = sala;
    this.funcion = funcion;
    this.asientos = asientos;
}

public void cargarDatosVenta(String pelicula, String sala, String funcion, String asientos, Funcion funcionSeleccionada, int indicePersona) {
    this.pelicula = pelicula;
    this.sala = sala;
    this.funcion = funcion;
    this.asientos = asientos;
    this.funcionSeleccionada = funcionSeleccionada;
    this.indicePersona = indicePersona;
    
    String[] listaAsientos = asientos.split(", ");
jLabel1.setText("DATOS DEL CLIENTE - " + listaAsientos[indicePersona]);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATOS DEL CLIENTE");

        jLabel2.setText("Nombre:");

        jTextField1.setPreferredSize(new java.awt.Dimension(200, 25));
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jLabel3.setText("Documento:");

        jTextField2.setPreferredSize(new java.awt.Dimension(200, 25));
        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jLabel4.setText("Edad:");

        jTextField3.setPreferredSize(new java.awt.Dimension(30, 25));

        jLabel5.setText("¿Es estudiante?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sí", "No" }));

        jButton1.setText("Continuar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Volver");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String nombre = jTextField1.getText().trim();
String documento = jTextField2.getText().trim();
String edadTexto = jTextField3.getText().trim();
String estudiante = jComboBox1.getSelectedItem().toString();

if (nombre.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Ingresa el nombre.");
    return;
}

if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
    JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras y espacios.");
    return;
}

if (!documento.matches("\\d{5,}")) {
    JOptionPane.showMessageDialog(this, "El documento debe contener solo números y tener mínimo 5 dígitos.");
    return;
}

int edad;

try {
    edad = Integer.parseInt(edadTexto);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "La edad debe ser un número.");
    return;
}

if (edad <= 0) {
    JOptionPane.showMessageDialog(this, "La edad debe ser mayor que 0.");
    return;
}

if (estudiante.equals("Seleccionar")) {
    JOptionPane.showMessageDialog(this, "Selecciona si eres estudiante.");
    return;
}

Cliente clienteActual = new Cliente(
    nombre,
    documento,
    edad,
    estudiante.equals("Sí")
);

clientes.add(clienteActual);



String[] listaAsientos = asientos.split(", ");

String tipoSala = funcionSeleccionada.getSala().getTipo();

CalculadoraPrecio calculadora = new CalculadoraPrecio();

java.time.LocalDate fechaFuncion = java.time.LocalDate.parse(
    funcionSeleccionada.getFecha(),
    java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")
);

java.time.DayOfWeek dia = fechaFuncion.getDayOfWeek();

boolean finDeSemana = dia == java.time.DayOfWeek.SATURDAY
        || dia == java.time.DayOfWeek.SUNDAY;

double precioIndividual = calculadora.calcularPrecioFinal(
    tipoSala,
    finDeSemana,
    clienteActual
);

precios.add(precioIndividual);

if (indicePersona + 1 < listaAsientos.length) {
    DatosCliente ventana = new DatosCliente();
    ventana.cargarDatosVenta(
        pelicula,
        sala,
        funcion,
        asientos,
        funcionSeleccionada,
        indicePersona + 1
    );
    ventana.setVisible(true);
    this.dispose();
    return;
}

if (incluyeComida) {
    SeleccionarComida ventana = new SeleccionarComida();

    ventana.cargarDatosBoletas(
        pelicula,
        sala,
        funcion,
        asientos,
        funcionSeleccionada,
        clientes,
        precios
    );

    ventana.setVisible(true);
    this.dispose();
    return;
}

ResumenVenta ventana = new ResumenVenta();
ventana.cargarDatos(pelicula, sala, funcion, asientos, clientes, precios, funcionSeleccionada);
ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
SeleccionarAsientos ventana = new SeleccionarAsientos();
ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new DatosCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
