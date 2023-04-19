package Ejercicio12VictorAlarcon;

import java.time.LocalDate;

public class Revista extends Publicacion{

    private int numero;

    public Revista(int codigo, String titulo, LocalDate fechaPublicacion, int numero) {
        super(codigo, titulo, fechaPublicacion);
        this.numero=numero;
    }




    @Override
    public String toString() {
        return "Revista" + getTituto() +
                "numero=" + numero +
                "año " + getFechaPublicacion();
    }



}
