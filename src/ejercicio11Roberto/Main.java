package ejercicio11Roberto;

public class Main {
    public static void main(String[] args) {
        Complementos a = new Complementos(11);

        System.out.println("11 es igual que 11: " + a.esIgual(11));
        System.out.println("11 es menor que 5: " + a.esMenor(5));
        System.out.println("11 es mayor que 8: " + a.esMayor(8));


    }
}
