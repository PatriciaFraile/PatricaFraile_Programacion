package Ejercicio2;
import java.util.Scanner;
public class Ejer2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("Escribe tus apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Escribe tu dni");
        String dni = entrada.nextLine();
        System.out.println("Escribe tu edad");
        int edad = entrada.nextInt();
        System.out.println("Escribe tu altura");
        int altura = entrada.nextInt();
        System.out.println("Escribe tu peso");
        double peso = entrada.nextDouble();
        Persona2 persona1 = new Persona2(nombre,apellidos,dni,edad,altura,peso);
        Persona2 persona2 = new Persona2("Paula", "Hernández");
        Persona2 persona3 = new Persona2();
        System.out.println("Persona 1");
        persona1.mostrarDatos();
        System.out.println("Persona 2");
        persona2.mostrarDatos();
        System.out.println("Persona 3");
        persona3.mostrarDatos();
        persona1.setEdad(20);
        persona1.mostrarDatos();
        persona2.setEdad(20);
        persona2.mostrarDatos();
        persona3.setEdad(20);
        persona3.mostrarDatos();

    }
}
