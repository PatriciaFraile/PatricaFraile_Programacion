package ejercicios;
import java.util.Scanner;
public class EjercicioMultiArray {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        int [] numero = new int[5];
        int numeroInto = 0;
        int suma = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce un numero");
            numeroInto = entradaTeclado.nextInt();
            numero[i] = numeroInto;
        }
        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero[i]*2;
        }
        for (int item:numero) {
            suma = suma + item;
        }
        System.out.println("La suma de todos los arrays es :"+ suma);
        System.out.println("La media es "+ (double)suma/(double)numero.length);
        entradaTeclado.close();

    }
}
