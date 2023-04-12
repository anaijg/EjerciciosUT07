import java.util.ArrayList;

public class Humano extends Ser implements Espiritual {
    ArrayList<Demonio> demonios;
    private double fe;
    ArrayList<Ángel> ángeles;

    public Humano(double fe) {
        this.fe = fe;
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

    @Override
    public void mostrar() {

    }
}
