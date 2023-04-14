package Biblioteca;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 12:49
 * @version version 1.0
 *
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * Mantenimiento y gestión de publicaciones en una biblioteca.
 * */
public class Main {

    public static void main(String[] args) {

        int anyo = 2019;
        // Creación de libros con sus datos
        Libro l1 = new Libro("l1000", "La historia interminable", 1979);
        Libro l2 = new Libro("l2000","Los pilares de la tierra", 1989);
        Libro l3 = new Libro("l3000", "La naranja mecánica", 1962);

        // Creación de revistas con sus datos
        Revista r1 = new Revista("r1000", "Investigación y Ciencia", 2023, 532);
        Revista r2 = new Revista("r1000", "QUO", 2022, 1023);
        Revista r3 = new Revista("r1000", "Muy interesante", 2019, 300);

        // Creación de ArrayLists con libros y publicaciones
        ArrayList<Libro> libros = new ArrayList<Libro>();
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        // Creación de libros
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);

        // Creación de ArrayList de publicaciones con los libros y las revistas
        publicaciones.add(l1);
        publicaciones.add(l2);
        publicaciones.add(l3);
        publicaciones.add(r1);
        publicaciones.add(r2);
        publicaciones.add(r3);

        for(Object estado: publicaciones )
        {
            System.out.println(estado);
        }

        System.out.println("Se ha prestado algún libro.");
        l2.setPrestado(true);
        for(Object estado: publicaciones )
        {
            System.out.println(estado);
        }

        // Muestra cuantows libros estan prestados
        System.out.println("Se han prestado "+cuentaPrestados(libros)+" libros.");
        System.out.println("Publicaiones anteriores a : " + anyo);
        System.out.println( publicacionesAnteriores(publicaciones,anyo));


    }
    public static int cuentaPrestados(ArrayList<Libro> l){

        int cuenta = 0;
        for(int i =0; i<l.size();i++){
            if(l.get(i).isPrestado()){
                cuenta++;
            }

        }
        return cuenta;
    }

    public static int publicacionesAnteriores(ArrayList<Publicacion> publicaciones, int anyo){

        int cuenta = 0;
        for(int i =0; i<publicaciones.size();i++){
            if(publicaciones.get(i).getAnyo() < anyo){
                cuenta++;
            }

        }
        return cuenta;
    }
}
