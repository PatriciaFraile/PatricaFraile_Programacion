package inventario;

public class Mueble implements Inventariable {
    protected String material, peso;
    protected double precio;

    public Mueble(String material, String peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("Material: " + material);
        System.out.println("Peso: " + peso);
        System.out.println("Precio: " + precio);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio+(this.precio*Inventariable.IVA_MUEBLES));
        System.out.println("El precio con IVA es: "+precio);
    }
}
