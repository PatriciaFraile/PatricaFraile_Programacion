package listasHash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Hashtable<String, Object[]> agenda = new Hashtable();
        int opcion = 0;
        do {
            System.out.println("1.Agregar persona");
            System.out.println("2.Buscar persona");
            System.out.println("3.Borrar persona");
            System.out.println("4.Listar personas");
            System.out.println("Que opcion quieres");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar persona");
                    if (agenda.size() <= 10) {
                        System.out.println("Escribe el nombre");
                        String nombre = entrada.next();
                        System.out.println("Escribe el apellido");
                        String apellido = entrada.next();
                        System.out.println("Escribe el telefono");
                        int telefono = entrada.nextInt();
                        System.out.println("Escribe el dni");
                        String dni = entrada.next();
                        Object[] agendas = new Object[]{nombre, apellido, telefono, dni};
                        System.out.println("Persona agregada");
                        agenda.put(dni, agendas);
                    } else {
                        System.out.println("Ya esta completo");
                    }
                    break;
                case 2:
                    System.out.println("Buscar personas");
                    System.out.println("Escribe el dni");
                    String dni = entrada.next();
                    for (Object item : agenda.get(dni)) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    System.out.println("Borrar personas");
                    System.out.println("Que dni quieres eliminar");
                    dni = entrada.next();
                    agenda.remove(dni);
                    System.out.println("Persona borrada");
                    break;
                case 4:
                    System.out.println("Listar personas");
                    Enumeration<Object[]> elemento = agenda.elements();
                    while(elemento.hasMoreElements()){
                         Object [] element = elemento.nextElement();
                        for (Object item: element) {
                            System.out.println(item);
                        }

                    }

                    break;
                default:
                    System.out.println("Saliste");
            }

        } while (opcion != 5);
        entrada.close();
    }
}

