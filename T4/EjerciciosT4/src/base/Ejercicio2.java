package base;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array
        //Una vez metidos, se deberá mostrar:
        //Numero de puntos y la media

        int[] numeros = new int[30];
        int suma = 0;
        int media = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
            System.out.println("El número Aleatorio es:" +numeros[i]);
        }
        for (int item:numeros) {
            suma = suma+item;

        }
        media = suma/ numeros.length;

        System.out.println("Numeros obtenidos es :" + suma);
        System.out.println("La media es :"+ media);
    }
}
