package inventario;

public final class Carne extends Alimento {
    private String proteinas;

    public Carne(String origen, String calidad, int precio, String proteinas) {
        super(origen, calidad, precio);
        this.proteinas = proteinas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Proteinas: " + proteinas);
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }
}
