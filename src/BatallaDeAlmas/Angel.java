package BatallaDeAlmas;

import BatallaDeAlmas.Incorporeo;

public class Angel extends Incorporeo {
    protected int bondad;

    public Angel(int bondad) {
        this.bondad = bondad;
    }

    public int getBondad() {
        return bondad;
    }

    public void mostrar() {
        System.out.println("Bondad: " + bondad);
    }
}
