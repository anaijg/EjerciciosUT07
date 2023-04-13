package Ejercicio12;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;
    public Libro(String codigo, String titulo, int añoDePublicacion) {
        super(codigo, titulo, añoDePublicacion);
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "El libro: " + titulo + " con el codigo: " + Codigo + " y el año de publicacion, esta prestado? " + prestado;
    }

    public void imprimirAño() {
        System.out.println(añoDePublicacion);
    }
    public void imprimirCodigo() {
        System.out.println(Codigo);
    }

    @Override
    public boolean Prestar() {
        this.prestado = true;
        return prestado;
    }

    @Override
    public boolean Devolver() {
        this.prestado = false;
        return prestado;
    }

    @Override
    public boolean Prestado() {
        return prestado;
    }
}
