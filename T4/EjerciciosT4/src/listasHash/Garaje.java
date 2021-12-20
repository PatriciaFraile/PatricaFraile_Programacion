package listasHash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Garaje {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Hashtable<String, Object[]> garaje = new Hashtable();
        int opcion = 0;
        do {
            System.out.println("1.Añadir un coche");
            System.out.println("2.Listar coches");
            System.out.println("3.Buscar coches");
            System.out.println("4.Mostrar costes");
            System.out.println("5.Eliminar coche");
            System.out.println("6.Eliminar garaje");
            System.out.println("Que opcion quieres");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    if (garaje.size() <= 10) {
                        System.out.println("Añadir un coche");
                        System.out.println("Que marca tiene el coche");
                        String marca = entrada.next();
                        System.out.println("Que modelo tiene el coche");
                        String modelo = entrada.next();
                        System.out.println("Que matricula tiene el coche");
                        String matricula = entrada.next();
                        System.out.println("Que coste tiene");
                        int coste = entrada.nextInt();
                        Object[] coche = new Object[]{marca, modelo, matricula, coste};
                        System.out.println("Coche recepcionado");
                        garaje.put(matricula, coche);
                    } else {
                        System.out.println("No hay espacio disponible");
                    }
                    break;
                case 2:
                    System.out.println("Listar coches");
                    Enumeration<Object[]> elemento = garaje.elements();
                    while (elemento.hasMoreElements()) {
                        Object[] element = elemento.nextElement();
                        for (Object item : element) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Buscar coches");
                    System.out.println("Que matricula quieres buscar");
                    String matricula = entrada.next();
                    for (Object item : garaje.get(matricula)) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    System.out.println("Mostrar el coste");
                    break;
                case 5:
                    System.out.println("Eliminar coche");
                    System.out.println("Escribe la matricula que quieres eliminar");
                    matricula = entrada.next();
                    garaje.remove(matricula);
                    System.out.println("Coche borrado");
                    break;
                case 6:
                    System.out.println("Eliminar el garaje");
                    garaje.clear();
                    System.out.println("Garaje eliminado");
                default:
                    System.out.println("Has salido");
            }
        } while (opcion != 6);
        entrada.close();

    }
}
