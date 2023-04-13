package Ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList libros = new ArrayList<>();
        cuentaPrestados(libros);

        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        int añoAnterior  = publicacionesAnteriores(publicaciones);
        System.out.println(añoAnterior);


    }

    private static ArrayList<Publicacion> crearPublicaciones(ArrayList<Publicacion> publicaciones) {
        Publicacion publicacion1 = new Libro("qweqwe", "qwewqeqwe", 2019);
        Publicacion publicacion2 = new Libro("qweqwe", "qwewqeqwe", 2010);
        Publicacion publicacion3 = new Libro("qweqwe", "qwewqeqwe", 2013);
        publicaciones.add(publicacion1);
        publicaciones.add(publicacion2);
        publicaciones.add(publicacion3);
        return publicaciones;
    }

    public static int cuentaPrestados(ArrayList<Libro> Libros) {
        int prestados = 0;
        ArrayList<Libro> libros = new ArrayList<>();
        CrearLibros(libros);
        for (Libro libreria: libros) {
            if (libreria.Prestado()) {
                prestados++;
            }
        }
        System.out.println(prestados);
        return prestados;
    }

    public static int publicacionesAnteriores(ArrayList<Publicacion> publicaciones) {
        int contador = 0;
        crearPublicaciones(publicaciones);
        for (Publicacion publicacion: publicaciones) {
            if (publicacion.añoDePublicacion < 2020) {
                contador++;
            }
        }
        return contador;
    }

    private static void CrearLibros(ArrayList<Libro> libros) {
        Libro libro1 = new Libro("1231eqwe", "avatar",1992);
        Libro libro2 = new Libro("1231eqwe", "El Rey leon",1992);
        Libro libro3 = new Libro("1231eqwe", "Disney",1992);
        libro1.Prestar();
        libro2.Prestar();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
    }
}
