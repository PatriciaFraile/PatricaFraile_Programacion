package Ejercicio1;

public class Persona {
    private String nombre, apellidos, dni;
    private int edad, altura;
    private double peso;


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

    public void IncrementarEdad(int edadIncremento){
        this.edad+= edadIncremento;

    }
    public  String estadoIMC(){
         double IMC = calcularIMC()*1000;
         String estado =" ";
         if(IMC<18){
             estado = "normal";
        }else if(IMC >18.5 && IMC<24.9){
             estado = "normal";

        }else if(IMC>=25 &&IMC<29.9) {
             estado = "Peso superior a normal";
         } else{
             estado="Obesidad";
         }
         return estado;
    }
public double calcularIMC(){
        double imc = this.peso/Math.pow(this.altura,2);

        return imc;
}

    public void mostrarDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellidos:" + "\t" + apellidos);
        System.out.println("Edad:" + "\t" + edad);
        System.out.println("dni:" + "\t" + dni);
        System.out.println("Altura:" + "\t" + altura);
        System.out.println("Peso:" + "\t" + peso);
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
