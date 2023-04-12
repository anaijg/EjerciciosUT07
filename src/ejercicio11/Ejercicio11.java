package ejercicio11;

public class Ejercicio11 implements Relaciones{
    int a;
    @Override
    public boolean esMayor(Object b) {
        if (b instanceof Integer) {
            if (a > (int) b) {
                return true;
            }
            return false;
        }

        return false;
    }

    @Override
    public boolean esMenor(Object b) {
        if (b instanceof Integer) {
            if (a < (int) b) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        if (b instanceof Integer) {
            if (a == (int) b) {
                return true;
            }
        }
        return false;
    }
}
