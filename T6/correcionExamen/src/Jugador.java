public final class Jugador extends Persona{
    private String posicion;
    public Jugador(){}

    public Jugador(String nombre, String apellidos, String dni, int edad , String posicion , double sueldo) {
        super(nombre, apellidos, dni, edad , sueldo);
        this.posicion = posicion;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posicion:\t"+posicion);

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


}
