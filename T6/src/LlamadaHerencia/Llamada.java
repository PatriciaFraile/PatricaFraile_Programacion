package LlamadaHerencia;

public abstract class Llamada {
    protected int origen, destino, duracion;
    protected double coste;

    Llamada() {
    }

    public Llamada(int origen, int destino, double coste, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.coste = coste;
        this.duracion = duracion;
    }

    public void mostrarDatos() {
        System.out.println("El numero de origen es :" + origen);
        System.out.println("El numero de destino es :" + destino);
        System.out.println("El coste es :" + coste);
    }

    public abstract void costeLlamadas();

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

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
