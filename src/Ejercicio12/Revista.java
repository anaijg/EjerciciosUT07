package Ejercicio12;

public class Revista  extends Publicacion{
    int numero;

    public Revista(String codigo, String titulo, int añoDePublicacion, int numero) {
        super(codigo, titulo, añoDePublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "La revista tiene el codigo: " + Codigo + ", titulo: " + titulo + ", año de publicacion " + añoDePublicacion + " y el numero de la revista es " + numero;
    }

    public void imprimirAño() {
        System.out.println(añoDePublicacion);
    }
    public void imprimirCodigo() {
        System.out.println(Codigo);
    }
}
