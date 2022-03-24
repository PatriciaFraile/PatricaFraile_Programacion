package Explicacion.Genéricos;

import java.util.ArrayList;


public class Coleccion <T> implements Organizable<Boolean,String>{
     private ArrayList <T> listaCosas;
     public Coleccion(){
         listaCosas = new ArrayList<>();
     }
     public void agregarCosas(T cosa){
         listaCosas.add(cosa);
     }

    @Override
    public void organizar(Boolean criterio) {

    }

    @Override
    public String listar() {
        return null;
    }
}
