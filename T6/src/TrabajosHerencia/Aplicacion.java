package TrabajosHerencia;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcion;
        do {
            System.out.println("1.Registrar\n2.Listar\n3.Mostrar datos");
            System.out.println("Que opcion quieres");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--Registrar trabajadores--");
                    do {
                        System.out.println("1.Autonomos\n2.Asalariados\n3.Jefes");
                        System.out.println("Como te quieres registrar");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("--Autonomos");
                                System.out.println("Escribe tu nombre");
                                String nombre = entrada.next();
                                System.out.println("Escribe tus apellidos");
                                String apellidos = entrada.next();
                                System.out.println("Escribe tu sueldo");
                                double sueldo = entrada.nextDouble();
                                System.out.println("Tienes contrato");
                                boolean contrato = entrada.nextBoolean();
                                System.out.println("Escribe tu dni ");
                                String dni = entrada.next();
                                Autonomos autonomos = new Autonomos(nombre, apellidos, dni, sueldo, contrato);
                                empresa.añadirPersonal(autonomos);
                                break;
                            case 2:
                                System.out.println("--Asalariados");
                                System.out.println("Escribe tu nombre");
                                nombre = entrada.next();
                                System.out.println("Escribe tus apellidos");
                                apellidos = entrada.next();
                                System.out.println("Escribe tu sueldo");
                                sueldo = entrada.nextDouble();
                                System.out.println("Tienes contrato");
                                contrato = entrada.nextBoolean();
                                System.out.println("Escribe tu dni ");
                                dni = entrada.next();
                                System.out.println("Numero de pagas");
                                int numPagas = entrada.nextInt();
                                Asalariados asalariados = new Asalariados(nombre, apellidos, dni, sueldo, numPagas, contrato);
                                empresa.añadirPersonal(asalariados);
                                break;
                            case 3:
                                System.out.println("Jefes");
                                System.out.println("Escribe tu nombre");
                                nombre = entrada.next();
                                System.out.println("Escribe tus apellidos");
                                apellidos = entrada.next();
                                System.out.println("Escribe tu dni ");
                                dni = entrada.next();
                                System.out.println("Tus acciones son");
                                String acciones = entrada.next();
                                System.out.println("Tus beneficios son");
                                String beneficios = entrada.next();
                                Jefes jefes = new Jefes(nombre, apellidos, dni, beneficios, acciones);
                                empresa.añadirPersonal(jefes);
                                break;
                        }

                    } while (opcion == 3);
                    break;
                case 2:
                    System.out.println("--Listar--");
                    do {
                        System.out.println("1.Autonomos\n2.Asalariados3\n4.Todos");
                        System.out.println("Que quieres listar");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Autonomos");
                                empresa.listarAutonomos();
                                break;
                            case 2:
                                System.out.println("Asalariados");
                                empresa.listarAsalariados();
                                break;
                            case 3:
                                System.out.println("Todos");
                                empresa.listarTodas();

                                break;
                        }

                    } while (opcion == 3);

                    break;
                case 3:
                    System.out.println("--Mostrar Datos--");
                    System.out.println("Escribe el dni");
                    String dni = entrada.next();
                    empresa.mostrarDatos();
                    break;
            }

        } while (opcion != 3);
        entrada.close();
    }
}
