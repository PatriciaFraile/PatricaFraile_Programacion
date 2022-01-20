package ejercicio_objetos.ejercicio1;

public class Aplicación {
    public static void main(String[] args) {//mirar el fallo

        Garaje garaje = new Garaje();

        Motor coche2= new Motor(110);
        Coche primero = new Coche("Peugeot","205");
        Coche segundo = new Coche("Seat","Leon");
        garaje.aceptarCoche(primero,"aceite");
        garaje.aceptarCoche(segundo,"filtros");
        garaje.devolverCoche();
        garaje.aceptarCoche(segundo,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(primero,"motor");
        garaje.devolverCoche();
        garaje.aceptarCoche(segundo,"aceite");
        primero.getPrecioAcumulado();

        System.out.println("El coche: " + primero.getMarca() + " " +primero.getModelo()+ " se ha gastado: " +primero.getPrecioAcumulado());

        System.out.println("El coche: " + segundo.getMarca() + " " +segundo.getModelo()+ " se ha gastado: " +segundo.getPrecioAcumulado());


    }
}
