package batalladelasalmas2;

import java.util.ArrayList;

public class Humano extends Ser implements Espiritual{

    ArrayList<Demonio> demonios;
    private double fe;
    ArrayList<Angel> angeles;
    public Humano(double fe){
        this.fe=fe;
        this.angeles= new ArrayList<>();
        this.demonios= new ArrayList<>();
        añadirAngel();
    }

    @Override
    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del Humano");
        sb.append("\n=================");
        sb.append("\nFe:" + this.fe);
        sb.append("\nEl humano tiene " + angeles.size() + " ángeles");
        sb.append(angeles);
        sb.append("\nEl humano tiene " + demonios.size() + " demonios");
        sb.append(demonios);
        System.out.println(sb);


    }
    public void añadirAngel(){
        int bondad = (int)(Math.random() * 100 + 1);
        Angel nuevoAngel = new Angel(bondad);
        angeles.add(nuevoAngel);
    }
    public void añadirDemonio(){
        int maldad = (int)(Math.random() * 100 + 1);
        Demonio nuevoDemonio = new Demonio(maldad);
        demonios.add(nuevoDemonio);
    }
    public void rezar(){
        this.fe++;
        añadirAngel();
    }
    public void pecar(){
        this.fe--;
        añadirDemonio();
    }



}
