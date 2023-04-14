package ejercicio11Javier.src;

public class Main {
    public static void main(String[] args) {
        Utilidades a = new Utilidades(10);
        System.out.println("10 es mayor que 1: " + a.esMayor(1));
        System.out.println("10 es menor que 1: " + a.esMenor(1));
        System.out.println("10 es igual que 10: " + a.esIgual(10));
        System.out.println("10 es igual que '10': " + a.esIgual("10"));
    }
}