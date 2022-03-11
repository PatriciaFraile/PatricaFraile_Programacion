package BibliotecaInterfaz;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Dar de alta un socio\n2.Dar de alta un elemento\n3.Prestar un elemento\n4.Devolver un elemento\n5.Ver elementos prestados a un socio concreto\n6.Mostrar elementos disponibles\n7.Mostrar los elementos prestados");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Dar de alta un socio");

            }

        } while (opcion < 7);
    }
}
