package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Object[]> agenda = new ArrayList();
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
                        agenda.add(agendas);
                    } else {
                        System.out.println("Ya esta completo");
                    }
                    break;
                case 2:
                    System.out.println("Buscar personas");
                    System.out.println("Que dni quieres buscar");
                    String dni = entrada.next();
                    boolean encontrada = true;
                    for (Object[] item : agenda) {
                        if (item[3].toString().equalsIgnoreCase(dni)) {
                            System.out.println("Nombre:\t" + item[0] + "\tApellido :\t" + item[1] +
                                    "\ttelefono:\t" + item[2] + "\tDNI :\t" + item[3]);
                            break;
                        }
                        if(!encontrada){
                            System.out.println("Persona no encontrada");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Borrar persona");
                    System.out.println("Que dni quieres eliminar");
                    dni = entrada.next();
                    boolean encontrado = true;
                    for (int i = 0; i < agenda.size(); i++) {
                        if (agenda.get(i)[3].toString().equalsIgnoreCase(dni)) {
                            System.out.println("Persona borrada");
                            encontrado = true;
                            agenda.remove(i);
                        }
                        if (!encontrado) {
                            System.out.println("Persona no encontrada");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Listar personas");
                    if (agenda.size() > 0) {
                        for (Object[] item : agenda) {
                            System.out.println("\tNombre:\t" + item[0] + "\tApellido :\t"
                                    + item[1] + "\tTelefono:\t" + item[2] + "\tDNI :\t" + item[3]);
                        }
                    } else {
                        System.out.println("No hay personas");
                    }
                    break;
            }

        } while (opcion != 5);
        entrada.close();
    }
}
