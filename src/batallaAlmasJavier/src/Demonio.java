package batallaAlmasJavier.src;

public class Demonio extends Incorporeo {
    //ATRIBUTOS
    private int bondad;
    private int maldad;

    private final int bondadDemonio = 0;

    //CONSTRUCTOR
    Demonio(int maldad) {
        this.bondad = bondadDemonio;
        this.maldad = maldad;
    }

    //SETTERS

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    //GETTERS

    public int bondad() {
        return bondad;
    }

    public int maldad() {
        return maldad;
    }

    //FUNCIONES

    @Override
    public void mostrar() {
        System.out.println("Maldad = " + maldad);
    }
}
