package ejercicio_objetos.ejercicio5;

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
    private Scanner entrada = new Scanner(System.in);
    private ArrayList<Persona> personas;
    private int opcion, telefono;
    private String nombre;

    public Agenda() {
        this.personas = new ArrayList();
    }

    private  Persona existePersona(String dni){
        Persona persona = null;
        for (Persona item: personas) {
            if(item.getDNI().equalsIgnoreCase(item.getDNI())){
                return item;
            }
            
        }
        return  persona;



    }

    public void agregar(Persona persona) {

        if(existePersona(persona.getDNI())==null){
            personas.add(persona);
        }else{
            System.out.println("Ya existe ");
        }


    }

    public void borrar(String dni) {

        boolean encontrado = false;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDNI().equalsIgnoreCase(dni)) {
                System.out.println("Persona borrada");
                encontrado = true;
                personas.remove(i);
            }
            if (!encontrado) {
                System.out.println("Persona no encontrada");
            }

        }

    }

    public void editar(String dni) {
        boolean encontrado = false;
        for (Persona item : personas) {
            if (dni.equals(item.getDNI())) {
                encontrado = true;
                System.out.println("1.Nombre");
                System.out.println("2.Telefono");
                System.out.println("Que quieres modificar");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Cambiar el nombre ");
                        nombre = entrada.next();
                        item.setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("Cambiar el  numero de telefono");
                        telefono = entrada.nextInt();
                        item.setTelefono(telefono);
                }

            }
            if (!encontrado) {
                System.out.println("Persona no encontrada");
            }

        }
    }

    public void buscar(String dni) {
        boolean encontrado = false;
        for (Persona item : personas) {
            if (dni.equals(item.getDNI())) {
                encontrado = true;
                System.out.println("nombre: " + item.getNombre() + "\ntelefono: " + item.getTelefono() + "\nDNI: " + item.getDNI());
            }
            if (!encontrado) {
                System.out.println("Persona no encontrada");
            }
        }
    }

    public void listar() {
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Telefono: " + persona.getTelefono());
            System.out.println("DNI: " + persona.getDNI() + "\n");
        }
    }
}





