package BatallaDeAlmas;

public class CampoDeBatalla {
    public static void main(String[] args) {
        Humano humano = new Humano(50);
        humano.mostrar();
        luchar(humano);
        humano.rezar();
        humano.rezar();
        humano.pecar();
        humano.mostrar();
    }

    public static void luchar(Humano h) {
        int sumaBondad = h.getAngeles().stream().mapToInt(a -> a.bondad).sum();
        int sumaMaldad = h.getDemonios().stream().mapToInt(d -> d.getMaldad()).sum();
        System.out.println("\nCombate entre Angeles y demonios ");
        System.out.println("==================================");
        System.out.println("Bondad de los angeles:"+sumaBondad+"\n" +
                "Maldad de los demonios:"+sumaMaldad);
        if (sumaBondad > sumaMaldad) {
            h.rezar();
            System.out.println("==================================");
            System.out.println(sumaBondad+" "+">"+" "+sumaMaldad+" El humano ha rezado.");
            System.out.println("==================================");
        } else if (sumaMaldad > sumaBondad) {
            h.pecar();
            System.out.println("==================================");
            System.out.println(sumaMaldad+" "+">"+" "+sumaBondad+" El humano ha pecado.");
            System.out.println("==================================");
        } else {
            System.out.println("El humano no ha hecho nada.");
        }
        h.mostrar();
    }
}
