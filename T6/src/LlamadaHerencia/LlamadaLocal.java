package LlamadaHerencia;

public class LlamadaLocal extends Llamada {
    private int origen, destino, duracion;


    public LlamadaLocal(int origen, int destino, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public LlamadaLocal() {
    }

    @Override
    public void costeLlamadas() {

    }

    public int getOrigen() {
        return origen;
    }


    public void setOrigen(int origen) {
        this.origen = origen;
    }


    public int getDestino() {
        return destino;
    }


    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
