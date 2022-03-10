package TrabajadoresInterfaz;

public enum Departamentos {

    Ventas("ventas", 10), Fianzas("fianzas", 23), IT("IT", 23), Comercial("Comercial", 56);

    String nombre;
    int numeroTrabajadores;

    Departamentos(String nombre, int numeroTrabajadores) {
        this.nombre = nombre;
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
