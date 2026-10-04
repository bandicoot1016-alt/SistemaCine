package com.cine;

public class Asiento {

    private String fila;
    private int numero;
    private boolean ocupado;

    public Asiento(String fila, int numero) {
        this.fila = fila;
        this.numero = numero;
        this.ocupado = false;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}