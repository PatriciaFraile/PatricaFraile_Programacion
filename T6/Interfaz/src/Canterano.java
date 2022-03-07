public final class Canterano extends Persona implements Seleccionable{
    private String posicion;
    private int ataque;
    public Canterano(){}

    public Canterano(String nombre, String apellidos, String dni, int edad , String posicion , double sueldo, int ataque) {
        super(nombre, apellidos, dni, edad , sueldo);
        this.posicion = posicion;
        this.ataque = ataque;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posicion:\t"+posicion);
        System.out.println("Ataque:\t"+ataque);

    }

    @Override
    public void calcularSueldo() {
        this.sueldo = sueldo*1.5;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }

    @Override
    public void repartirPrima() {
        this.sueldo+=200;
    }
}
