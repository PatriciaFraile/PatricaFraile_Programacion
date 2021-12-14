package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Garaje {
    public static void main(String[] args) {
        ArrayList<Integer> coches = new ArrayList<>();
        Object[][] coche = new Object[1][1];
        Scanner entrada = new Scanner(System.in);
        int N = 0;
        String matricula = "";
        Object[] cantidad = new Object[N];
        int opcion = 0;
        do {
            System.out.println("1.Añadir un coche");
            System.out.println("2.Listar coches");
            System.out.println("3.Buscar coches");
            System.out.println("4.Mostrar costes");
            System.out.println("5.Eliminar coche");
            System.out.println("6.Eliminar garaje");
            System.out.println("Que opcion quieres");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Cuantos coches quieres");
                        N = entrada.nextInt();
                        if (N <= 1) {
                            System.out.println("Error");
                        } else {
                            coche = new Object[N][5];

                        }
                    } while (N <= 1);

                    if (N <= 1) {
                        System.out.println("Error. No hay coches registrados");
                    } else if (coche[1][1] != null) {
                        System.out.println("Error. Ya hay coches registrados");
                    } else {
                        for (int i = 0; i < coche.length; i++) {
                            System.out.println("Introducir nombre del coche");
                            coche[i][0] = entrada.next();
                        }
                        for (int i = 0; i < coche.length; i++) {
                            System.out.println("Introducir marca de " + coche[i][0]);
                            coche[i][1] = entrada.next();
                        }
                        for (int i = 0; i < coche.length; i++) {
                            System.out.println("Introducir  modelo de " + coche[i][0]);
                            coche[i][2] = entrada.next();
                        }
                        for (int i = 0; i < coche.length; i++) {
                            System.out.println("Introducir coste de " + coche[i][0]);
                            coche[i][3] = entrada.next();
                        }
                        for (int i = 0; i < coche.length; i++) {
                            System.out.println("Introducir matricula de " + coche[i][0]);
                            coche[i][4] = entrada.next();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Listar coches");
                    if (N <= 1) {
                        System.out.println("Error. No hay coches registrados");
                    } else {
                        for (int i = 0; i < coche.length; i++) {
                            System.out.println(coche[i][0]);
                            System.out.println("Marca :" + coche[i][1]);
                            System.out.println("Modelo :" + coche[i][2]);
                            System.out.println("Coste :" + coche[i][3]);
                            System.out.println("Matricula : " + coche[i][4]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Buscar coches");
                    System.out.println("Por favor escribe la matricula del coche");
                    matricula = entrada.next();
                    for (int i = 0; i < coche.length ; i++) {
                        for (int j = 0; j < 1; j++) {
                            if(coche[i][j].equals(matricula)){
                                System.out.println("Nombre" + coche[i][0]);
                                System.out.println("Marca :" + coche[i][1]);
                                System.out.println("Modelo :" + coche[i][2]);
                                System.out.println("Coste :" + coche[i][3]);
                                System.out.println("Matricula :" + coche[i][4]);
                            }
                        }
                    }
                    break;


            }
        } while (opcion != 6);

    }
}
