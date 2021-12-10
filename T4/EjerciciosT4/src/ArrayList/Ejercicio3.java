package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        ArrayList<Integer> pers = new ArrayList<>();
        int N = 0;
        int aleatorioUno;
        String[] persona;
        System.out.println("Que personas quieres que participe?(tiene que ser par) ");
        N = entradaTeclado.nextInt();
        persona = new String[N];
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Nombre de la persona " + (i + 1));
            persona[i] = entradaTeclado.next();
        }
        for (int i = 0; i < persona.length; i++) {
            aleatorioUno = (int) (Math.random() * N);
            do {
                if (pers.contains(aleatorioUno)) {
                    aleatorioUno = (int) (Math.random() * N);
                } else {
                    pers.add(aleatorioUno);
                }
            } while (!pers.contains(aleatorioUno));

        }
        aleatorioUno = (int) (Math.random() * N);
        System.out.println(persona[aleatorioUno]);
        entradaTeclado.close();
    }

}
