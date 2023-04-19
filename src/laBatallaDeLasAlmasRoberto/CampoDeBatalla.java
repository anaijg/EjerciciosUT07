package laBatallaDeLasAlmas;

public class CampoDeBatalla {
    public static void main(String[] args) {
        Humano h1 = new Humano(50);
        h1.mostrar();
        luchar(h1);
        h1.rezar();;
        h1.rezar();;
        h1.pecar();
        System.out.println("Despues de pecar dos veces y rezar una vez:");
        h1.mostrar();
    }

    public static void luchar(Humano h) {
        System.out.println("Combate entre ángeles y demonios: ");
        System.out.println("================================= ");
        int sumaBondad = 0;
        for (int i = 0; i < h.ángeles.size(); i++) {
            sumaBondad += h.ángeles.get(i).bondad;
        }
        System.out.println("Bondad de los ángeles: " + sumaBondad);
        double sumaMaldad = 0;
        for (int i = 0; i < h.demonios.size(); i++) {
            sumaMaldad += h.demonios.get(i).getMaldad();
        }
        System.out.println("Maldad de los demonios: " + sumaMaldad);
        if (sumaBondad > sumaMaldad){
            h.rezar();
            System.out.println(sumaBondad + " > " + sumaMaldad + " --> El humano reza, por lo que tiene un ángel más y la fe del humano aumenta. ");
        } else if (sumaBondad < sumaMaldad) {
            h.pecar();
            System.out.println(sumaBondad + " < " + sumaMaldad + " --> El humano peca, por lo que tiene un ángel más y la fe del humano disminuye. ");
        }
        h.mostrar();
    }

}
