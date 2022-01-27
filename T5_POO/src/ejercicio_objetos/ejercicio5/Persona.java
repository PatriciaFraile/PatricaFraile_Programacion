package ejercicio_objetos.ejercicio5;

public class Persona {
    private String nombre , DNI;
    private int telefono;

    public Persona(){

    }
    public Persona(String nombre , String DNI , int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.DNI = DNI;
    }
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(telefono);
        System.out.println(DNI);

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
