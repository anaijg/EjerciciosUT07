package Ejercicio12VictorAlarcon;

import java.time.LocalDate;

public abstract class Publicacion {
    private int codigo;
    private String tituto;
    private LocalDate fechaPublicacion;

    public Publicacion(int codigo, String titulo, LocalDate fechaPublicacion){
        this.codigo= codigo;
        this.tituto=titulo;
        this.fechaPublicacion=fechaPublicacion;
    }

    public  int getCodigo(){
        return codigo;
    };

    public  LocalDate getFechaPublicacion(){
        return fechaPublicacion;
    }

    public  String getTituto(){
        return tituto;
    }

}
