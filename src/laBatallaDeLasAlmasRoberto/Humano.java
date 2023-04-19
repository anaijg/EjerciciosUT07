package laBatallaDeLasAlmas;

import java.util.ArrayList;

public class Humano extends Ser implements Espiritual {

    private double fe;

    ArrayList<Ángel>ángeles = new ArrayList<>();
    ArrayList<Demonio>demonios = new ArrayList<>();

    public Humano(double fe) {
        this.fe = fe;
        añadirÁngel();
        añadirDemonio();
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }
    public void rezar(){
        añadirÁngel();
        fe++;
        }


    public void pecar(){
        añadirDemonio();
        fe--;
    }

    public void añadirÁngel(){
        int bondad = (int)(Math.random() * 100);
        Ángel a = new Ángel(bondad,0);
        ángeles.add(a);
    }

    public void añadirDemonio(){
        int maldad = (int) (Math.random() * 100);
        demonios.add(new Demonio(0,maldad));
    }

    @Override
    public void mostrar() {
        System.out.println("Datos del Humano: ");
        System.out.println("================= ");
        System.out.println("Fe: " + fe);
        System.out.println("El Humano tiene: " + ángeles.size() + " ángeles.");
        System.out.println("El Humano tiene: " + demonios.size() + " demonios.");

    }
}
