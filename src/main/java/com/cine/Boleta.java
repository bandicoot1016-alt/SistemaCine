package com.cine;

public class Boleta {

    private Cliente cliente;
    private Funcion funcion;
    private Asiento asiento;
    private double precio;

    public Boleta(Cliente cliente, Funcion funcion, Asiento asiento, double precio) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}