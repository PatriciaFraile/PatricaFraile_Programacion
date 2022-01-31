package ejercicio_objetos.ejercicio6;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Toyota", "11344DQ", 4566);
        System.out.println("Coche1");
        coche1.mostrarDatos();
        System.out.println("Coche2");
        coche2.mostrarDatos();
        System.out.println("Modificar la velocidad del coche1");
        coche1.setVelocidad((int) (Math.random() * 31) + 20);
        System.out.println("Modificar la velocidad del coche2");
        coche2.setVelocidad((int) (Math.random() * 31) + 20);
        System.out.println("Coche1");
        coche1.mostrarDatos();
        System.out.println("Coche2");
        coche2.mostrarDatos();
        if (coche1.getKilometros() > coche2.getKilometros()) {
            System.out.println("El ganador es el coche1");
        } else {
            System.out.println("El ganador es el coche2");
        }

    }
}
