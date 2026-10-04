package com.cine;

public class Cliente {

    private String nombre;
    private String documento;
    private int edad;
    private boolean estudiante;

    public Cliente(String nombre, String documento, int edad, boolean estudiante) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.estudiante = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }
}