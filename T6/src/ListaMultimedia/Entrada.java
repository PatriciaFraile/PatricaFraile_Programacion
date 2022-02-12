package ListaMultimedia;

import java.util.ArrayList;

public class Entrada {
    private ArrayList<ElementoMultimedia> lista;

    public Entrada() {
        lista = new ArrayList<>();
    }

    public void añadir(ElementoMultimedia elementos) {
        lista.add(elementos);
        System.out.println("Añadido correctamente");
    }

    public void eliminar(int id) {
        boolean encontado = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == (id)) {
                encontado = true;
                lista.remove(i);
                System.out.println("Colección borrada");

            }
        }
        if (!encontado) {
            System.out.println("No encontrado la colección");
        }
    }
}

