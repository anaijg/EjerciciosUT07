package ejercicio12Javier.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Libro l1 = new Libro(1, "El Quijote", 1505);
        Libro l2 = new Libro(2, "La Biblia", 0);
        Libro l3 = new Libro(3, "CleanCode", 2025);
        l3.prestar();

        libros.add(l1);
        libros.add(l2);
        libros.add(l3);

        cuentaPrestados(libros);

        Revista r1 = new Revista(5, "HOLA!", 2019, 45);
        Revista r2 = new Revista(8, "MARCA", 2018, 4);

        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.addAll(libros);
        publicaciones.add(r1);
        publicaciones.add(r2);

        publicacionesAnteriores(publicaciones, 2020);

    }

    public static void cuentaPrestados(ArrayList<Libro> libros) {
        StringBuilder sb = new StringBuilder();
        int prestados = 0;
        for (Libro l : libros) {
            if (l.prestado()) {
                prestados++;
                sb.append(", " + l.titulo);
            }
        }

        sb.delete(0, 2);
        System.out.println("Hay un total de " + prestados + " libros prestados: " +sb);
    }

    public static void publicacionesAnteriores(ArrayList<Publicacion> publicaciones, int año) {
        StringBuilder sb = new StringBuilder();
        int anteriores = 0;
        for (Publicacion p : publicaciones) {
            if (p.year < año) {
                anteriores++;
                sb.append(", " + p.titulo);
            }
        }
        sb.delete(0, 2);
        System.out.println("Hay un total de " + anteriores + " publicaciones anteriores a " + año + " los titulos son: " + sb);
    }
}