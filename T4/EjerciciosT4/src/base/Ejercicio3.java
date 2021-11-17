package base;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner entradaTeclado = new Scanner (System.in);

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce numeros");
            int numero = entradaTeclado.nextInt();
            numeros[i] = numero;
        }
        System.out.println("En orden inverso");
        for (int i = 9; i >=0 ; i--) {
            System.out.println(numeros[i]);
        }
        System.out.println("En orden normal");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println( numeros[i]);

        }
        entradaTeclado.close();


    }
}
