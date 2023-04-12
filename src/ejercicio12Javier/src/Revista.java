package ejercicio12Javier.src;

public class Revista extends Publicacion {
    //ATRIBUTOS
    private int numero;

    //CONSTRUCTOR
    public Revista(int codigo, String titulo, int year, int numero) {
        super(codigo, titulo, year);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista: " + titulo +
                " numero: " + numero +
                " año: " + year;
    }
}
