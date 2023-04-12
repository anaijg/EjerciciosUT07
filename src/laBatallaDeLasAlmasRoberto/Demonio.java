package laBatallaDeLasAlmas;

    public class Demonio extends Incorpóreo{
    private int bondad;
    private int maldad;

    public Demonio(int bondad, int maldad) {
        this.bondad = 0;
        this.maldad = maldad;

    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    public void mostrar(){
        System.out.println("Demonio: " + maldad);
    }
}
