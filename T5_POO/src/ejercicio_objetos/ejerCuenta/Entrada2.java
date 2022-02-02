package ejercicio_objetos.ejerCuenta;

import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Creamos la primera cuenta por defecto
        Cuenta cuenta = new Cuenta();
        System.out.println("Escribe tu nombre");
        String nombre = entrada.next();
        System.out.println("Escribe el numero de cuenta");
        String numCuenta = entrada.next();
        System.out.println("Tipo de intereses");
        int intereses = entrada.nextInt();
        System.out.println("El saldo es");
        int saldo = entrada.nextInt();
        cuenta.setNombre(nombre);
        cuenta.setNumCuenta(numCuenta);
        cuenta.setInteres(intereses);
        cuenta.setSaldo(saldo);
        //Creamos la segunda cuenta
        System.out.println("Escribe tu nombre");
        String nombre2 = entrada.next();
        System.out.println("Escribe el numero de cuenta");
        String numCuenta2 = entrada.next();
        System.out.println("Tipo de intereses");
        int intereses2 = entrada.nextInt();
        System.out.println("El saldo es");
        int saldo2 = entrada.nextInt();
        Cuenta cuenta1 = new Cuenta(nombre2, numCuenta2, intereses2, saldo2);
        System.out.println("Cuanto quieres ingresar");
        double n = entrada.nextDouble();
        cuenta1.ingresar(n);
        System.out.println("Cuanto quieres reintegrar");
        n = entrada.nextDouble();
        cuenta1.reintegro(n);
        System.out.println("Cuanto quieres hacer la transferencia");
        n = entrada.nextDouble();
        cuenta.transferencia(cuenta1,n);



    }

}
