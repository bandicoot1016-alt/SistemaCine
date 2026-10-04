package com.cine;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaCine {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // LISTAS
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        ArrayList<Sala> salas = new ArrayList<>();
        ArrayList<Funcion> funciones = new ArrayList<>();
        ArrayList<Boleta> boletas = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Venta> ventas = new ArrayList<>();

        // COMIDA
        Producto crispetas = new Producto("Crispetas", 10000);
        Producto gaseosa = new Producto("Gaseosa", 5000);
        Producto perroCaliente = new Producto("Perro caliente", 12000);
        Producto combo = new Producto("Combo", 18000);

        productos.add(crispetas);
        productos.add(gaseosa);
        productos.add(perroCaliente);
        productos.add(combo);

        // PELICULAS
        Pelicula pelicula1 = new Pelicula("Batman", "Accion", 130, 15);
        Pelicula pelicula2 = new Pelicula("Shrek", "Animacion", 95, 7);
        Pelicula pelicula3 = new Pelicula("Avengers", "Accion", 140, 12);

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);

        // SALAS
        Sala sala1 = new Sala(1, "2D", 100);
        Sala sala2 = new Sala(2, "2D", 100);
        Sala sala3 = new Sala(3, "3D", 80);
        Sala sala4 = new Sala(4, "3D", 80);
        Sala sala5 = new Sala(5, "VIP", 40);

        salas.add(sala1);
        salas.add(sala2);
        salas.add(sala3);
        salas.add(sala4);
        salas.add(sala5);

        // FUNCIONES
        Funcion funcion1 = new Funcion(pelicula1, sala3, "15/09/2026", "19:30", 16000);
        Funcion funcion2 = new Funcion(pelicula1, sala4, "15/09/2026", "21:30", 16000);
        Funcion funcion3 = new Funcion(pelicula2, sala1, "16/09/2026", "18:00", 12000);
        Funcion funcion4 = new Funcion(pelicula3, sala5, "19/09/2026", "20:00", 25000);

        funcion1.generarAsientos();
        funcion2.generarAsientos();
        funcion3.generarAsientos();
        funcion4.generarAsientos();

        funciones.add(funcion1);
        funciones.add(funcion2);
        funciones.add(funcion3);
        funciones.add(funcion4);

        int opcion = 0;

        while (opcion != 7) {

            System.out.println();
            System.out.println("================================");
            System.out.println("         SISTEMA DE CINE");
            System.out.println("================================");
            System.out.println("1. Nueva venta");
            System.out.println("2. Ver peliculas");
            System.out.println("3. Ver funciones");
            System.out.println("4. Ver salas");
            System.out.println("5. Ver boletas vendidas");
            System.out.println("6. Ver ventas");
            System.out.println("7. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.println("===== NUEVA VENTA =====");

                    Venta venta = new Venta();

                    System.out.println();
                    System.out.println("¿Qué desea comprar?");
                    System.out.println("1. Boletas");
                    System.out.println("2. Comida");
                    System.out.println("3. Boletas y comida");

                    int tipoCompra;

while (true) {
    System.out.print("Seleccione una opcion: ");
    tipoCompra = teclado.nextInt();

    if (tipoCompra >= 1 && tipoCompra <= 3) {
        break;
    }

    System.out.println();
    System.out.println("Opcion no valida.");
    System.out.println("Seleccione 1, 2 o 3.");
}

                    // COMPRA DE BOLETAS
                    if (tipoCompra == 1 || tipoCompra == 3) {

                        System.out.println();
                        System.out.println("===== COMPRA DE BOLETAS =====");
                        System.out.println();
                        System.out.println("Seleccione una pelicula:");

                        for (int i = 0; i < peliculas.size(); i++) {
                            System.out.println((i + 1) + ". " + peliculas.get(i).getNombre());
                        }

                        int opcionPelicula;

                        while (true) {
                            System.out.print("Seleccione una opcion: ");
                            opcionPelicula = teclado.nextInt();

                            if (opcionPelicula >= 1 && opcionPelicula <= peliculas.size()) {
                                break;
                            }

                            System.out.println();
                            System.out.println("Opcion no valida.");
                            System.out.println("Seleccione una pelicula entre 1 y " + peliculas.size());
                        }

                        Pelicula peliculaSeleccionada = peliculas.get(opcionPelicula - 1);

                        System.out.println();
                        System.out.println("Película seleccionada: " + peliculaSeleccionada.getNombre());

                        int opcionTipoSala;

                        while (true) {
                            System.out.println();
                            System.out.println("===== TIPO DE SALA =====");
                            System.out.println("1. 2D");
                            System.out.println("2. 3D");
                            System.out.println("3. VIP");
                            System.out.print("Seleccione una opcion: ");

                            opcionTipoSala = teclado.nextInt();

                            if (opcionTipoSala >= 1 && opcionTipoSala <= 3) {
                                break;
                            }

                            System.out.println();
                            System.out.println("Opcion no valida.");
                            System.out.println("Seleccione 1, 2 o 3.");
                        }

                        String tipoSalaSeleccionado;

                        switch (opcionTipoSala) {
                            case 1:
                                tipoSalaSeleccionado = "2D";
                                break;
                            case 2:
                                tipoSalaSeleccionado = "3D";
                                break;
                            default:
                                tipoSalaSeleccionado = "VIP";
                                break;
                        }

                        System.out.println();
                        System.out.println("Tipo de sala seleccionado: " + tipoSalaSeleccionado);
                        System.out.println();
                        System.out.println("===== SALAS DISPONIBLES =====");

                        ArrayList<Sala> salasDisponibles = new ArrayList<>();
                        int contadorSalas = 1;

                        for (Sala sala : salas) {
                            if (sala.getTipo().equals(tipoSalaSeleccionado)) {
                                System.out.println(
                                        contadorSalas + ". Sala " + sala.getNumero()
                                        + " - " + sala.getTipo()
                                        + " - Capacidad: " + sala.getCapacidad()
                                );

                                salasDisponibles.add(sala);
                                contadorSalas++;
                            }
                        }

                        int opcionSala;

                        while (true) {
                            System.out.print("Seleccione una sala: ");
                            opcionSala = teclado.nextInt();

                            if (opcionSala >= 1 && opcionSala <= salasDisponibles.size()) {
                                break;
                            }

                            System.out.println();
                            System.out.println("Opcion no valida.");
                            System.out.println("Seleccione una sala entre 1 y " + salasDisponibles.size());
                        }

                        Sala salaSeleccionada = salasDisponibles.get(opcionSala - 1);

                        System.out.println("Sala seleccionada: Sala " + salaSeleccionada.getNumero());
                        System.out.println();
                        System.out.println("===== FUNCIONES DISPONIBLES =====");

                        ArrayList<Funcion> funcionesDisponibles = new ArrayList<>();
                        int contadorFunciones = 1;

                        for (Funcion funcion : funciones) {
                            if (funcion.getPelicula() == peliculaSeleccionada
                                    && funcion.getSala() == salaSeleccionada) {

                                System.out.println(
                                        contadorFunciones + ". "
                                        + funcion.getPelicula().getNombre()
                                        + " - Sala " + funcion.getSala().getNumero()
                                        + " - " + funcion.getSala().getTipo()
                                );

                                System.out.println("   Fecha: " + funcion.getFecha());
                                System.out.println("   Hora: " + funcion.getHora());

                                funcionesDisponibles.add(funcion);
                                contadorFunciones++;
                            }
                        }

                        int opcionFuncion;

                        while (true) {
                            System.out.print("Seleccione una funcion: ");
                            opcionFuncion = teclado.nextInt();

                            if (opcionFuncion >= 1 && opcionFuncion <= funcionesDisponibles.size()) {
                                break;
                            }

                            System.out.println();
                            System.out.println("Opcion no valida.");
                            System.out.println("Seleccione una funcion entre 1 y " + funcionesDisponibles.size());
                        }

                        Funcion funcionSeleccionada = funcionesDisponibles.get(opcionFuncion - 1);

                        System.out.println();
                        System.out.println("Funcion seleccionada:");
                        System.out.println("Película: " + funcionSeleccionada.getPelicula().getNombre());
                        System.out.println("Sala: " + funcionSeleccionada.getSala().getNumero());
                        System.out.println("Tipo de sala: " + funcionSeleccionada.getSala().getTipo());
                        System.out.println("Fecha: " + funcionSeleccionada.getFecha());
                        System.out.println("Hora: " + funcionSeleccionada.getHora());

                        int asientosDisponibles = 0;

for (Asiento asiento : funcionSeleccionada.getAsientos()) {
    if (!asiento.isOcupado()) {
        asientosDisponibles++;
    }
}

int cantidadBoletas;

while (true) {
    System.out.print("¿Cuántas boletas desea comprar?: ");
    cantidadBoletas = teclado.nextInt();

    if (cantidadBoletas <= 0) {
        System.out.println();
        System.out.println("La cantidad debe ser mayor que 0.");
        continue;
    }

    if (cantidadBoletas > asientosDisponibles) {
        System.out.println();
        System.out.println(
                "No hay suficientes asientos disponibles."
        );
        System.out.println(
                "Asientos disponibles: "
                + asientosDisponibles
        );
        continue;
    }

    break;
}

                        System.out.println();
                        System.out.println("===== ASIENTOS DISPONIBLES =====");

                        int contadorAsientos = 1;

                        for (Asiento asiento : funcionSeleccionada.getAsientos()) {
                            if (!asiento.isOcupado()) {
                                System.out.print(asiento.getFila() + asiento.getNumero() + "  ");
                                contadorAsientos++;

                                if (contadorAsientos > 10) {
                                    System.out.println();
                                    contadorAsientos = 1;
                                }
                            }
                        }

                        for (int i = 1; i <= cantidadBoletas; i++) {

                            boolean asientoValido = false;
                            Asiento asientoSeleccionado = null;

                            while (!asientoValido) {

                                System.out.println();
                                System.out.println("===== BOLETA " + i + " =====");
                                System.out.print("Seleccione un asiento (ejemplo B5): ");

                                String codigoAsiento = teclado.next().toUpperCase();

                                if (codigoAsiento.length() < 2) {
                                    System.out.println();
                                    System.out.println("Formato de asiento no valido.");
                                    System.out.println("Ejemplo: B5");
                                    continue;
                                }

                                String filaSeleccionada = codigoAsiento.substring(0, 1);
                                int numeroAsiento;

                                try {
                                    numeroAsiento = Integer.parseInt(codigoAsiento.substring(1));
                                } catch (NumberFormatException e) {
                                    System.out.println();
                                    System.out.println("Formato de asiento no valido.");
                                    System.out.println("Ejemplo: B5");
                                    continue;
                                }

                                asientoSeleccionado = null;

                                for (Asiento asiento : funcionSeleccionada.getAsientos()) {
                                    if (asiento.getFila().equals(filaSeleccionada)
                                            && asiento.getNumero() == numeroAsiento) {

                                        asientoSeleccionado = asiento;
                                        break;
                                    }
                                }

                                if (asientoSeleccionado != null) {

                                    if (!asientoSeleccionado.isOcupado()) {

                                        System.out.println();
                                        System.out.println(
                                                "Asiento seleccionado: "
                                                + asientoSeleccionado.getFila()
                                                + asientoSeleccionado.getNumero()
                                        );

                                        System.out.println("El asiento está disponible.");

                                        asientoSeleccionado.setOcupado(true);
                                        asientoValido = true;

                                        System.out.println();
                                        System.out.println("===== DATOS DEL CLIENTE =====");

                                        teclado.nextLine();

String nombreCliente;

while (true) {
    System.out.print("Nombre: ");
    nombreCliente = teclado.nextLine();

    if (nombreCliente.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        break;
    }

    System.out.println();
    System.out.println("Nombre no valido.");
    System.out.println("El nombre solo debe contener letras y espacios.");
}

                                        String documentoCliente;

while (true) {
    System.out.print("Documento: ");
    documentoCliente = teclado.next();

    if (documentoCliente.matches("\\d{5,}")) {
        break;
    }

    System.out.println();
    System.out.println("Documento no valido.");
    System.out.println("Debe contener solo numeros y tener minimo 5 digitos.");
}
                                        
                                        int edadCliente;

while (true) {
    System.out.print("Edad: ");
    edadCliente = teclado.nextInt();

    if (edadCliente <= 0) {
        System.out.println();
        System.out.println("La edad debe ser mayor que 0.");
        continue;
    }

    if (edadCliente < peliculaSeleccionada.getClasificacion()) {
        System.out.println();
        System.out.println(
                "Esta pelicula es para mayores de "
                + peliculaSeleccionada.getClasificacion()
                + " años."
        );
        System.out.println("La edad ingresada no permite comprar esta boleta.");
        continue;
    }

    break;
}

                                        boolean estudianteCliente;

                                        while (true) {
                                            System.out.print("¿Es estudiante? (true/false): ");
                                            String respuestaEstudiante = teclado.next().toLowerCase();

    if (respuestaEstudiante.equals("true")) {
        estudianteCliente = true;
        break;
    }

    if (respuestaEstudiante.equals("false")) {
        estudianteCliente = false;
        break;
    }

    System.out.println();
    System.out.println("Respuesta no valida.");
    System.out.println("Escriba solamente true o false.");
}
                                        

                                        Cliente cliente = new Cliente(
                                                nombreCliente,
                                                documentoCliente,
                                                edadCliente,
                                                estudianteCliente
                                        );

                                        CalculadoraPrecio calculadora = new CalculadoraPrecio();

                                        double precioBase = calculadora.calcularPrecioBase(
                                                funcionSeleccionada.getSala().getTipo(),
                                                false
                                        );

                                        double descuento = calculadora.calcularDescuento(cliente);

                                        double precioFinal = calculadora.calcularPrecioFinal(
                                                funcionSeleccionada.getSala().getTipo(),
                                                false,
                                                cliente
                                        );

                                        Boleta boleta = new Boleta(
                                                cliente,
                                                funcionSeleccionada,
                                                asientoSeleccionado,
                                                precioFinal
                                        );

                                        boletas.add(boleta);
                                        venta.agregarBoleta(boleta);

                                        System.out.println();
                                        System.out.println("===== CALCULO DE PRECIO =====");
                                        System.out.println("Precio base: $" + precioBase);
                                        System.out.println("Descuento: " + (descuento * 100) + "%");
                                        System.out.println("Precio final: $" + precioFinal);

                                        System.out.println();
                                        System.out.println("===== BOLETA =====");
                                        System.out.println("Cliente: " + boleta.getCliente().getNombre());
                                        System.out.println("Película: "
                                                + boleta.getFuncion().getPelicula().getNombre());
                                        System.out.println("Sala: "
                                                + boleta.getFuncion().getSala().getNumero());
                                        System.out.println("Asiento: "
                                                + boleta.getAsiento().getFila()
                                                + boleta.getAsiento().getNumero());
                                        System.out.println("Precio: $" + boleta.getPrecio());

                                    } else {

                                        System.out.println();
                                        System.out.println("El asiento está ocupado.");
                                        System.out.println("Por favor, seleccione otro asiento.");
                                    }

                                } else {

                                    System.out.println();
                                    System.out.println("El asiento no existe.");
                                    System.out.println("Por favor, seleccione otro asiento.");
                                }
                            }
                        }

                        System.out.println();
                        System.out.println("===== RESUMEN DE BOLETAS =====");
                        System.out.println("Cantidad de boletas: " + cantidadBoletas);
                        System.out.println("Total de boletas: $" + venta.calcularTotal());
                    }

                    // COMPRA DE COMIDA
                    if (tipoCompra == 2 || tipoCompra == 3) {

                        System.out.println();
                        System.out.println("===== VENTA DE COMIDA =====");

                        boolean seguirComprando = true;
                        ArrayList<DetalleCompra> detallesCompra = new ArrayList<>();

                        while (seguirComprando) {

                            System.out.println();

                            for (int i = 0; i < productos.size(); i++) {
                                Producto producto = productos.get(i);

                                System.out.println(
                                        (i + 1) + ". "
                                        + producto.getNombre()
                                        + " - $" + producto.getPrecio()
                                );
                            }

                            System.out.println();
                            System.out.print("Seleccione un producto: ");

                            int opcionProducto = teclado.nextInt();

                            if (opcionProducto >= 1 && opcionProducto <= productos.size()) {

                                Producto productoSeleccionado = productos.get(opcionProducto - 1);

                                int cantidad;

                                while (true) {
                                    System.out.print("Cantidad: ");
                                    cantidad = teclado.nextInt();

                                    if (cantidad > 0) {
                                        break;
                                    }

                                    System.out.println();
                                    System.out.println("La cantidad debe ser mayor que 0.");
                                }

                                double subtotal = productoSeleccionado.getPrecio() * cantidad;

                                DetalleCompra detalle = new DetalleCompra(
                                        productoSeleccionado,
                                        cantidad
                                );

                                detallesCompra.add(detalle);
                                venta.agregarDetalleCompra(detalle);

                                System.out.println();
                                System.out.println("Producto: " + productoSeleccionado.getNombre());
                                System.out.println("Cantidad: " + cantidad);
                                System.out.println("Subtotal: $" + subtotal);

                                // VALIDACION PARA CONTINUAR COMPRANDO
                                while (true) {

                                    System.out.println();
                                    System.out.print(
                                            "¿Desea agregar otro producto? (true/false): "
                                    );

                                    String respuesta = teclado.next().toLowerCase();

                                    if (respuesta.equals("true")) {
                                        seguirComprando = true;
                                        break;
                                    }

                                    if (respuesta.equals("false")) {
                                        seguirComprando = false;
                                        break;
                                    }

                                    System.out.println();
                                    System.out.println("Respuesta no valida.");
                                    System.out.println("Escriba solamente true o false.");
                                }

                            } else {

                                System.out.println();
                                System.out.println("Producto no valido.");
                            }
                        }

                        System.out.println();
                        System.out.println("===== RESUMEN DE COMIDA =====");

                        for (DetalleCompra detalle : detallesCompra) {

                            System.out.println(
                                    "Producto: "
                                    + detalle.getProducto().getNombre()
                            );

                            System.out.println("Cantidad: " + detalle.getCantidad());
                            System.out.println("Subtotal: $" + detalle.getSubtotal());
                            System.out.println();
                        }

                        System.out.println(
                                "TOTAL DE COMIDA: $"
                                + venta.calcularTotalComida()
                        );
                    }

                    // GUARDAMOS UNA SOLA VENTA
                    ventas.add(venta);

                    System.out.println();
                    System.out.println("==============================");
                    System.out.println(
                            "TOTAL DE LA VENTA: $"
                            + venta.calcularTotal()
                    );
                    System.out.println("==============================");

                    break;

                case 2:
                    System.out.println("===== PELICULAS =====");

                    for (Pelicula pelicula : peliculas) {
                        System.out.println("------------------------");
                        System.out.println("Nombre: " + pelicula.getNombre());
                        System.out.println("Genero: " + pelicula.getGenero());
                        System.out.println("Duracion: " + pelicula.getDuracion() + " minutos");
                        System.out.println("Clasificacion: +" + pelicula.getClasificacion());
                    }

                    break;

                case 3:
                    System.out.println("===== FUNCIONES DISPONIBLES =====");

                    for (int i = 0; i < funciones.size(); i++) {

                        Funcion funcion = funciones.get(i);

                        System.out.println();
                        System.out.println("----- FUNCION " + (i + 1) + " -----");
                        System.out.println("Película: " + funcion.getPelicula().getNombre());
                        System.out.println("Sala: " + funcion.getSala().getNumero());
                        System.out.println("Tipo de sala: " + funcion.getSala().getTipo());
                        System.out.println("Fecha: " + funcion.getFecha());
                        System.out.println("Hora: " + funcion.getHora());
                        System.out.println("Precio: $" + funcion.getPrecio());
                    }

                    break;

                case 4:
                    System.out.println("===== SALAS =====");

                    for (Sala sala : salas) {

                        System.out.println();
                        System.out.println("----- SALA " + sala.getNumero() + " -----");
                        System.out.println("Tipo: " + sala.getTipo());
                        System.out.println("Capacidad: " + sala.getCapacidad());
                    }

                    break;

                case 5:
                    System.out.println("===== BOLETAS VENDIDAS =====");

                    if (boletas.isEmpty()) {

                        System.out.println("No hay boletas vendidas.");

                    } else {

                        int contadorBoletas = 1;

                        for (Boleta boleta : boletas) {

                            System.out.println();
                            System.out.println("----- BOLETA " + contadorBoletas + " -----");
                            System.out.println("Cliente: " + boleta.getCliente().getNombre());
                            System.out.println(
                                    "Película: "
                                    + boleta.getFuncion().getPelicula().getNombre()
                            );
                            System.out.println(
                                    "Sala: "
                                    + boleta.getFuncion().getSala().getNumero()
                            );
                            System.out.println(
                                    "Asiento: "
                                    + boleta.getAsiento().getFila()
                                    + boleta.getAsiento().getNumero()
                            );
                            System.out.println("Precio: $" + boleta.getPrecio());

                            contadorBoletas++;
                        }
                    }

                    break;

                case 6:
                    System.out.println("===== VENTAS REGISTRADAS =====");

                    if (ventas.isEmpty()) {

                        System.out.println("No hay ventas registradas.");

                    } else {

                        int contadorVentas = 1;

                        for (Venta ventaRegistrada : ventas) {

                            System.out.println();
                            System.out.println("----- VENTA " + contadorVentas + " -----");

                            System.out.println();
                            System.out.println("BOLETAS:");

                            if (ventaRegistrada.getBoletas().isEmpty()) {

                                System.out.println("No hay boletas.");

                            } else {

                                for (Boleta boleta : ventaRegistrada.getBoletas()) {

                                    System.out.println(
                                            "Cliente: "
                                            + boleta.getCliente().getNombre()
                                    );

                                    System.out.println(
                                            "Película: "
                                            + boleta.getFuncion().getPelicula().getNombre()
                                    );

                                    System.out.println(
                                            "Asiento: "
                                            + boleta.getAsiento().getFila()
                                            + boleta.getAsiento().getNumero()
                                    );

                                    System.out.println("Precio: $" + boleta.getPrecio());
                                    System.out.println();
                                }
                            }

                            System.out.println("COMIDA:");

                            if (ventaRegistrada.getDetallesCompra().isEmpty()) {

                                System.out.println("No hay comida.");

                            } else {

                                for (DetalleCompra detalle : ventaRegistrada.getDetallesCompra()) {

                                    System.out.println(
                                            "Producto: "
                                            + detalle.getProducto().getNombre()
                                    );

                                    System.out.println("Cantidad: " + detalle.getCantidad());
                                    System.out.println("Subtotal: $" + detalle.getSubtotal());
                                    System.out.println();
                                }
                            }

                            System.out.println("------------------------");
                            System.out.println(
                                    "TOTAL DE LA VENTA: $"
                                    + ventaRegistrada.calcularTotal()
                            );

                            contadorVentas++;
                        }
                    }

                    break;

                case 7:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}