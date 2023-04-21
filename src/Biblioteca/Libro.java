package Biblioteca;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 12:10
 * @version version 1.0
 */

public class Libro extends Publicacion implements Prestable{

    private boolean prestado;


    /**
     * Constructor paramaetrizado:
     *
     * @param codigo : codigo del elemento
     * @param titulo : tiltulo del elemento
     * @param anyo   : año de salida
     */
    public Libro(String codigo, String titulo, int anyo) {
        super(codigo, titulo, anyo);
        this.prestado = false;
    }



    /**
     * @return prestado: indica si el libro está prestado o no
     * */
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    /**
     * @return anyo: devuelve el año de publicación del libro
     * */
    public int muestraAnyo(){

        return getAnyo();
    }

    /**
     * @return codigo: devuelve el codigo del libro
     * */
    public String muestraCodigo(){

        return getCodigo();
    }
    @Override
    public String toString() {
        return  "Codigo : " + getCodigo() +
                "\nTutilo : " + getTitulo() +
                "\nAño : " +getAnyo() +
                "\nPrestado :" + prestado +
                "\n";
    }

    // Metodos implementados de la interface Prestable
    @Override
    public void prestar() {

        if (!isPrestado()) {
            setPrestado(true);
        }

    }

    @Override
    public void devolver() {

        if(isPrestado()) {
            setPrestado(false);
        }
    }

    @Override
    public void prestado() {

        setPrestado(true);
    }
}
