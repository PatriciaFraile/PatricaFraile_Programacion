public class Persona {
    private String nombre, apellidos, dni;
    private int edad, altura;
    private double peso;

    public void mostrarDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellidos:"+"\t" +apellidos);
        System.out.println("Edad:"+"\t" + edad);
        System.out.println("dni:"+"\t" + dni);
        System.out.println("Altura:"+"\t" + altura);
        System.out.println("Peso:"+"\t" +peso);
    }

    public Persona(String nombre, String apellidos, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        dni = "111111111X";
        altura = 0;
        peso = 0.0;
    }

    public Persona() {
        nombre = "por defecto";
        apellidos = "por defecto";
        dni = "por defecto";
        altura = 0;
    }
}
