package com.deber11.ejercicio2.model;

public class Mascotas {
    private int id;
    private String nombre, especie, propietario;
    private int fechaNacimient;

    public Mascotas() {
    }

    public Mascotas(int id, String nombre, String especie, int fechaNacimient, String propietario) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimient = fechaNacimient;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getFechaNacimient() {
        return fechaNacimient;
    }

    public void setFechaNacimient(int fechaNacimient) {
        this.fechaNacimient = fechaNacimient;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
