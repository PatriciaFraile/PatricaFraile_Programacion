package listasArrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        Scanner entradaTeclado = new Scanner (System.in);
        System.out.println("Cuantos números quieres");
        int numero = entradaTeclado.nextInt();
        int aleatorio = 0;
        for (int i = 0; i < numero; i++) {
            aleatorio = (int)(Math.random()*101);
            lista.add(aleatorio);
        }
        System.out.println(lista);
        int minimo = 999;
        int maximo = -999;
        int suma = 0;
        for (int item:lista) {
            suma+=item;
            if(item<minimo){
                minimo = item;
            }
            if(item>maximo){
                maximo = item;
            }
        }
        double media = (double)suma/(double)numero;
        System.out.println("La suma es :" +suma);
        System.out.println("La media es " + media);
        System.out.println("El maximo es : " +maximo);
        System.out.println("El minimo es :" + minimo);
        entradaTeclado.close();


    }
}
