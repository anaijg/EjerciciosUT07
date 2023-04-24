package ejercicio11Roberto;

public class Complementos implements Relaciones {
    private int a;


    public Complementos(int a) {
        this.a = a;
    }

    @Override
    public boolean esMayor(Object b) {
        if (b instanceof Integer) { // esta variable comprueba que b es un entero.
            return a > (int) b;
        }else {
            System.out.println("Esto que has escrito no es un numero.");
        }
        return false;
    }

    @Override
    public boolean esMenor(Object b) {
        if (b instanceof Integer) {  // esta variable comprueba que b es un entero.
            if (a < (int) b) {
            }else {
                System.out.println("Esto que has escrito no es un numero.");
            }
        }
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        if (b instanceof Integer) {  // esta variable comprueba que b es un entero.
            if (a == (int) b) {
                return true;
            }else {
                System.out.println("Esto que has escrito no es un numero.");
            }
        }
        return false;
    }
}
