package LlamadaHerencia;

public class LlamadaNacional extends Llamada {

    private int franja, origen , destino , duracion;

    public LlamadaNacional(int origen, int destino, int duracion, int franja) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.franja = franja;
    }


    @Override
    public void costeLlamadas() {
        switch (franja) {
            case 1:
                this.coste = this.duracion * 0.20;
                break;
            case 2:
                this.coste = this.duracion * 0.25;
                break;
            case 3:
                this.coste = this.duracion * 0.30;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Franja" + franja);
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }

    @Override
    public int getOrigen() {
        return origen;
    }

    @Override
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
