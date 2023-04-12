package laBatallaDeLasAlmas;

public class Ángel extends Incorpóreo {
    int bondad;
    int maldad;

    public Ángel(int bondad, int maldad) {
        this.bondad = bondad;
        this.maldad = 0;
    }

    public void mostrar(){
        System.out.println("Ángel: " + bondad);
    }
}
