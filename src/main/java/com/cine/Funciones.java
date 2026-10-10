
package com.cine;

import javax.swing.JOptionPane;

public class Funciones extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Funciones.class.getName());

    public Funciones() {
        initComponents();
        
        jScrollPane1.setVerticalScrollBarPolicy(
    javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
);

jScrollPane1.setHorizontalScrollBarPolicy(
    javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
);

jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
txtFuncionesRegistradas.setLineWrap(true);
txtFuncionesRegistradas.setWrapStyleWord(true);
        getContentPane().setBackground(new java.awt.Color(25, 25, 25));
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(
        getClass().getResource("/com/cine/claqueta.png")
        ).getImage());
        
        txtFecha.setText("DD/MM/AAAA");
        txtHora.setText("HH:MM");
        txtDuracion.setText("Ej: 130");
        
        cargarFunciones();
        mostrarFunciones();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        jLabel1.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel2.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtNombre.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel3.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtGenero.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel4.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtDuracion.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel5.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    cmbClasificacion.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel6.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    cmbSala.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel8.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtFecha.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    jLabel9.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtHora.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnAgregar.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    txtFuncionesRegistradas.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    cmbFunciones.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnEliminar.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    btnVolver.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

    // Crear el panel principal
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setMaximumSize(new java.awt.Dimension(750, Integer.MAX_VALUE));
    panel.setOpaque(false);
    panel.setLayout(new javax.swing.BoxLayout(
        panel, javax.swing.BoxLayout.Y_AXIS
    ));
    panel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
panel.setBorder(
        javax.swing.BorderFactory.createEmptyBorder(25, 20, 25, 20)
);
    
    // Ancho máximo para los campos del formulario
    java.awt.Dimension tamCampo =
            new java.awt.Dimension(650, 32);

    javax.swing.JComponent[] camposFormulario = {
        txtNombre, txtGenero, txtDuracion,
        cmbClasificacion, cmbSala, txtFecha, txtHora,
        cmbFunciones
    };

    for (javax.swing.JComponent campo : camposFormulario) {
        campo.setPreferredSize(tamCampo);
        campo.setMaximumSize(tamCampo);
        campo.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
    }

    // Área de funciones registradas
    jScrollPane1.setPreferredSize(
        new java.awt.Dimension(650, 180)
);
jScrollPane1.setMaximumSize(
        new java.awt.Dimension(650, 180)
);
jScrollPane1.setAlignmentX(
        java.awt.Component.CENTER_ALIGNMENT
);


    // Organizar el formulario
    panel.add(jLabel1);
    panel.add(javax.swing.Box.createVerticalStrut(15));
    panel.add(jLabel2);
    panel.add(txtNombre);
    panel.add(javax.swing.Box.createVerticalStrut(8));
    panel.add(jLabel3);
    panel.add(txtGenero);
    panel.add(javax.swing.Box.createVerticalStrut(8));
    panel.add(jLabel4);
    panel.add(txtDuracion);
    panel.add(javax.swing.Box.createVerticalStrut(8));
    panel.add(jLabel5);
    panel.add(cmbClasificacion);
    panel.add(javax.swing.Box.createVerticalStrut(8));
    panel.add(jLabel6);
    panel.add(cmbSala);
    panel.add(javax.swing.Box.createVerticalStrut(8));
    panel.add(jLabel8);
    panel.add(txtFecha);
    panel.add(javax.swing.Box.createVerticalStrut(8));
    panel.add(jLabel9);
    panel.add(txtHora);
    panel.add(javax.swing.Box.createVerticalStrut(15));
    panel.add(btnAgregar);
    panel.add(javax.swing.Box.createVerticalStrut(20));
    panel.add(jScrollPane1);
    panel.add(cmbFunciones);
    panel.add(javax.swing.Box.createVerticalStrut(10));
    panel.add(btnEliminar);
    panel.add(javax.swing.Box.createVerticalStrut(10));
    panel.add(btnVolver);

    
    // Crear un contenedor con desplazamiento vertical
    javax.swing.JScrollPane scrollPane =
            new javax.swing.JScrollPane(panel);
    panel.setPreferredSize(new java.awt.Dimension(750, 1100));
panel.setMinimumSize(new java.awt.Dimension(750, 1100));

