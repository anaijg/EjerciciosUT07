package ejercicio12Javier.src;

abstract class Publicacion {
    //ATRIBUTOS
    protected int codigo;
    protected String titulo;
    protected int year;

    //CONSTRUCTOR
    public Publicacion(int codigo, String titulo, int year) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.year = year;
    }

    //GETTER

    public int codigo() {
        return codigo;
    }

    public int year() {
        return year;
    }

    public String titulo() {
        return titulo;
    }
}
