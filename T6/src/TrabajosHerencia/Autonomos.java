package TrabajosHerencia;

public class Autonomos extends Trabajadores {
    private String nombre, apellidos, dni;
    private double sueldo;
    private boolean contrato;

    public Autonomos(String nombre, String apellidos, String dni, double sueldo, boolean contrato) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.contrato = contrato;
        this.dni = dni;
    }
    public Autonomos(){}

    @Override
    public void mostrarDatos(String din) {
        super.mostrarDatos(din);
        System.out.println("Su contrato es:" + contrato);
        System.out.println("Su sueldo es:" + sueldo);
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

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
}
