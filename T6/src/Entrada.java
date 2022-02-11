import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Concesionario concesionario = new Concesionario();
        Coche coche = new Coche("123A", "123", 100, 20000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());
        System.out.println("Coche agregado");
        concesionario.agregarCoche(coche);
        Deportivo deportivo = new Deportivo("234B", "234", 200, 2500, 600);
        System.out.println("Deportivo");
        deportivo.calcularVelocidad(678);
        System.out.println(deportivo.getVelocidad());
        System.out.println("Deportivo agregado");
        concesionario.agregarCoche(deportivo);
        deportivo.mostrarDatos();
        Electrico electrico = new Electrico("2345", "222", 200, 300, 400);
        System.out.println("Electrico");
        electrico.calcularVelocidad(1234);
        System.out.println(electrico.getVelocidad());
        electrico.mostrarDatos();
        System.out.println("Electrico agregado");
        concesionario.agregarCoche(electrico);
        Suv suv = new Suv("2345", "3456", 455, 678, true);
        System.out.println("Suv");
        suv.calcularVelocidad(89);
        System.out.println(suv.getVelocidad());
        suv.mostrarDatos();
        System.out.println("Suv agregado");
        concesionario.agregarCoche(suv);
        System.out.println("Que coche quieres buscar");
        String matricula = entrada.next();
        concesionario.buscarCoches(matricula);
        System.out.println("Que coche quieres borrar");
        String matricula2 = entrada.next();
        concesionario.borrarCoche(matricula2);


    }
}
