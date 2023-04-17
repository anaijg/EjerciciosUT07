package batalladelasalmas2VictorAlarcon;

public class Main {
    public static void main(String[] args) {
        Humano humano1 = new Humano(50);
        humano1.mostrar();
        humano1.rezar();
        humano1.pecar();
        humano1.rezar();
        humano1.mostrar();
        humano1.pecar();
        humano1.pecar();
        humano1.mostrar();
        luchar(humano1);
        humano1.mostrar();
    }

    public static void luchar(Humano humano) {
        StringBuilder sb = new StringBuilder();
        sb.append("Combate entre ángeles y demonios:");
        sb.append("\n================================");
        sb.append("\nBondad de los ángeles: " + bondadAngeles(humano));
        sb.append("\nMaldad de los demonios: " + maldadDemonios(humano));
        System.out.println(sb);
        if (bondadAngeles(humano) > maldadDemonios(humano)) {
            System.out.println(bondadAngeles(humano) + " > " + maldadDemonios(humano)
                    + " --> El humano reza, por lo que tiene un angel mas y la fe del humano aumenta");
            humano.rezar();
        } else {
            System.out.println(maldadDemonios(humano) + " > " + bondadAngeles(humano)
                    + " --> El humano peca, por lo que tiene un demonio mas y la fe del humano disminuye");
            humano.pecar();

        }
    }
    public static int bondadAngeles(Humano humano) {
            int bondadTotal = 0;
            for (Angel bondadAngel : humano.angeles) {
                bondadTotal += bondadAngel.getBondad();

            }
        return bondadTotal;
        }
        public static int maldadDemonios(Humano humano){
            int maldadTotal = 0;
            for (Demonio maldadDemonio : humano.demonios) {
                maldadTotal += maldadDemonio.getMaldad();

            }
            return maldadTotal;
        }
        public static void bondadOMaldad(Humano humano){
        if (bondadAngeles(humano)>maldadDemonios(humano)){
            StringBuilder sb = new StringBuilder();
            sb.append(bondadAngeles(humano));
            sb.append(" > ");
            sb.append(maldadDemonios(humano));
            sb.append(" --> ");
            sb.append(" El humano reza, por lo que tiene un angel mas y la fe del humano aumenta");
            humano.rezar();
        }else {
            StringBuilder sb = new StringBuilder();
            sb.append(maldadDemonios(humano));
            sb.append(" > ");
            sb.append(bondadAngeles(humano));
            sb.append(" --> ");
            sb.append(" El humano peca, por lo que tiene un demonio mas y la fe del humano disminuye");
            humano.pecar();
        }
        }
    }


