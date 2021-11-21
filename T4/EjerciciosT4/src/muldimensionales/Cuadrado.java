package muldimensionales;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {

        Scanner entradateclado = new Scanner(System.in);
        int lado = 0;
        System.out.print("Introduzca el lado del cuadrado: ");
        lado = entradateclado.nextInt();
        System.out.println();
        for (int row = 1; row <= lado; row++) {
            for (int col = 1; col <= lado; col++) {
                if (row == 1 || row == lado || col == 1 || col == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

