package ejercicio_objetos.ejercicio5;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Persona> personas;

    public Agenda() {
        this.personas = new ArrayList();
    }

    public void agregar(Persona persona) {
        personas.add(persona);

    }

    public void borrar(String dni) {

        boolean encontrado = true;
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

    }

    public void buscar(String dni , String nombre , int telefono) {
        boolean encontrada = true;
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getDNI().equalsIgnoreCase(dni)){
                System.out.println("Nombre:\t"+nombre + "\tDNI:\t"+ dni+"\tTelefono\t"+telefono);
                break;
            }
            if (!encontrada){
                System.out.println("Persona no encontrada");
                break;
            }

        }
        //incompleto
    }

    public void listar() {
        for(Object item : personas){
            ((Persona)item).mostrarDatos();
        }


    }


}


