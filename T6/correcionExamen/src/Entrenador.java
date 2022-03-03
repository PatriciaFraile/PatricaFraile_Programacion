public final class Entrenador  extends Persona{
    private String vocacion;

    public Entrenador(){

    }

    public Entrenador(String nombre, String apellidos, String dni, int edad, String vocacion , double sueldo) {
        super(nombre, apellidos, dni, edad , sueldo);
        this.vocacion = vocacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Vocación:\t"+vocacion);
    }

    @Override
    public void calcularSueldo() {

        this.sueldo = sueldo*1.25;

    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

}
