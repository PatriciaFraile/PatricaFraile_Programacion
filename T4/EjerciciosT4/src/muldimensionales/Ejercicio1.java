package muldimensionales;

import java.util.Scanner;
//Crear un programa que:
//pida el número de filas y el número de columnas (de ser inferior a 1 continuará pidiendo)
//se rellene de  forma automática todas las celdas con números aleaotrios entre 0 y 100
//Muestre por pantalla el array relleno con * entre cada fila

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int fila;
        int columna;
        System.out.println("Cuantas filas quieres");
        fila = entradaTeclado.nextInt();
        System.out.println("Cuantas columnas quieres");
        columna = entradaTeclado.nextInt();
        int [][] tabla = new int [fila][columna];
        for (int i = 0; i < tabla[0].length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j]= (int)Math.random()*101;
                System.out.print(tabla[i][j]+ " ");
            }
            System.out.println("");

        }




    }


}
