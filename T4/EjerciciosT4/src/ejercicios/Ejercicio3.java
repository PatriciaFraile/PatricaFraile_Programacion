package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int suma = 0;
        int numeroInto=0;
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Por favor introduzca un número");
            numeroInto= entradaTeclado.nextInt();
            numeros[i]=numeroInto;
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i]*2;
        }
        for (int item:numeros) {
            suma= suma + item;
        }
        System.out.println("La suma de los numeros es" + suma);
        System.out.println("La suma de los numeros es" + (double)suma/(double)numeros.length);
    }
}
