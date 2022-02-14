package ListaMultimedia;

import java.util.ArrayList;

public class Entrada {
    private ArrayList<ElementoMultimedia> lista;
    ElementoMultimedia elemento = new ElementoMultimedia();
    Libro libro = new Libro();
    Audio audio = new Audio();
    Video video = new Video();


    public Entrada() {
        lista = new ArrayList<>();
    }

    public void añadir(ElementoMultimedia elementos) {
        lista.add(elementos);
        System.out.println("Añadido correctamente");
    }

    public void eliminar(String id) {
        //System.out.println(lista.size());
        //System.out.println(lista.get(0).getId());
        boolean encontado = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equalsIgnoreCase(id)) {
                encontado = true;
                lista.remove(i);
                System.out.println("Colección borrada");
                break;

            }
        }
        if (!encontado) {
            System.out.println("No encontrado la colección");
        }
    }

    public void listar() {

    }
}


