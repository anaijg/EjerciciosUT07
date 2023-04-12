package BatallaDeAlmas;

import java.util.ArrayList;

public class Humano extends Ser {
    private int fe;
    private ArrayList<Angel> angeles;
    private ArrayList<Demonio> demonios;

    public Humano(int fe) {
        this.fe = fe;
        this.angeles = new ArrayList<>();
        this.demonios = new ArrayList<>();
        añadirÁngel();
        añadirDemonio();
    }

    public void añadirÁngel() {
        int bondad = (int) (Math.random() * 101);
        Angel angel = new Angel(bondad);
        angeles.add(angel);
    }

    public void añadirDemonio() {
        int maldad = (int) (Math.random() * 101);
        Demonio demonio = new Demonio(maldad);
        demonios.add(demonio);
    }

    public void rezar() {
        fe++;
        añadirÁngel();
    }

    public void pecar() {
        fe--;
        añadirDemonio();
    }

    public void mostrar() {
        System.out.println("\nDatos del Humano");
        System.out.println("==================================");
        System.out.println("Fe: " + fe);
        System.out.println("Número de ángeles: " + angeles.size());
        System.out.println("Número de demonios: " + demonios.size());
    }

    public int getFe() {
        return fe;
    }

    public ArrayList<Angel> getAngeles() {
        return angeles;
    }

    public ArrayList<Demonio> getDemonios() {
        return demonios;
    }
}
