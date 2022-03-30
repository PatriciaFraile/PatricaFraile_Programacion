package inventario;

public class Alimento implements Inventariable {
    protected String calidad, origen;
    protected double precio;

    public Alimento(String origen, String calidad, int precio) {
        this.origen = origen;
        this.calidad = calidad;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("Origen: " + origen);
        System.out.println("Calidad: " + calidad);
        System.out.println("Precio: " + precio);
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio+(this.precio*Inventariable.IVA_ALIMENTOS));
        System.out.println("El precio con IVA es: "+precio);
    }
}
