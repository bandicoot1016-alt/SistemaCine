package com.cine;

/**
 *
 * @author user
 */
public class CalculadoraPrecio {
    public double calcularPrecioBase(String tipoSala, boolean finDeSemana) {

        double precio = 0;

        if (tipoSala.equals("2D")) {
            precio = finDeSemana ? 15000 : 12000;

        } else if (tipoSala.equals("3D")) {
            precio = finDeSemana ? 20000 : 16000;

        } else if (tipoSala.equals("VIP")) {
            precio = finDeSemana ? 30000 : 25000;
        }

        return precio;
    }
    public double calcularDescuento(Cliente cliente) {

    if (cliente.getEdad() < 13) {
        return 0.20;

    } else if (cliente.getEdad() >= 60) {
        return 0.20;

    } else if (cliente.isEstudiante()) {
        return 0.15;

    } else {
        return 0.0;
    }
}
    public double calcularPrecioFinal(String tipoSala, boolean finDeSemana, Cliente cliente) {

    double precioBase = calcularPrecioBase(tipoSala, finDeSemana);

    double descuento = calcularDescuento(cliente);

    double precioFinal = precioBase - (precioBase * descuento);

    return precioFinal;
}
}
