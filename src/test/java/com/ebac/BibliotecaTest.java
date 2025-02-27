package com.ebac;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private final List<Autor> autorList = List.of
                    (new Autor("Vianney", "Sanchez", 5),
                    new Autor("Santiago", "Carrillo", 10));
    private final List<Book> bookList = List.of
                    (new Book("Lago", "Mateo", 1995, 1111),
                    new Book("Cisne", "Daniel", 2011, 2222));
    private final List<Usuario> usuarioList = List.of
                    (new Usuario("Raziel", "Landa", "@1", 10),
                    new Usuario("Ceci", "Sanchez", "@2", 1));

    @Before
    public void setup() {
        biblioteca = new Biblioteca(autorList, bookList, usuarioList);
    }

    @Test
    public void validacion() {
        boolean expect = true;
        boolean actual = biblioteca.validacion(usuarioList, "Raziel", "Landa");

        assertEquals(expect, actual);
    }

    @Test
    public void cuentaAutores() {
        long expect = 2;
        long actual = biblioteca.cuentaAutores(autorList);

        assertEquals(expect, actual);
    }

    @Test
    public void prestamosMasDe10() {
        boolean expect = false;
        boolean actual = biblioteca.prestamosMasDe10(usuarioList);

        assertEquals(expect, actual);
    }

    @Test
    public void totalDePrestamos() {
        long expect = 11;
        long actual = biblioteca.totalDePrestamos(usuarioList);

        assertEquals(expect, actual);
    }

    @Test
    public void librosAntes2010() {
        boolean expect = false;
        boolean actual = biblioteca.librosAntes2010(bookList);

        assertEquals(expect, actual);
    }
}