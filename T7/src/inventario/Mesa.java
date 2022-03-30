package inventario;

public final class Mesa extends Mueble {
    private int capacidad;

    public Mesa(String material, String peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: "+capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
