package LlamadaHerencia;
import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        Centralita lista = new Centralita();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1.Llamada Nacional\n2.Llamada Local\n3.Llamada Provincial");
            System.out.println("Que opción quieres");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("--Llamada Nacional--");
                    do{
                        System.out.println("1.Añadir Llamada\n2. Coste de llamada\n3.Mostrar datos");
                        opcion = entrada.nextInt();
                        switch (opcion){
                            case 1:
                                System.out.println("--Añadir llamada");
                                System.out.println("Escribe el origen de la llamada");
                                int origen = entrada.nextInt();
                                System.out.println("Escribe el destino de la llamada");
                                int destino = entrada.nextInt();
                                System.out.println("Escribe la duración de la llamada");
                                int duracion = entrada.nextInt();
                                System.out.println("Escribe la franja desde el 1 hasta el 3 de la llamada");
                                int franja = entrada.nextInt();
                                LlamadaNacional llamadaNacional = new LlamadaNacional(origen,destino,duracion,franja);
                                lista.añadirLlamada(llamadaNacional);
                                break;
                            case 2:
                                //incompleto



                        }
                    }while(opcion==3);
                    break;
                case 2:
                    System.out.println("--Llamada Local--");
                    break;
                case 3:
                    System.out.println("--Llamada Provincial--");
                    break;
            }

        }while(opcion!=3);

    }
}
