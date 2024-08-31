package com.ebac;

public class Book {

    private final String titulo;
    private final String autor;
    private final int publicacion;
    private final int isbn;

    public Book(String titulo, String autor, int publicacion, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", publicacion=" + publicacion +
                ", isbn=" + isbn +
                '}';
    }
}
