package muldimensionales;

import java.util.Scanner;
//Crear un programa que:
//pida el número de filas y el número de columnas (de ser inferior a 1 continuará pidiendo)
//se rellene de  forma automática todas las celdas con números aleaotrios entre 0 y 100

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int fila;
        int columna;
        int sumatorioFila1 = 0,sumatorioFilaN = 0,sumatorioColumna1 = 0,sumatorioColumnaN = 0;

        System.out.println("Cuantas filas quieres");
        fila = entradaTeclado.nextInt();
        System.out.println("Cuantas columnas quieres");
        columna = entradaTeclado.nextInt();
        int[][] tabla = new int[fila][columna];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 101);
                System.out.print(tabla[i][j] + " \t");
            }
            System.out.println("");

        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if(i==0){
                    sumatorioFila1+=tabla[i][j];
                }
                if(i==fila-1){
                    sumatorioFilaN+=tabla[i][j];
                }
                if(j==0){
                    sumatorioColumna1+=tabla[i][j];
                }
                if (j==columna-1){
                    sumatorioColumnaN += tabla[i][j];
                }
                System.out.println("La suma de la primera fila es :" + sumatorioFila1);
                System.out.println("La suma de la última fila es :"+ sumatorioFilaN);
                System.out.println("La suma de la primera columna es :" + sumatorioColumna1);
                System.out.println("La suma de la última columna es :" + sumatorioColumnaN);

            }
            entradaTeclado.close();

        }


    }


}
