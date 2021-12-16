package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Garaje2 {

    public static void main(String[] args) {
        ArrayList<Object[]> coches = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1.Añadir un coche");
            System.out.println("2.Listar coches");
            System.out.println("3.Buscar coches");
            System.out.println("4.Mostrar costes");
            System.out.println("5.Eliminar coche");
            System.out.println("6.Eliminar garaje");
            System.out.println("7.Salir");
            System.out.println("Que opcion quieres");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    if (coches.size() <= 10) {
                        System.out.println("Añadir un coche");
                        System.out.println("Que marca tiene el coche");
                        String marca = entrada.next();
                        System.out.println("Que modelo tiene el coche");
                        String modelo = entrada.next();
                        System.out.println("Que matricula tiene el coche");
                        String matricula = entrada.next();
                        System.out.println("Que coste tiene");
                        int coste = entrada.nextInt();
                        Object[] coche = new Object[]{marca, modelo, matricula, coste};
                        System.out.println("Coche recepcionado");
                        coches.add(coche);
                    } else {
                        System.out.println("No hay espacio disponible");
                    }
                    break;
                case 2:
                    if (coches.size() > 0) {
                        for (Object[] item : coches) {
                            System.out.println("\tMarca:\t" + item[0] + "\tModelo :\t"
                                    + item[1] + "\tMatricula:\t" + item[2] + "\tCoste :\t" + item[3]);
                        }
                    } else {
                        System.out.println("No hay coches");
                    }

                    break;
                case 3:
                    System.out.println("Buscar coche");
                    System.out.println("Que matricula quieres buscar");
                    String matricula = entrada.next();
                    for (Object[] item : coches) {
                        if (item[2].toString().equalsIgnoreCase(matricula)) {
                            System.out.println("Marca:\t" + item[0] + "\tModelo :\t" + item[1] +
                                    "\tMatricula:\t" + item[2] + "\tCoste :\t" + item[3]);
                            break;
                        } else {
                            System.out.println("Coche no encontrado");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Mostrar costes");
                    int cocheAcumulado = 0;
                    for (Object[] item : coches) {
                        cocheAcumulado += (int) item[3];
                    }
                    System.out.println("Tu coste acumulado es de " + cocheAcumulado);
                    break;
                case 5:
                    System.out.println("Eliminar coche");
                    System.out.println("Que matricula quieres buscar");
                    matricula = entrada.next();
                    boolean encontrado = true;
                    for (int i = 0; i < coches.size(); i++) {
                        if(coches.get(i)[2].toString().equalsIgnoreCase(matricula)){
                            System.out.println("Coche borrado");
                            encontrado= true;
                            coches.remove(i);
                            break;
                        }
                        if(!encontrado){
                            System.out.println("Coche no encontrado");
                        }
                    }
                    break;
                case 6:
                    System.out.println("ELiminar garaje");
                    coches.clear();
                    System.out.println("Lista vaciada");
                    break;
            }
        } while (opcion != 7);
        entrada.close();
    }
}
