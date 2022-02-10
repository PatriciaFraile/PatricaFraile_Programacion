public class Entrada {
    public static void main(String[] args) {
        Coche coche = new Coche("123A", "123", 100, 20000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());
        Deportivo deportivo = new Deportivo("234B", "234", 200, 2500, 600);
        Electrico electrico = new Electrico("2345", "222", 200, 300, 400);
        Suv suv = new Suv("2345", "3456", 455, 678, 111);

    }
}
