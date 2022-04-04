package repaso2;


import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Scanner entradaTeclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1.Crear una cuenta\n2.Ingresar dinero\n3.Sacar dinero\n 4.Ver saldo\n 5.Ver errores");
            System.out.println("Que opcion quieres");
            opcion = entradaTeclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Crear una cuenta");
                    System.out.println("ID");
                    String id = entradaTeclado.next();
                    cuenta.setId(id);
                    System.out.println("SALDO");
                    int saldo = entradaTeclado.nextInt();
                    cuenta.setSaldo(saldo);
                    System.out.println("PIN");
                    int pin= entradaTeclado.nextInt();
                    cuenta.setPin(pin);
                    break;
                case 2:
                    System.out.println("Ingresar dinero");
                    System.out.println("Que dinero quieres incresar");
                    int dinero = entradaTeclado.nextInt();
                    cuenta.ingresarDinero(dinero);
                    break;
                case 3:
                    System.out.println("Sacar dinero");
                    System.out.println("Sacar");
                    dinero = entradaTeclado.nextInt();
                    cuenta.sacarDinero(dinero);

            }
        }while(opcion!=5);
    }
}
