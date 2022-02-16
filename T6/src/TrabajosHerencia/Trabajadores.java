package TrabajosHerencia;
//incompleto
public class Trabajadores {
    protected String nombre, apellidos, din;

    public Trabajadores() {
    }

    public Trabajadores(String nombre, String apellidos, String din) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.din = din;
    }

    public void mostrarDatos() {
        System.out.println("Nombre" + nombre);
        System.out.println("Apellidos" + apellidos);
        System.out.println("DNI" + din);
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

    public String getDin() {
        return din;
    }

    public void setDin(String din) {
        this.din = din;
    }
}
