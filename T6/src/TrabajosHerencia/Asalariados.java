package TrabajosHerencia;

public class Asalariados extends Trabajadores {
    private String nombre, apellidos, dni;
    private double sueldo;
    private int numeroPagas;
    private boolean contrato;

    public Asalariados(String nombre, String apellidos, String din, double sueldo, int numeroPagas, boolean contrato) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sueldo = sueldo;
        this.numeroPagas = numeroPagas;
        this.contrato = contrato;
    }

    public Asalariados() {}

    @Override
    public void mostrarDatos(String din) {
        super.mostrarDatos(din);
        System.out.println("Tu sueldo es:" + sueldo);
        System.out.println("El numero de pagas es:" + numeroPagas);
        System.out.println("Tu contrato es:" + contrato);
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
}
