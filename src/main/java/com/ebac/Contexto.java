package com.ebac;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Contexto {

    public static void main(String[] args) throws Exception {

        //Autores
        Autor autor = new Autor("Francisco", "Sanchez", 10);
        Autor autor1 = new Autor("Fernando", "Carrillo", 8);
        Autor autor2 = new Autor("Juan", "Milton", 2);

        //Libros
        Book book = new Book("Lago", "Juan", 1998, 1111);
        Book book1 = new Book("Cisne", "Fernando", 2002, 2222);
        Book book2 = new Book("Rey", "Francisco", 2005, 3333);

        //Usuarios
        Usuario usuario = new Usuario("Bladimir", "Landa", "@1", 8);
        Usuario usuario1 = new Usuario("Galy", "Sanchez", "@2", 2);
        Usuario usuario2 = new Usuario("Omar", "Perez", "@3", 20);

        //Listas
        List<Autor> autores = new ArrayList<>();
        List<Book> libros = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();

        //Biblioteca
        Biblioteca biblioteca = new Biblioteca(autores, libros, usuarios);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Dame tu nombre: ");
        String name = bufferedReader.readLine();
        System.out.print("Dame tu apellido: ");
        String apellido = bufferedReader.readLine();
        System.out.println("Se recibieron ambos valores: " + StringUtils.containsAny(name, apellido));

        //Lista Autores
        biblioteca.addAutorList(autor);
        biblioteca.addAutorList(autor1);
        biblioteca.addAutorList(autor2);
        biblioteca.removeAutorList(autor2);

        biblioteca.addAutorList(autor2);

        //Lista Libros
        biblioteca.addBookList(book);
        biblioteca.addBookList(book1);
        biblioteca.addBookList(book2);
        biblioteca.removeBookList(book2);

        biblioteca.addBookList(book2);

        //Lista Usuarios
        biblioteca.addUserList(usuario);
        biblioteca.addUserList(usuario1);
        biblioteca.addUserList(usuario2);
        biblioteca.removeUserList(usuario2);

        biblioteca.addUserList(usuario2);

        //Listas
        System.out.println("Lista de Autores");
        biblioteca.getAutorList();
        System.out.println("Lista de Libros");
        biblioteca.getBookList();
        System.out.println("Lista de Usuarios");
        biblioteca.getUsuarioList();

        System.out.println("---------------");

        //Sistema Validación
        System.out.println(name + apellido +" " + "está registrado: " + biblioteca.validacion(usuarios, name, apellido));
        //Sistema Biblioteca
        System.out.println("La cuenta de autores es: " + biblioteca.cuentaAutores(autores));
        System.out.println("Alguno usuario tiene más de 10 libros prestados: " + biblioteca.prestamosMasDe10(usuarios));
        System.out.println("Total de libros prestados: " + biblioteca.totalDePrestamos(usuarios));
        System.out.println("Todos los libros fueron publicados antes del 2010: "+ biblioteca.librosAntes2010(libros));
        biblioteca.primerLibro(libros);
        biblioteca.autoresConF(autores);
        biblioteca.usuariosMenos5(usuarios);
        biblioteca.librosOrden(libros);
        biblioteca.apellidosUsuario(usuarios);
        biblioteca.librosBloqueados(libros);

    }

}
