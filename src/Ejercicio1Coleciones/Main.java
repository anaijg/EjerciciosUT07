package Ejercicio1Coleciones;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear conjunto sin ordenar de 12 hoteles
        Set<Hotel> hoteles = new HashSet<>();
        for (int i = 1; i <13 ; i++) {
            System.out.printf("zona (playa, montaña o rural): ");
            String zona=scanner.nextLine();
            System.out.printf("precio (40-120): ");
            int precio=scanner.nextInt();scanner.nextLine();
            hoteles.add(new Hotel(i,zona, precio));
        }



        System.out.println("Conjunto de hoteles sin ordenar:");
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }

        // Preguntar por la zona deseada

        System.out.print("Introduce la zona deseada: ");
        String zonaDeseada = scanner.nextLine();

        // Crear conjunto ordenado por precio con los hoteles de la zona deseada
        Set<Hotel> hotelesZonaDeseada = new TreeSet<>((hotel1, hotel2) -> hotel1.getPrecio() - hotel2.getPrecio());

        for (Hotel hotel : hoteles) {
            if (hotel.getZona().equals(zonaDeseada)) {
                hotelesZonaDeseada.add(hotel);
            }
        }

        // Mostrar conjunto de hoteles de la zona deseada ordenados por precio
        System.out.println("Conjunto de hoteles de la zona " + zonaDeseada + " ordenado por precio:");
        for (Hotel hotel : hotelesZonaDeseada) {
            System.out.println(hotel);
        }
    }
}