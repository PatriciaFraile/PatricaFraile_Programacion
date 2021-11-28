package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int longitud;
        int[] numeros;
        int max = -99999;
        int min= 99999;

        System.out.println("De que longitud quieres crear el array?");
        longitud = entradaTeclado.nextInt();
        numeros = new int[longitud];
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Por favor introduzca un número");
            int numeroInto = entradaTeclado.nextInt();
            numeros[i] = numeroInto;
        }
        System.out.println("desordenados");
        for (int item:numeros) {
            System.out.println(item);
        }
        System.out.println("ordenados");
        Arrays.sort(numeros);

        for (int item:numeros) {
            System.out.println(item);

        }
        System.out.println("El mayor es " + numeros[numeros.length-1]);
        System.out.println("El pequeño es " + numeros[0]);
      /*  for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]<min){
                min = numeros[i];
            }
            if(numeros[i]>max){
                max = numeros[i];
            }
       */
        }

    }

