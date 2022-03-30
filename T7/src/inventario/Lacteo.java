package inventario;

public final class Lacteo extends Alimento {
    private int volumen;

    public Lacteo(String origen, String calidad, int precio, int volumen) {
        super(origen, calidad, precio);
        this.volumen = volumen;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Volumen: " + volumen);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
