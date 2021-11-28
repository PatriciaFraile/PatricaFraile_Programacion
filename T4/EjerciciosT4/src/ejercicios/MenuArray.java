package ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class MenuArray {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        int opcion = 0;
        int [] numeros;
        System.out.println("Que posicion quieres");
        int N = entradaTeclado.nextInt();
        numeros = new int[N];
        do {
            System.out.println("1.Rellenar el array creado con números aleatorios.");
            System.out.println("2. Rellenar el array creado con números pedidos por consola.");
            System.out.println("3.Ordenar de mayor a menor");
            System.out.println("4.Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud ");
            System.out.println("5.Mover todas las posiciones");
            System.out.println("6.Mostrar por pantalla el array según está");
            System.out.println("Elige una opcion");
            opcion = entradaTeclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Has elegido rellenar el array con numeros aleatorios");
                    for (int i = 0; i < numeros.length; i++) {
                        int numero = (int)(Math.random()* numeros.length);
                    }
                    break;

            }

        }while(opcion!=8);
    }
}
//sin terminar
