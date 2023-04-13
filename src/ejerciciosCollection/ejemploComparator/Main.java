package ejerciciosCollection.ejemploComparator;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Socio s1 = new Socio(1, "Pedro", LocalDate.of(2000, 10, 9));
        Socio s2 = new Socio(2, "Cristo", LocalDate.of(2002, 10, 9));
        Socio s3 = new Socio(3, "Judas", LocalDate.of(1990, 10, 9));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(s1);
        socios.add(s2);
        socios.add(s3);

        System.out.println(socios);

        /*ComparaFN comparador = new ComparaFN();

        socios.sort(comparador);
        System.out.println(socios);

        socios.sort(comparador.reversed());
        System.out.println(socios);
*/
        ComparaNombre comparadorNombre = new ComparaNombre();
        socios.sort(comparadorNombre);
        System.out.println(socios);

        socios.sort(comparadorNombre.reversed());
        System.out.println(socios);
    }
}
