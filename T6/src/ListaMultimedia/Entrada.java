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
}
