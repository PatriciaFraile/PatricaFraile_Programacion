package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        int longitud;
        System.out.println("De que longitud quieres crear el primer array");
        longitud = entradaTeclado.nextInt();

        int[] primerArray = new int[longitud];
        int[] segundoArray = new int[longitud];
        int[] tercerArray = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            primerArray[i] = (int) (Math.random() * 21);
            segundoArray[i] = (int) (Math.random() * 21);
        }
        for (int i = 0; i < longitud; i++) {
            tercerArray[i] = primerArray[i] + segundoArray[i];

        }
    }
}

