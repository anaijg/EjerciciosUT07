package batalladelasalmas2;

public class Angel extends Incorporeo{
    private int bondad;
    private int maldad;

    public Angel(int bondad){
        this.bondad=bondad;
        this.maldad=0;

    }

    @Override
    public void mostrar() {

    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    @Override
    public String toString() {
        return "Angel{" +
                "bondad=" + bondad +
                '}';
    }
}
