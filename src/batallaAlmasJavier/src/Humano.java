package batallaAlmasJavier.src;

import java.util.ArrayList;

public class Humano extends Ser implements Espiritual {
    //ATRIBUTOS
    ArrayList<Demonio> demonios;
    private double fe;
    ArrayList<Angel> angeles;

    //CONSTRUCTOR
    public Humano(double fe) {
        this.fe = fe;
        this.angeles = new ArrayList<>();
        añadirAngel();
        this.demonios = new ArrayList<>();
        añadirDemonio();
    }

    //GETTER

    public double fe() {
        return fe;
    }

    //SETTER

    public void setFe(double fe) {
        this.fe = fe;
    }

    //FUNCIONES

    @Override
    public void mostrar() {
        System.out.println("\nDatos del Humano:\n======\nFe: " + fe + "\nEl humano tiene " + angeles.size() + " angeles\nEl humano tiene " + demonios.size() + " demonios");
    }

    public void rezar() {
        fe++;
        añadirAngel();
    }

    public void pecar() {
        fe--;
        añadirDemonio();
    }

    public void añadirAngel() {
        Angel angel = new Angel(generar());
        angeles.add(angel);
    }

    public void añadirDemonio() {
        Demonio demonio = new Demonio(generar());
        demonios.add(demonio);
    }

    private int generar() {
        return (int) (Math.random() * (100 - 0 +1) + 0);
    }

}
