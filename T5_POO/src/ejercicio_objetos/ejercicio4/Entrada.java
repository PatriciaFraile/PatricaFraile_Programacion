package ejercicio_objetos.ejercicio4;

import java.util.Scanner;
public class Entrada {
   /* public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Banco banco = new Banco();
        Cuenta cuenta = new Cuenta();
        int opcion;
        do{
            System.out.println("1.BBVA");
            System.out.println("2.Santander");
            System.out.println("Introduce el banco que quieres");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("--Seleccionado BBVA--");
                    do{
                        System.out.println("1. Crear una cuenta");
                        System.out.println("2. Ingresar dinero");
                        System.out.println("3. Sacar dinero");
                        System.out.println("4. Ver cuentas de un cliente");
                        System.out.println("5. Ver todas las cuentas");
                        System.out.println("Que quieres hacer:");
                        opcion = entrada.nextInt();
                        switch (opcion){
                            case 1:
                                System.out.println("-- Seleccionado crear cuenta");
                                System.out.println("Introduce DNI de titular");
                                String dni = entrada.next();
                                System.out.println("Introduce pin asociado ");
                                int pin = entrada.nextInt();
                                System.out.println("Introduce el saldo inicial");
                                int saldoInicial = entrada.nextInt();
                                Cuenta cuenta1 = new Cuenta(dni,pin,saldoInicial);
                                banco.crearCuenta(cuenta1);
                                System.out.println("--- Cuenta creada correctamente ---");
                                break;
                            case 2:
                                System.out.println("-- Seleccionado ingresar dinero");
                                System.out.println("Introduce DNI de titular");
                                dni = entrada.next();
                                System.out.println("Introduce pin asociado ");
                                pin = entrada.nextInt();
                                System.out.println("Introduce el saldo para ingresar");
                                int saldoIngresar = entrada.nextInt();
                                cuenta1.ingresarDinero(pin,dni, saldoIngresar);
                                System.out.println("--- Dinero ingresado correctamente ---");
                                break;
                            case 3:
                                System.out.println("-- Seleccionado sacar dinero");
                                System.out.println("Introduce DNI de titular");
                                dni = entrada.next();
                                System.out.println("Introduce pin asociado");
                                pin = entrada.nextInt();
                                System.out.println("Introduce saldo a sacar");
                                int saldoRetirar = entrada.nextInt();
                                cuenta1.sacarDinero(saldoRetirar,dni,pin);
                                System.out.println("--- Dinero sacado correctamente ---");
                            case 4:
                                System.out.println("-- Seleccionado ver cuentas cliente");
                                System.out.println("Introduce el dni del titular");
                                dni = entrada.next();
                                banco.listaCuentasCliente(dni);

                                System.out.println("--- Listadas cuentas cliente correctamente ---");
                            case 5:
                                System.out.println("-- Seleccionado ver cuentas del banco");
                                banco.listarCuentas();
                        }
                    }while (opcion!=5);
                case 2:
                    System.out.println("--Seleccionado SANTANDER--");
                    do{
                        System.out.println("1. Crear una cuenta");
                        System.out.println("2. Ingresar dinero");
                        System.out.println("3. Sacar dinero");
                        System.out.println("4. Ver cuentas de un cliente");
                        System.out.println("5. Ver todas las cuentas");
                        System.out.println("Que quieres hacer:");
                        opcion = entrada.nextInt();
                        switch (opcion){
                            case 1:
                                System.out.println("-- Seleccionado crear cuenta");
                                System.out.println("Introduce DNI de titular");
                                String dni = entrada.next();
                                System.out.println("Introduce pin asociado ");
                                int pin = entrada.nextInt();
                                System.out.println("Introduce el saldo inicial");
                                int saldoInicial = entrada.nextInt();
                                Cuenta cuenta1 = new Cuenta(dni,saldoInicial,pin);
                                banco.crearCuenta(cuenta1);
                                System.out.println("--- Cuenta creada correctamente ---");
                                break;
                            case 2:
                                System.out.println("-- Seleccionado ingresar dinero");
                                System.out.println("Introduce DNI de titular");
                                dni = entrada.next();
                                System.out.println("Introduce pin asociado ");
                                pin = entrada.nextInt();
                                System.out.println("Introduce el saldo para ingresar");
                                int saldoIngresar = entrada.nextInt();
                                cuenta1.ingresarDinero(pin,dni, saldoIngresar);
                                System.out.println("--- Dinero ingresado correctamente ---");
                                break;
                            case 3:
                                System.out.println("-- Seleccionado sacar dinero");
                                System.out.println("Introduce DNI de titular");
                                dni = entrada.next();
                                System.out.println("Introduce pin asociado");
                                pin = entrada.nextInt();
                                System.out.println("Introduce saldo a sacar");
                                int saldoRetirar = entrada.nextInt();
                                cuenta1.sacarDinero(saldoRetirar,dni,pin);
                                System.out.println("--- Dinero sacado correctamente ---");
                            case 4:
                                System.out.println("-- Seleccionado ver cuentas cliente");
                                System.out.println("Introduce el dni del titular");
                                dni = entrada.next();
                                banco.listaCuentasCliente(dni);

                                System.out.println("--- Listadas cuentas cliente correctamente ---");
                            case 5:
                                System.out.println("-- Seleccionado ver cuentas del banco");
                                banco.listarCuentas();
                        }
                    }while (opcion!=5);


            }
        }while (opcion!=2);

    }*/
}
