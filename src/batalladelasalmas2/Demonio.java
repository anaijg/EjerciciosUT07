package batalladelasalmas2;

public class Demonio extends Incorporeo{
    private int bondad;
    private int maldad;
    public Demonio(int maldad){
        this.maldad= maldad;
        this.bondad=0;

    }

    @Override
    public void mostrar() {


    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    @Override
    public String toString() {
        return "Demonio{" +
                "maldad=" + maldad +
                '}';
    }
}
