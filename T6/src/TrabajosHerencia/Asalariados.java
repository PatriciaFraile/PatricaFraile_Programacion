package TrabajosHerencia;

public class Asalariados extends Trabajadores {
    private String nombre, apellidos, dni;
    private double sueldo;
    private int numeroPagas;
    private boolean contrato;

    public Asalariados(String nombre, String apellidos, String din, double sueldo, int numeroPagas, boolean contrato) {
        super(nombre, apellidos, din);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sueldo = sueldo;
        this.numeroPagas = numeroPagas;
        this.contrato = contrato;
    }

    public Asalariados() {
    }

    @Override
    public void mostrarDatos(String din) {
        super.mostrarDatos(din);
        System.out.println("Tu sueldo es:\t" + sueldo);
        System.out.println("El numero de pagas es:\t" + numeroPagas);
        System.out.println("Tu contrato es:\t" + contrato);
    }

    @Override
    public void mostrarDatoss() {
        super.mostrarDatoss();
        System.out.println("Tu sueldo es:\t" + sueldo);
        System.out.println("El numero de pagas es:\t" + numeroPagas);
        System.out.println("Tu contrato es:\t" + contrato);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
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
