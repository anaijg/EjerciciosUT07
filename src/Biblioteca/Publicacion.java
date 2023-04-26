package Biblioteca;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 12:03
 * @version version 1.0
 */

/**
 * Alcmacenamiento y gestión de libros y revistas en una biblioteca
 *
 *
 */
public abstract class Publicacion {

    // Atributos
    // código: almacena el código del libro/revista
    // título: almacena el título del libro/revista
    // anyo: almacena el año de salida
    private String codigo;
    private String titulo;
    private int anyo;

    /**
     * Constructor paramaetrizado:
     * @param codigo: codigo del elemento
     * @param titulo: tiltulo del elemento
     * @param anyo: año de salida
     * */
    public Publicacion(String codigo, String titulo, int anyo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyo = anyo;
    }

    /**
     * @return codigo: el codigo del elemento
     * */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return titulo: el titulo del elemento
     *
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return anyo: el año del elemento
     * */
    public int getAnyo() {
        return anyo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
}
