package ejercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class MenuArray {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        int opcion = 0;
        Integer[] numeros;
        int N=0;
        do {
            System.out.println("1.Crear un array de números enteros con n posiciones pedidas");
            System.out.println("2.Rellenar el array creado con números aleatorios.");
            System.out.println("3.Rellenar el array creado con números pedidos por consola.");
            System.out.println("4.Ordenar de mayor a menor");
            System.out.println("5.Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud ");
            System.out.println("6.Mover todas las posiciones");
            System.out.println("7.Mostrar por pantalla el array según está");
            System.out.println("Elige una opcion");
            opcion = entradaTeclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Has elegido crear un array de numeros enteros");
                    System.out.println("Cuantas posiciones quieres");
                     N = entradaTeclado.nextInt();
                     numeros = new Integer [N];

                    break;
                case 2 :
                    System.out.println("Has elegido rellenar el array con numeros aleatorios");
                    for (int i = 0; i < N; i++) {
                       int  numero = (int)(Math.random()*N);

                    }
                    break;
                case 3 :
                    System.out.println("Has elegido rellear por consola el array creado");
                    for (int i = 0; i < N; i++) {
                        System.out.println("Escribe el numero "+ (i+1));
                        int num = entradaTeclado.nextInt();
                    }
                    break;
                case 4 :
                    System.out.println("Has elegido ordenar de mayor a menor");
                    Arrays.sort(numeros);
                    for (int n : numeros) {
                        System.out.println(n);
                    }
            }

        }while(opcion!=8);
    }
}
//sin terminar
