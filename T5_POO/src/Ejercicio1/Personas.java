package Ejercicio1;

public class Personas {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Paula", "Hernández", "6849846B", 12, 20, 45.7);
        Persona persona2 = new Persona("Paula", "Hernández", "6849846B", 12);
        Persona persona3 = new Persona("Paula", "Hernández");
        Persona persona4 = new Persona();
        System.out.println("Persona 1");
        persona1.mostrarDatos();
        System.out.println("Persona 2");
        persona2.mostrarDatos();
        System.out.println("Persona 3");
        persona3.mostrarDatos();
        System.out.println("Persona 4");
        persona4.mostrarDatos();
    }
}
