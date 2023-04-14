package Ejercicio12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = CrearLibros();
        cuentaPrestados(libros);

        ArrayList<Publicacion> publicaciones = crearPublicaciones();
        int añoAnterior  = publicacionesAnteriores(publicaciones);
        System.out.println(añoAnterior);

        ArrayList<Libro>libros1 =  CrearMasLibros();
        cuentaPrestados(libros1);

        ArrayList<Revista> revistas = crearRevistas();

        ArrayList<Publicacion> conjunto = unirTodo(revistas, libros1);
        System.out.println(publicacionesAnteriores(conjunto));



    }

    // metodo nos une los ArrayList que tenemos creados de revista y libros
    private static ArrayList<Publicacion> unirTodo(ArrayList<Revista> revistas, ArrayList<Libro> libros1) {
        ArrayList<Publicacion> conjunto = new ArrayList<>();
        // metodo por el cual recorre el el tamaño de los dos array para añadirlos al nuevo conjunto
        AñadirTodo(revistas, libros1, conjunto);
        // Lo que realizamos aqui es comprobar el ArrayList que hemos creado de la union e imprimimos el nombre para comprobar cuales se han añadido
        ImprimirConjunto(conjunto);
        return conjunto;
    }

    private static void AñadirTodo(ArrayList<Revista> revistas, ArrayList<Libro> libros1, ArrayList<Publicacion> conjunto) {
        for (int i = 0; i < revistas.size() + libros1.size() ; i++) {
            if (i < revistas.size()) {
                conjunto.add(revistas.get(i));
            } else  {
                // Añadimos el indice de i - revistas.size() porque al haber recorrido
                // todo el array de revista, queremos que tome el indice 0 de libros
                conjunto.add(libros1.get(i - revistas.size()));
            }
        }
    }

    private static void ImprimirConjunto(ArrayList<Publicacion> conjunto) {
        for (Publicacion unir : conjunto) {
            System.out.println(unir.titulo);
        }
    }

    private static ArrayList<Libro> CrearMasLibros() {
        ArrayList<Libro> libros2 = new ArrayList<>();
        Libro libro1 = new Libro("1234", "avatar",1992);
        Libro libro2 = new Libro("1235", "El Rey leon",1992);
        Libro libro3 = new Libro("1236", "Disney",1992);
        libro1.Prestar();
        libros2.add(libro1);
        libros2.add(libro2);
        libros2.add(libro3);
        return libros2;
    }

    private static ArrayList<Revista> crearRevistas() {
        ArrayList<Revista> revistas = new ArrayList<>();
        Revista revista1 = new Revista("1", "El pepe", 2010, 12);
        Revista revista2 = new Revista("2", "Etesech", 2012, 10);
        revistas.add(revista1);
        revistas.add(revista2);
        return revistas;
    }

    private static ArrayList<Publicacion> crearPublicaciones() {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
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
        for (Libro libreria: Libros) {
            if (libreria.Prestado()) {
                prestados++;
            }
        }
        System.out.println(prestados);
        return prestados;
    }

    public static int publicacionesAnteriores(ArrayList<Publicacion> publicaciones) {
        int contador = 0;
        for (Publicacion publicacion: publicaciones) {
            if (publicacion.añoDePublicacion < 2020) {
                contador++;
            }
        }
        return contador;
    }

    private static ArrayList<Libro> CrearLibros() {
        ArrayList<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("1231eqwe", "avatar",1992);
        Libro libro2 = new Libro("1231eqwe", "El Rey leon",1992);
        Libro libro3 = new Libro("1231eqwe", "Disney",1992);
        libro1.Prestar();
        libro2.Prestar();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        return libros;
    }
}
