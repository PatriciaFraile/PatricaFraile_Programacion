package listasArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Object[] coche = new Object[]{"Mercedes ", "c220", 250};
        Object[] coche2 = new Object[]{"Toyota", "c020", 280};
        Object[] coche3 = new Object[]{"Audi ", "c820", 200};

        ArrayList<Object[]> listaCoches = new ArrayList();
        listaCoches.add(coche);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(new Object[]{"Ford", "Focus", 150});
        listaCoches.add(new Object[]{"Ford", "Fiesta", 150});
        listaCoches.add(new Object[]{"Mercedes", "c180", 150});
        listaCoches.add(new Object[]{"Audi", "q5", 150});
        listaCoches.add(new Object[]{"Audi", "q9", 190});
        listaCoches.add(new Object[]{"Ford", "q5", 150});
        listaCoches.add(new Object[]{"Toyota", "Etron", 150});


        //Obtener los coches
        Object[] cocheSeleccionado = listaCoches.get(0);
        System.out.println(cocheSeleccionado[1]);
        System.out.println("Otra forma de obtener coches");
        System.out.println(listaCoches.get(2)[0]);

        //Marca : Mercedes Modelo : c220 CV:250
        /*for (int i = 0; i < listaCoches.size(); i++) {
                System.out.println("Marca : " + listaCoches.get(i)[0] + "Modelo : " + listaCoches.get(i)[1] + "CV : " + listaCoches.get(i)[2]);
        }*/

        for (Object[] coches : listaCoches) {
            // System.out.println("Marca :" + coche[0] + "Modelo" + coche [1] + "CV :" + coche[2]);
            for (Object item : coches) {
                System.out.print(item + "\t");
            }
        }
        System.out.println("\n" + "Otra forma");
        for (int i = 0; i < listaCoches.size(); i++) {
            Object[] cocheActual = listaCoches.get(i);
            for (int j = 0; j < cocheActual.length; j++) {
                System.out.print("\t" + cocheActual[j]);
            }
        }
        System.out.println();
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Que marca quieres ver");
        String marca = entradaTeclado.next();
        for (Object[] coches : listaCoches) {
            if (coches[0].toString().equalsIgnoreCase(marca)) {
                for (Object item : coches) {
                    System.out.print(item + "\t");
                }
                System.out.println();
            }

        }
        /*String marcas = " ";
        System.out.println("Que marca quieres ver");
        marcas = entradaTeclado.next();
        for (int i = 0; i < listaCoches.size(); i++) {
            for (int j = 0; j < 1; j++) {
                if (listaCoches.get(i)[j].equals(marcas)) {
                    System.out.println(listaCoches.get(i)[0] + "\t");
                    System.out.println(listaCoches.get(i)[1] + "\t");
                    System.out.println(listaCoches.get(i)[2] + "\t");
                }
            }
        }*/
        entradaTeclado.close();

    }
}
