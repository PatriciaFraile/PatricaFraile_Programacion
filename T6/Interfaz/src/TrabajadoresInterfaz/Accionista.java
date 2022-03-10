package TrabajadoresInterfaz;

public final class Accionista extends Persona implements Comision{
    private int porAcciones;

    public Accionista() {
    }

    public Accionista(String nombre, String apellido, String dni, int porAcciones) {
        super(nombre, apellido, dni);
        this.porAcciones = porAcciones;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("% acciones: " +porAcciones);
    }

    public int getPorAcciones() {
        return porAcciones;
    }

    public void setPorAcciones(int porAcciones) {
        this.porAcciones = porAcciones;
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11)/3;
        return 0;
    }

    @Override
    public void obtenerBeneficios() {

    }
}
