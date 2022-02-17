package LlamadaHerencia;


public final class LlamadaProvincial extends Llamada {
    private final double coste = 0.15;
    private int origen, destino, duracion;

    public LlamadaProvincial(double coste, int origen, int destino, int duracion) {
        coste = coste;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public LlamadaProvincial() {
    }

    @Override
    public void costeLlamadas() {
        double resultado = this.coste * this.duracion;
        System.out.println("El coste de llamadas es:" + resultado);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }


    public int getOrigen() {
        return origen;
    }


    public void setOrigen(int origen) {
        this.origen = origen;
    }

    @Override
    public int getDestino() {
        return destino;
    }

    @Override
    public void setDestino(int destino) {
        this.destino = destino;
    }
}
