package Biblioteca;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 12:20
 * @version version 1.0
 *
 */



public class Revista extends Publicacion {

    private  int numero;

    /**
     * Constructor parametrizado
     * @param codigo: codigo del elemento
     * @param titulo: tiltulo del elemento
     * @param anyo: año de salida
     * @param numero: es el numero de la revista
     *
     * */
    public Revista(String codigo, String titulo, int anyo, int numero) {
        super(codigo, titulo, anyo);
        this.numero = numero;
    }

    /**
     * @return numero: número identificador de la revista
     * */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  "Codigo :" + getCodigo() +
                "\nTitulo : " + getTitulo() +
                "\nAño : " + getAnyo() +
                "\nNumero : "  + numero +
                "\n";
    }
}
