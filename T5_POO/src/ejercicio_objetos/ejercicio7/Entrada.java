package ejercicio_objetos.ejercicio7;
import java.util.Scanner;
import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Object>consumiciones = new ArrayList();
        System.out.println("Registrar cuenta");
        System.out.println("Que identificador quieres");
        int numero = entrada.nextInt();
        Cuenta cuenta1 = new Cuenta(numero);
        Cuenta cuenta2 = new Cuenta(12);
        //incompleto


    }
}
