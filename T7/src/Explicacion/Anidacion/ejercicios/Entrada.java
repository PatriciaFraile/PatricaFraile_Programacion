package Explicacion.Anidacion.ejercicios;

public class Entrada {
    public static void main(String[] args) {
        Coche coche = new Coche("123654TY","Toyota",500);
        coche.mostrarDatos();
        Coche.Motor motor = coche.new Motor(500,200);
        coche.mostrarDatos();
    }
}
