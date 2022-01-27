package ejercicio_objetos.ejercicio5;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Persona> personas = new ArrayList();


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

    public void editar() {


    }

    public void buscar() {

    }

    public void listar() {

    }


}


