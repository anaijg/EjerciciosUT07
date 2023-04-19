package Ejercicio12VictorAlarcon;

import java.time.LocalDate;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;


    public Libro(int codigo, String titulo, LocalDate fechaPublicacion) {
        super(codigo, titulo, fechaPublicacion);
        this.prestado=false;
    }



    @Override
    public String toString() {
        return "El codigo es " + getCodigo() + " El titulo es" + getTituto() + " lo publicaron en " + getFechaPublicacion();
    }


    @Override
    public void prestar() {
        prestado= true;
    }

    @Override
    public void devolver() {
        prestado=false;

    }

    @Override
    public boolean prestado() {

        return prestado;
    }

}
