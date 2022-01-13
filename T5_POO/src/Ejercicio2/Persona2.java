package Ejercicio2;
public class Persona2 {
    private String nombre,apellidos,dni;
    private int altura,edad;
    private double peso;
    public void mostrarDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellidos:"+"\t" +apellidos);
        System.out.println("Edad:"+"\t" + edad);
        System.out.println("dni:"+"\t" + dni);
        System.out.println("Altura:"+"\t" + altura);
        System.out.println("Peso:"+"\t" +peso);
    }
    public Persona2(String nombre , String apellidos, String dni , int altura , int edad , double peso){
        this.nombre= nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }
    public Persona2(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Persona2(){
        nombre = "null";
        apellidos = "null";
        dni = "null";
        altura = 0;
        edad = 0;
        peso = 0.0;

    }
}
