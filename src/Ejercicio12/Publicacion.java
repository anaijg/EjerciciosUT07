package Ejercicio12;

public abstract class Publicacion {
    String Codigo;
    String titulo;
    int añoDePublicacion;

    public Publicacion(String codigo, String titulo, int añoDePublicacion) {
        this.Codigo = codigo;
        this.titulo = titulo;
        this.añoDePublicacion = añoDePublicacion;
    }
}
