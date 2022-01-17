package Ejercicio3;

import Ejercicio1.Persona;

public class Persona3 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Paula", "Hernández", "6849846B", 12, 20, 45.7);
        persona1.setEdad(20);
        persona1.setPeso(70);
        persona1.setAltura(180);
        persona1.IncrementarEdad(10);
        System.out.println(persona1.calcularIMC());

    }
}
