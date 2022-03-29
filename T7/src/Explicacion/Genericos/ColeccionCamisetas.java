package Genericos;
import java.util.ArrayList;

public class ColeccionCamisetas {
    private ArrayList<Camiseta> lista;

    public ColeccionCamisetas(ArrayList<Camiseta> lista) {
        this.lista = lista;
    }

    public void addCamiseta(Camiseta c){
        lista.add(c);
    }
}
