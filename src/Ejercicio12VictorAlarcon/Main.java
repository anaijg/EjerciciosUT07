package Ejercicio12VictorAlarcon;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros= new ArrayList<>();
        Libro libro1= new Libro(1,"Harry potter 1", LocalDate.of(1997,05,23));
        Libro libro2= new Libro(2,"Harry potter 2", LocalDate.of(1998,05,23));
        Libro libro3= new Libro(3,"Harry potter 3", LocalDate.of(1999,05,23));
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libro3.prestar();
        libro1.prestar();
        System.out.println(libros);
        System.out.println(cuentaPrestados(libros));

        Revista revista1 = new Revista(4,"Marca",LocalDate.of(2018,05,20),35231);
        Revista revista2 = new Revista(4,"Motores",LocalDate.of(2012,04,20),531);

        ArrayList<Publicacion> totalPublicaciones = new ArrayList<>();
        totalPublicaciones.addAll(libros);
        totalPublicaciones.add(revista1);
        totalPublicaciones.add(revista2);
        System.out.println(totalPublicaciones);
        System.out.println(publicacionesAnterioresA(totalPublicaciones,LocalDate.of(2022,01,01)));

    }
    public static int cuentaPrestados(ArrayList<Libro> libros){
        int contadorLibrosPrestado = 0;
        for (Libro libroPrestado: libros) {
            if (libroPrestado.prestado()){
                contadorLibrosPrestado++;
            }
        }
        return contadorLibrosPrestado;
    }
    public static int publicacionesAnterioresA(ArrayList<Publicacion> publicacionesAnteriores, LocalDate year){
        int contadorPublicacionesAnteriores = 0;
        for (Publicacion publicacionesInferiores: publicacionesAnteriores) {
            if (publicacionesInferiores.getFechaPublicacion().compareTo(year)< 0){

                contadorPublicacionesAnteriores++;
            }

        }
        return contadorPublicacionesAnteriores;
    }
}
