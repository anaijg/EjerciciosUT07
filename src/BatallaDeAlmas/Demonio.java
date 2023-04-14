package BatallaDeAlmas;

public class Demonio extends Incorporeo {
    private int maldad;

    public Demonio(int maldad) {
        this.maldad = maldad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    public void mostrar() {
        System.out.println("Maldad: " + maldad);
    }
}
