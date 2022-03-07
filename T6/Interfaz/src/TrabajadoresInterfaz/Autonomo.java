package TrabajadoresInterfaz;

public final class Autonomo extends Trabajador {
    private int cuota, factura;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota: " + cuota);
        System.out.println("Factura: " + factura);
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }
}