scrollPane.getVerticalScrollBar().setUnitIncrement(20);
scrollPane.setWheelScrollingEnabled(true);

    scrollPane.setVerticalScrollBarPolicy(
            javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
    );

    scrollPane.setHorizontalScrollBarPolicy(
            javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );

    // Mantener el fondo oscuro
    scrollPane.setBorder(null);
    scrollPane.getViewport().setBackground(
            new java.awt.Color(25, 25, 25)
    );

    // Permitir que el formulario tenga espacio para desplazarse
    panel.setBorder(
            javax.swing.BorderFactory.createEmptyBorder(25, 20, 25, 20)
    );

    // Agregar el contenedor a la ventana
    getContentPane().removeAll();
    getContentPane().setLayout(new java.awt.BorderLayout());
    getContentPane().add(
            scrollPane,
            java.awt.BorderLayout.CENTER
    );

    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

    }
    
    private void cargarFunciones() {
    cmbFunciones.removeAllItems();
    cmbFunciones.addItem("Seleccionar función");

    for (Funcion f : DatosCine.funciones) {
        String texto = f.getPelicula().getNombre()
                + " - Sala " + f.getSala().getNumero()
                + " - " + f.getFecha()
                + " - " + f.getHora();

        cmbFunciones.addItem(texto);
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        cmbClasificacion = new javax.swing.JComboBox<>();
        cmbSala = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFuncionesRegistradas = new javax.swing.JTextArea();
        cmbFunciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(455, 735));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 20, 40));
        jLabel1.setText("GESTIÓN DE FUNCIONES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de la película:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Duración:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clasificación:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sala:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha:");
        jLabel8.setPreferredSize(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hora:");

        btnAgregar.setBackground(new java.awt.Color(180, 20, 35));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar función");
        btnAgregar.setFocusPainted(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        txtNombre.setBackground(new java.awt.Color(245, 245, 245));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(30, 30, 30));

        txtGenero.setBackground(new java.awt.Color(245, 245, 245));
        txtGenero.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(30, 30, 30));

        txtDuracion.setBackground(new java.awt.Color(245, 245, 245));
        txtDuracion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtDuracion.setForeground(new java.awt.Color(30, 30, 30));
        txtDuracion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDuracionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDuracionFocusLost(evt);
            }
        });

        cmbClasificacion.setBackground(new java.awt.Color(245, 245, 245));
        cmbClasificacion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbClasificacion.setForeground(new java.awt.Color(30, 30, 30));
        cmbClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "7+", "12+", "15+", "18+" }));

        cmbSala.setBackground(new java.awt.Color(245, 245, 245));
        cmbSala.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbSala.setForeground(new java.awt.Color(30, 30, 30));
        cmbSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sala 1 - 2D", "Sala 2 - 2D", "Sala 3 - 3D", "Sala 4 - 3D", "Sala 5 - VIP" }));

        txtFecha.setBackground(new java.awt.Color(245, 245, 245));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(30, 30, 30));
        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });

        txtHora.setBackground(new java.awt.Color(245, 245, 245));
        txtHora.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtHora.setForeground(new java.awt.Color(30, 30, 30));
        txtHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraFocusLost(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(180, 20, 35));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar función");
        btnEliminar.setFocusPainted(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnVolver.setBackground(new java.awt.Color(100, 20, 25));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        txtFuncionesRegistradas.setBackground(new java.awt.Color(45, 45, 45));
        txtFuncionesRegistradas.setColumns(20);
        txtFuncionesRegistradas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtFuncionesRegistradas.setForeground(new java.awt.Color(255, 255, 255));
        txtFuncionesRegistradas.setRows(5);
        jScrollPane1.setViewportView(txtFuncionesRegistradas);

        cmbFunciones.setBackground(new java.awt.Color(245, 245, 245));
        cmbFunciones.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmbFunciones.setForeground(new java.awt.Color(30, 30, 30));
        cmbFunciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar función" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmbFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnVolver)
                                    .addGap(313, 313, 313))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtGenero)
                                        .addComponent(txtNombre)
                                        .addComponent(txtDuracion)
                                        .addComponent(cmbClasificacion, 0, 209, Short.MAX_VALUE)
                                        .addComponent(txtFecha)
                                        .addComponent(txtHora)
                                        .addComponent(cmbSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(11, 11, 11)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnEliminar)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
