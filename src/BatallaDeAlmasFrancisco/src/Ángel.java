public class Ángel extends Incorporeo {
    int bondad;
    int maldad;

    public Ángel(int bondad, int maldad) {
        this.bondad = bondad;
        this.maldad = maldad;
    }

    @Override
    public void mostrar() {
        System.out.println("Bondad: " + bondad);
    }
}
