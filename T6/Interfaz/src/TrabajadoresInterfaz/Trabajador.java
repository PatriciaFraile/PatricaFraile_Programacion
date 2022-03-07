package TrabajadoresInterfaz;

public class Trabajador extends Persona{
    private int sueldo;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo" +sueldo);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
