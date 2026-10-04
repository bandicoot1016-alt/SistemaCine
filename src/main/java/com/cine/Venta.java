package com.cine;

import java.util.ArrayList;

public class Venta {

    private ArrayList<Boleta> boletas;
    private ArrayList<DetalleCompra> detallesCompra;
    private String fecha;
    private String hora;

    public Venta() {
    boletas = new ArrayList<>();
    detallesCompra = new ArrayList<>();

    java.time.LocalDateTime ahora = java.time.LocalDateTime.now();

    fecha = ahora.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    hora = ahora.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm"));
}

    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    public void agregarDetalleCompra(DetalleCompra detalle) {
        detallesCompra.add(detalle);
    }

    // Calcula el total de boletas + comida
    public double calcularTotal() {

        double total = 0;

        for (Boleta boleta : boletas) {
            total += boleta.getPrecio();
        }

        for (DetalleCompra detalle : detallesCompra) {
            total += detalle.getSubtotal();
        }

        return total;
    }

    // Calcula solamente el total de comida
    public double calcularTotalComida() {

        double total = 0;

        for (DetalleCompra detalle : detallesCompra) {
            total += detalle.getSubtotal();
        }

        return total;
    }

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

    public ArrayList<DetalleCompra> getDetallesCompra() {
        return detallesCompra;
    }
    public String getFecha() {
    return fecha;
    }

    public String getHora() {
    return hora;
    }
}