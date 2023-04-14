package ejercicioRolChristian;

public class CampoDeBatalla {
    public static void main(String[] args) {

        Humano h = new Humano(50);
        h.mostrar();
            luchar(h);
            h.rezar();
            h.rezar();
            h.pecar();
        System.out.println("\nTras rezar dos veces y pecar una vez:");
            h.mostrar();
    }

    public static void luchar(Humano h) {
        System.out.println("\nCombate entre ángeles y demonios: ");
        System.out.println("==================================");
        int sumaBondad = 0;
        for (int i = 0; i < h.ángeles.size(); i++) {
            sumaBondad = sumaBondad + h.ángeles.get(i).bondad;
        }
        System.out.println("Bondad de los ángeles: " + sumaBondad);
        double sumaMaldad = 0;
        for (int i = 0; i < h.demonios.size(); i++) {
            sumaMaldad = sumaMaldad + h.demonios.get(i).getMaldad();
        }
        System.out.println("Maldad de los demonios: " + sumaMaldad);
        if (sumaBondad > sumaMaldad) {
            h.rezar();
            System.out.println(sumaBondad + " > " + sumaMaldad  + " --> El humano reza, por lo que tiene un ángel más y la fe del humano aumenta.");
        } else if (sumaBondad < sumaMaldad) {
            h.pecar();
            System.out.println(sumaBondad + " < " + sumaMaldad  + " --> El humano peca, por lo que tiene un demonio más y la fe del humano disminuye.");
        }
        h.mostrar();
    }
}
