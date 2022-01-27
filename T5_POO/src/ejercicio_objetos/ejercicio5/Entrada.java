package ejercicio_objetos.ejercicio5;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;
        do{
            System.out.println("1.Agregar persona a la agenda");
            System.out.println("2. Borrar persona");
            System.out.println("3.Editar persona ");
            System.out.println("4. Buscar persona");
            System.out.println("5.Listar agenda");
            System.out.println("Que operación quieres hacer");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("Agregar persona");
                    System.out.println("Escribe el nombre");
                    String nombre = entrada.next();
                    System.out.println("Escribe tu DNI");
                    String DNI = entrada.next();
                    System.out.println("Escribe tu telefono");
                    int telefono = entrada.nextInt();
                    Persona persona = new Persona(nombre ,DNI , telefono);
                    break;
                case 2:
                    System.out.println("Borrar persona");
                    System.out.println("Que dni quieres eliminar");
                   String dni = entrada.next();
                   agenda.borrar(dni);

                    break;
                case 3:
                    System.out.println("Editar persona");

                    break;
                case 4 :
                    System.out.println("Buscar persona");
                    break;
                case 5 :
                    System.out.println("Listar persona ");
                    break;
            }





        }while (opcion!=5);
    }
}
