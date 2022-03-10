package TrabajadoresInterfaz;

public class Asalariado extends Trabajador{
    int numeroPagas;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, int sueldo, Departamentos departamento, int numeroPagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo*Administracion.IRPF);

    }
}
