package repaso;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio1 {
    //ordenar
    public static void main(String[] args) {
        int aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que longitud quieres");
        int longitud = sc.nextInt();
        int[] numeros = new int[longitud];
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * numeros.length);
        }
        for (int i = 0; i < (longitud-1) ; i++) {
            for (int j = (i+1); j <longitud ; j++) {
                if(numeros[i]>numeros[j]){
                    aux = numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        for (int i = 0; i < longitud; i++) {
            System.out.print(numeros[i]+ " ");
        }
    }
}
