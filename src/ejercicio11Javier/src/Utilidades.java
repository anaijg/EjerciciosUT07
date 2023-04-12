package ejercicio11Javier.src;

import java.util.ArrayList;

public class Utilidades implements Relaciones{

    private int a;

    public Utilidades(int a) {
        this.a = a;
    }

    @Override
    public boolean esMayor(Object b) {
        return a > casting(b);
    }

    @Override
    public boolean esMenor(Object b) {
        return a < casting(b);
    }

    @Override
    public boolean esIgual(Object b) {
        return a == casting(b);
    }

    private int casting(Object object) {
        if (object instanceof Integer) {
            return (int) object;
        }else {
            System.out.println("\nEsto no es un número");
            return 0;
        }

    }
}
