package LlamadaHerencia;

import java.util.ArrayList;

public final  class Centralita {
     private ArrayList<Llamada> lista;
    public Centralita() {
        lista = new ArrayList<>();
    }
    public void añadirLlamada(Llamada llamada){
        lista.add(llamada);
        System.out.println("Llamada agregada");
    }
    public void mostrarCosteTotal(){
        for (Llamada item: lista) {

        }

    }
    public void mostrarLlamadas(){

    }

}
