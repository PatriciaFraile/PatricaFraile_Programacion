package ejercicios;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class MenuArray {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Elige la longitud de los numeros");
        int longitud = entradaTeclado.nextInt();
        Object[] numeros = new Object[longitud];
        Object[] numeros3 = new Object[longitud];
        int opcion = 0;
        int longitudNueva = 0;

        do {
            System.out.println("\n1.Rellenar el array con numeros aleatorios\n 2.Rellenar el array por consola\n");
            System.out.println("Elige una opcion");
            opcion = entradaTeclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido con numeros aleatorios");
                    for (int i = 0; i < numeros.length; i++) {
                        numeros[i] = (int) (Math.random() * numeros.length);
                    }
                    Arrays.sort(numeros);
                    System.out.print(Arrays.toString(numeros));
                    System.out.println("\nOrdenar de mayor a menor");
                    Arrays.sort(numeros);
                    Arrays.sort(numeros, Collections.reverseOrder());
                    System.out.print(Arrays.toString(numeros));
                    System.out.println("\nClonar el array");
                    Object[] numeros2 = Arrays.copyOf(numeros, longitud);
                    for (int i = 0; i < numeros2.length; i++) {
                        System.out.print(numeros2[i] + "," + "\t");
                    }
                    System.out.println("\nMover las posiciones");
                    int ultimo = (int) numeros[numeros.length - 1];
                    int primero = (int) numeros[0];
                    for (int i = 0; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }
                    numeros[numeros.length - 1] = primero;
                    for (Object item : numeros) {
                        System.out.print(item + " ,");
                    }
                    break;
                case 2:
                    System.out.println("Has elegido por consola");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Escribe el numero" + (i + 1));
                        numeros[i] = entradaTeclado.nextInt();
                    }
                    for (int i = 0; i < numeros.length; i++) {
                        numeros3[numeros3.length - 1 - i] = numeros[i];
                    }
                    System.out.println("Ordenar de mayor a menor");
                    for (int i = 0; i < numeros3.length; i++) {
                        System.out.print(numeros3[i] + ",");
                    }
                    System.out.println("\nClonar el array");
                    Object[] numeros4 = Arrays.copyOf(numeros, longitud);
                    for (int i = 0; i < numeros4.length; i++) {
                        System.out.print(numeros4[i] + "," + "\t");
                    }
                    System.out.println("\nMover las posiciones");
                    int ultimo2 = (int) numeros[numeros.length - 1];
                    int primero1 = (int) numeros[0];
                    for (int i = 0; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }
                    numeros[numeros.length - 1] = primero1;
                    for (Object item : numeros) {
                        System.out.print(item + " ,");
                    }
                    break;
            }


        } while (opcion != 3);
        entradaTeclado.close();
    }
}
