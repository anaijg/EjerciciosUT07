package batallaAlmasJavier.src;

public class CampoDeBatalla {
    public static void main(String[] args) {
        Humano h = new Humano(50);
        h.mostrar();
        luchar(h);
        h.rezar();
        h.rezar();
        h.pecar();
        h.mostrar();
    }

    public static void luchar(Humano humano) {
        StringBuilder sb = new StringBuilder("\nCombate entre angeles y demonios:\n=======");

        int bondad = bondad(humano);

        sb.append("\nBondad de los angeles: " + bondad);

        int maldad = maldad(humano);

        sb.append("\nMaldad de los demonios: " + maldad);

        if (maldad > bondad) {
            humano.pecar();
            sb.append("\n" + bondad + " < " + maldad + " --> El humano peca, por lo que tiene un demonio mas y la fe del humano disminuye");
        } else {
            humano.rezar();
            sb.append("\n" + bondad + " > " + maldad + " --> El humano reza, por lo que tiene un angel mas y la fe del humano aumenta");
        }

        System.out.println(sb);

    }

    private static int maldad(Humano humano) {
        int maldad = 0;
        for (Demonio d : humano.demonios) maldad += d.maldad();
        return maldad;
    }

    private static int bondad(Humano humano) {
        int bondad = 0;
        for (Angel a : humano.angeles) bondad += a.bondad;
        return bondad;
    }
}
