package com.ebac;

import java.util.List;
import java.util.stream.Stream;

public class Biblioteca {

    private List<Autor> autorList;
    private List<Book> bookList;
    private List<Usuario> usuarioList;

    public Biblioteca(List<Autor> autorList, List<Book> bookList, List<Usuario> usuarioList) {
        this.autorList = autorList;
        this.bookList = bookList;
        this.usuarioList = usuarioList;
    }

    public void getAutorList() throws Exception {
        if (autorList.isEmpty()) {
            throw new Exception("La lista 'autores' está vacia");
        } else {
            autorList.forEach(System.out::println);
        }
    }

    public void getBookList() throws Exception {
        if(bookList.isEmpty()) {
            throw new Exception("La lista 'libros' está vacia");
        } else {
            bookList.forEach(System.out::println);
        }
    }

    public void getUsuarioList() throws Exception {
        if(usuarioList.isEmpty()) {
            throw new Exception("La lista de 'usuarios' está vacia");
        } else {
            usuarioList.forEach(System.out::println);
        }
    }

    public void addAutorList(Autor autor) throws Exception {
        if(autorList.contains(autor)) {
            throw new Exception("Error: El autor ya está registrado");
        } else {
            autorList.add(autor);
        }
    }

    public void addBookList(Book book) throws Exception {
        if(bookList.contains(book)) {
            throw new Exception("Error: El usuario ya está registrado");
        } else {
            bookList.add(book);
        }
    }

    public void addUserList(Usuario usuario) throws Exception {
        if(usuarioList.contains(usuario)) {
            throw new Exception("Error: El usuario ya está registrado");
        } else {
            usuarioList.add(usuario);
        }
    }

    public void removeAutorList(Autor autor) throws Exception {
        if(autorList.contains(autor)) {
            autorList.remove(autor);
        } else {
            throw new Exception("Error: El 'autor no se encuentra en la lista");
        }
    }

    public void removeBookList(Book book) throws Exception {
        if(bookList.contains(book)) {
            bookList.remove(book);
        } else {
            throw new Exception("Error: El 'libro' no se encuentra en la lista");
        }
    }

    public void removeUserList(Usuario usuario) throws Exception {
        if(usuarioList.contains(usuario)) {
            usuarioList.remove(usuario);
        } else {
            throw new Exception("Error: El 'usuario' no se encuentra en la lista");
        }
    }

    public boolean validacion(List<Usuario> list, String name, String apellido) {
        Stream<Usuario> usuarioStream = list.stream();
        return usuarioStream
                .map(u -> u.getNombre() + u.getApellido())
                .anyMatch(n -> n.equals(name.concat(apellido)));
    }

    public long cuentaAutores(List<Autor> list) {
        Stream<Autor> autorStream = list.stream();
        return autorStream.count();
    }

    public boolean prestamosMasDe10(List<Usuario> list) {
        Stream<Usuario> usuarioStream = list.stream();
        return usuarioStream.anyMatch(u -> u.getLibrosPrestados() > 10);
    }

    public long totalDePrestamos(List<Usuario> list) {
        Stream<Usuario> usuarioStream = list.stream();
        return usuarioStream
                .map(u -> u.getLibrosPrestados())
                .reduce((l1, l2) -> l1 + l2).orElse(0);
    }

    public boolean librosAntes2010(List<Book> list) {
        Stream<Book> bookStream = list.stream();
        return bookStream.allMatch(p -> p.getPublicacion() < 2010);
    }

    public void primerLibro(List<Book> list) throws Exception {
        Stream<Book> bookStream = list.stream();
        System.out.println(bookStream.findFirst().orElseThrow(() ->
                new Exception("La lista de 'usuarios' está vacia")));
    }

    public void autoresConF(List<Autor> list) {
        Stream<Autor> autorStream = list.stream();
        autorStream
                .map(a -> a.getNombre())
                .filter(n -> n.startsWith("F"))
                .forEach(n -> System.out.print("[" + n + "] "));
        System.out.println();
    }

    public void usuariosMenos5(List<Usuario> list) {
        Stream<Usuario> usuarioStream = list.stream();
        usuarioStream
                .filter(l -> l.getLibrosPrestados() < 5)
                .map(u -> u.getNombre())
                .forEach(u -> System.out.print("[" + u + "] "));
        System.out.println();
    }

    public void librosOrden(List<Book> list) {
        Stream<Book> bookStream = list.stream();
        bookStream
                .map(l -> l.getTitulo())
                .sorted()
                .forEach(n -> System.out.print("[" + n + "] "));
        System.out.println();
    }

    public void apellidosUsuario(List<Usuario> list) {
        Stream<Usuario> usuarioStream = list.stream();
        usuarioStream
                .map(a -> a.getApellido())
                .sorted()
                .forEach(a -> System.out.print("[" + a + "] "));
        System.out.println();
    }

    public void librosBloqueados(List<Book> list) {
        Stream<Book> bookStream = list.stream();
        bookStream
                .map(l -> l.getTitulo())
                .filter(t -> t.equals("Rey") || t.equals("Lago"))
                .forEach(t -> System.out.print("[" + t + "] "));
        System.out.println();
    }

}
