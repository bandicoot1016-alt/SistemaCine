package com.cine;

import java.util.ArrayList;

public class Funcion {

    private Pelicula pelicula;
    private Sala sala;
    private String fecha;
    private String hora;
    private double precio;
    private ArrayList<Asiento> asientos;

    public Funcion(Pelicula pelicula, Sala sala, String fecha, String hora, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.asientos = new ArrayList<>();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void generarAsientos() {

    int capacidad = sala.getCapacidad();

    int asientosPorFila = 10;

    int cantidadFilas = (int) Math.ceil((double) capacidad / asientosPorFila);

    for (int i = 0; i < cantidadFilas; i++) {

        String fila = String.valueOf((char) ('A' + i));

        for (int j = 1; j <= asientosPorFila; j++) {

            if (asientos.size() < capacidad) {
                asientos.add(new Asiento(fila, j));
            }
        }
    }
}
    public ArrayList<Asiento> getAsientos() {
    return asientos;
}
}