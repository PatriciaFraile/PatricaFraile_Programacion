package inventario;

import java.util.ArrayList;

public final class Supermercado<T> {
    private ArrayList<T>listarCosas;
    public Supermercado(){
        this.listarCosas = new ArrayList<>();
    }
    public void registrarElementos(T elementos){
        listarCosas.add(elementos);
    }
    public void listarCosas(){
        for (T item:listarCosas) {
            if(item instanceof Alimento){
                ((Alimento)item).mostrarDatos();
            }else{
                ((Mueble)item).mostrarDatos();
            }
        }
    }
    public void PreciosFinales(){
        double precioFinal = 0;
        for (T item: listarCosas) {
            if(item instanceof Alimento){
                precioFinal+= ((Alimento)item).getPrecio();
            }else{
                precioFinal+=((Mueble)item).getPrecio();
            }

        }
        System.out.println("Precio final: "+precioFinal);
    }

    public ArrayList<T> getListarCosas() {
        return listarCosas;
    }

    public void setListarCosas(ArrayList<T> listarCosas) {
        this.listarCosas = listarCosas;
    }
}
