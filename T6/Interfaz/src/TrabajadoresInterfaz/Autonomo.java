package TrabajadoresInterfaz;

public final class Autonomo extends Trabajador {
    private String factura;
    private double cuota;

    public Autonomo() {
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (cuota + (cuota * Administracion.IVA)) - (this.sueldo * Administracion.IRPF);
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldo, Departamentos departamento, double cuota) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.cuota = cuota;
    }

    public void realizarFactura() {
        this.factura = String.format("Factura realizada por un importe de %.2f a la empresa con CIF %s", this.sueldo, Administracion.CIF);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota: " + cuota);
        System.out.println("Factura: " + factura);
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
