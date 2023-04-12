package ejercicio12Javier.src;

public class Libro extends Publicacion implements Prestable {
    //ATRIBUTOS
    private boolean prestado;

    //CONSTRUCTOR
    public Libro(int codigo, String titulo, int year) {
        super(codigo, titulo, year);
        this.prestado = false;
    }

    //FUNCIONES
    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " año: " + year + " codigo: " + codigo +
                " prestado: " + prestado;
    }
}
