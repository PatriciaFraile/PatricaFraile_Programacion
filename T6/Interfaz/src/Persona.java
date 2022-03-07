public  abstract class Persona {
    protected String nombre, apellidos, dni;
    protected int edad;
    protected double sueldo;
    public Persona() {

    }
    public Persona(String nombre, String apellidos, String dni, int edad , double sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.sueldo = sueldo;
        calcularSueldo();
    }



    public  void calcularSueldo() {

    }
    public void mostrarDatos(){
        System.out.println("Nombre:\t"+nombre);
        System.out.println("Apellidos:\t"+apellidos);
        System.out.println("DNI:\t"+dni);
        System.out.println("Edad:\t"+edad);
        System.out.println("Sueldo:\t"+sueldo);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

