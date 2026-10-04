package com.cine;

public class Sala {

    private int numero;
    private String tipo;
    private int capacidad;

    public Sala(int numero, String tipo, int capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}