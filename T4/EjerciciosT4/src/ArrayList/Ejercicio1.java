package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        Scanner entradaTeclado = new Scanner(System.in);
        int numPalabras = 10;
        for (int i = 0; i < numPalabras; i++) {
            System.out.println(" Escribe "+ (i+1) + " palabra : ");
             String palabras = entradaTeclado.next();
            lista.add(palabras);
        }
        int posiciones = 1;
        for (String item: lista) {
            System.out.println(posiciones + "-" + item);
            posiciones++;

        }
        entradaTeclado.close();

    }
}
