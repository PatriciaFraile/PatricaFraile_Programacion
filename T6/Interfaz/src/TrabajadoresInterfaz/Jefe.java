package TrabajadoresInterfaz;

public class Jefe extends Trabajador implements Comision {
    private int numeroTrabajadores;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, double sueldo, Departamentos departamento, int numeroTrabajadores) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numeroTrabajadores = numeroTrabajadores;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" Numero trabajadores "+numeroTrabajadores);
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
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
