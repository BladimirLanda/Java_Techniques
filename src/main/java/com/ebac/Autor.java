package com.ebac;

public class Autor {

    private final String nombre;
    private final String apellido;
    private final int libros;

    public Autor(String nombre, String apellido, int libros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLibros() {
        return libros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", libros=" + libros +
                '}';
    }
}
