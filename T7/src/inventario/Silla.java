package inventario;

public  final class Silla extends Mueble {
    private int patas;

    public Silla(String material, String peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de patas: "+patas);
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
