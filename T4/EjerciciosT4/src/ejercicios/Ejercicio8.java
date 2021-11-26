package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int personas;
        double media = 0.0;
        int contMas = 0;
        int contMe = 0;

        System.out.println("Cuantas personas quieres");
        personas = entradaTeclado.nextInt();

        double[] altura = new double[personas];

        for (int i = 0; i < personas; i++) {
            System.out.println("Personas" + (i + 1) + " =");
            altura[i] = entradaTeclado.nextDouble();
            media = media / altura[i];
        }
        for (int i = 0; i < altura.length; i++) {
            if (altura[i] > media) {
                System.out.println("Su altura es mayor que la media");
                contMas++;
            } else if (altura[i] < media) {
                System.out.println("Su altura es inferior a la media");
                contMe++;

            }

        }
            System.out.println("Las personas que tienen mayor altura son :" + contMas);
            System.out.println("Las personas que tienen menor altura son : " + contMe);
            entradaTeclado.close();


    }

}
