package ejercicio_objetos.ejercicio7;

import java.util.ArrayList;

public class Cuenta {
    private int identificador;
    private boolean estado;
    private ArrayList<Object> articulo = new ArrayList();

    public Cuenta(int identificador) {
        this.identificador = identificador;
        return;
    }

    public void agregarLista(int agregarLista) {
        articulo.add(agregarLista);
    }

    public int retornarArticulos(int numeroArticulos) {
        return numeroArticulos;
    }
    public int costeTotal(int totalCoste){
        return totalCoste;
    }

    public void setArticulo(ArrayList<Object> articulo) {
        this.articulo = articulo;
    }
}
