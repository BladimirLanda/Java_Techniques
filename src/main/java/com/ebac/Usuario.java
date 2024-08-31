package com.ebac;

public class Usuario {

    private final String nombre;
    private final String apellido;
    private String correo;
    private int librosPrestados;

    public Usuario(String nombre, String apellido, String correo, int librosPrestados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.librosPrestados = librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", librosPrestados=" + librosPrestados +
                '}';
    }
}