String nombre = txtNombre.getText().trim();
String genero = txtGenero.getText().trim();
String duracionTexto = txtDuracion.getText().trim();
String fecha = txtFecha.getText().trim();

if (fecha.isEmpty() || fecha.equals("DD/MM/AAAA")) {
    JOptionPane.showMessageDialog(this, "Completa el campo de fecha.");
    return;
}

if (!fecha.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
    JOptionPane.showMessageDialog(this, "La fecha debe tener el formato D/M/AAAA.");
    return;
}

String[] partesFecha = fecha.split("/");

int dia = Integer.parseInt(partesFecha[0]);
int mes = Integer.parseInt(partesFecha[1]);
int anio = Integer.parseInt(partesFecha[2]);

if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
    JOptionPane.showMessageDialog(this, "La fecha no es válida.");
    return;
}

String hora = txtHora.getText().trim();

if (hora.matches("\\d{1}:\\d{2}")) {
    hora = "0" + hora;
}

if (hora.isEmpty() || hora.equals("HH:MM")) {
    JOptionPane.showMessageDialog(this, "Completa el campo de hora.");
    return;
}

if (!hora.matches("\\d{1,2}:\\d{2}")) {
    JOptionPane.showMessageDialog(this, "La hora debe tener el formato HH:MM.");
    return;
}

int horas = Integer.parseInt(hora.substring(0, 2));
int minutos = Integer.parseInt(hora.substring(3, 5));

if (horas > 23 || minutos > 59) {
    JOptionPane.showMessageDialog(this, "La hora no es válida.");
    return;
}

if (nombre.isEmpty() || genero.isEmpty()
        || duracionTexto.isEmpty() || duracionTexto.equals("Ej: 130")
        || fecha.isEmpty() || fecha.equals("DD/MM/AAAA")
        || hora.isEmpty() || hora.equals("HH:MM")) {
    JOptionPane.showMessageDialog(this, "Completa todos los campos.");
    return;
}
if (cmbClasificacion.getSelectedIndex() == 0) {
    JOptionPane.showMessageDialog(this, "Selecciona una clasificación.");
    return;
}

if (cmbSala.getSelectedIndex() == 0) {
    JOptionPane.showMessageDialog(this, "Selecciona una sala.");
    return;
}

int duracion;

try {
    duracion = Integer.parseInt(duracionTexto);

    if (duracion <= 0) {
        JOptionPane.showMessageDialog(this, "La duración debe ser mayor que 0.");
        return;
    }

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Duración y precio deben ser números.");
    return;
}

String clasificacionTexto = cmbClasificacion.getSelectedItem().toString();
String salaTexto = cmbSala.getSelectedItem().toString();
int numeroSala;
String tipoSala;
int capacidadSala;

if (salaTexto.equals("Sala 1 - 2D")) {
    numeroSala = 1;
    tipoSala = "2D";
    capacidadSala = 100;
} else if (salaTexto.equals("Sala 2 - 2D")) {
    numeroSala = 2;
    tipoSala = "2D";
    capacidadSala = 100;
} else if (salaTexto.equals("Sala 3 - 3D")) {
    numeroSala = 3;
    tipoSala = "3D";
    capacidadSala = 80;
} else if (salaTexto.equals("Sala 4 - 3D")) {
    numeroSala = 4;
    tipoSala = "3D";
    capacidadSala = 80;
} else {
    numeroSala = 5;
    tipoSala = "VIP";
    capacidadSala = 40;
}

Pelicula pelicula = new Pelicula(
    nombre,
    genero,
    duracion,
    Integer.parseInt(clasificacionTexto.replace("+", ""))
);

Sala sala = new Sala(numeroSala, tipoSala, capacidadSala);

double precio = 0;

if (tipoSala.equals("2D")) {
    precio = 12000;
} else if (tipoSala.equals("3D")) {
    precio = 16000;
} else if (tipoSala.equals("VIP")) {
    precio = 25000;
}

Funcion funcion = new Funcion(
    pelicula,
    sala,
    fecha,
    hora,
    precio
);

funcion.generarAsientos();

