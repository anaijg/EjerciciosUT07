package batallaAlmasJavier.src;

public class Angel extends Incorporeo {
    //ATRIBUTOS
    int bondad;
    int maldad;

    private final int maldadAngel = 0;

    //CONSTRUCTOR
    public Angel(int bondad) {
        this.bondad = bondad;
        this.maldad = maldadAngel;
    }

    //FUNCIONES

    @Override
    public void mostrar() {
        System.out.println("Bondad = " + bondad);
    }
}
