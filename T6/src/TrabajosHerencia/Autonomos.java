package TrabajosHerencia;


public class Autonomos extends Trabajadores {
    private String nombre, apellidos, dni;
    private double sueldo;
    private boolean contrato;

    public Autonomos(String nombre, String apellidos, String din, double sueldo, boolean contrato) {
        super(nombre, apellidos, din);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.contrato = contrato;
        this.dni = dni;
    }

    public Autonomos() {
    }

    @Override
    public void mostrarDatos(String din) {
        super.mostrarDatos(din);
        System.out.println("Contrato:\t" + contrato);
        System.out.println("Sueldo:\t" + sueldo);
    }

    @Override
    public void mostrarDatoss() {
        super.mostrarDatoss();
        System.out.println("Contrato:\t" + contrato);
        System.out.println("Sueldo:\t" + sueldo);
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

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
}