for (Funcion f : DatosCine.funciones) {
    if (f.getSala().getNumero() == numeroSala
            && f.getFecha().equals(fecha)
            && f.getHora().equals(hora)) {
        JOptionPane.showMessageDialog(this,
                "Ya existe una función en esta sala, fecha y hora.");
        return;
    }
}

DatosCine.funciones.add(funcion);
cargarFunciones();
mostrarFunciones();

txtNombre.setText("");
txtGenero.setText("");
txtDuracion.setText("");
txtFecha.setText("");
txtHora.setText("");

cmbClasificacion.setSelectedIndex(0);
cmbSala.setSelectedIndex(0);

JOptionPane.showMessageDialog(this, "Función registrada correctamente.");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusGained
if (txtFecha.getText().equals("DD/MM/AAAA")) {
    txtFecha.setText("");
}
    }//GEN-LAST:event_txtFechaFocusGained

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
if (txtFecha.getText().isEmpty()) {
    txtFecha.setText("DD/MM/AAAA");
}
    }//GEN-LAST:event_txtFechaFocusLost

    private void txtHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFocusGained
if (txtHora.getText().equals("HH:MM")) {
    txtHora.setText("");
}
    }//GEN-LAST:event_txtHoraFocusGained

    private void txtHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFocusLost
if (txtHora.getText().isEmpty()) {
    txtHora.setText("HH:MM");
}
    }//GEN-LAST:event_txtHoraFocusLost

    private void txtDuracionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuracionFocusGained
if (txtDuracion.getText().equals("Ej: 130")) {
    txtDuracion.setText("");
}
    }//GEN-LAST:event_txtDuracionFocusGained

    private void txtDuracionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuracionFocusLost
if (txtDuracion.getText().isEmpty()) {
    txtDuracion.setText("Ej: 130");
}
    }//GEN-LAST:event_txtDuracionFocusLost

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
if (cmbFunciones.getSelectedIndex() == 0) {
    JOptionPane.showMessageDialog(this, "Selecciona una función para eliminar.");
    return;
}
String funcionSeleccionadaTexto = cmbFunciones.getSelectedItem().toString();

Funcion funcionSeleccionada = null;

for (Funcion f : DatosCine.funciones) {
    String texto = f.getPelicula().getNombre()
            + " - Sala " + f.getSala().getNumero()
            + " - " + f.getFecha()
            + " - " + f.getHora();

    if (texto.equals(funcionSeleccionadaTexto)) {
        funcionSeleccionada = f;
        break;
    }
}
if (funcionSeleccionada != null) {
    DatosCine.funciones.remove(funcionSeleccionada);
}
cargarFunciones();
mostrarFunciones();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
VentanaPrincipal ventana = new VentanaPrincipal();
ventana.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
btnAgregar.setBackground(new java.awt.Color(220, 20, 40));    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
btnAgregar.setBackground(new java.awt.Color(180, 20, 35));    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
btnEliminar.setBackground(new java.awt.Color(220, 20, 40));    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
btnEliminar.setBackground(new java.awt.Color(180, 20, 35));    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
btnVolver.setBackground(new java.awt.Color(160, 30, 35));    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
btnVolver.setBackground(new java.awt.Color(100, 20, 25));    }//GEN-LAST:event_btnVolverMouseExited

    private void mostrarFunciones() {
    txtFuncionesRegistradas.setText("");
    
    for (Funcion f : DatosCine.funciones) {
        String texto = "Película: " + f.getPelicula().getNombre() + "\n"
                + "Género: " + f.getPelicula().getGenero() + "\n"
                + "Duración: " + f.getPelicula().getDuracion() + " min\n"
                + "Clasificación: " + f.getPelicula().getClasificacion() + "+\n"
                + "Sala: Sala " + f.getSala().getNumero() + " - " + f.getSala().getTipo() + "\n"
                + "Fecha: " + f.getFecha() + "\n"
                + "Hora: " + f.getHora() + "\n"
                + "Precio: $" + String.format("%,.0f", f.getPrecio()) + "\n"
                + "----------------------------------------\n";

        txtFuncionesRegistradas.append(texto);
    }
}
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
        java.awt.EventQueue.invokeLater(() -> new Funciones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbClasificacion;
    private javax.swing.JComboBox<String> cmbFunciones;
    private javax.swing.JComboBox<String> cmbSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtFuncionesRegistradas;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
