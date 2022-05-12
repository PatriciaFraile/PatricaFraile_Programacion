import controller.ControllerBD;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String opcion = null;
        Scanner entradaTeclado = new Scanner(System.in);

        ControllerBD controllerBD = new ControllerBD();
        //controllerBD.insertarAlumnosStatement();
       /* do{
        System.out.println("Introduce un nombre");
        String nombre = entradaTeclado.next();
        System.out.println("Introduce un apellido");
        String apellido =  entradaTeclado.next();
        System.out.println("Introduce una edad");
        int edad = entradaTeclado.nextInt();
        Alumno alumno = new Alumno(nombre,apellido,edad);
        controllerBD.introducirAlumnos(alumno);
        System.out.println("Quieres continuar insertando (S/N)");
        opcion = entradaTeclado.next();
        }while (opcion.equalsIgnoreCase("s"));
        */
       // controllerBD.insertarAlumnosPrepare();
        /*System.out.println("Introduce el nombre del usuario");
        String nombre =  entradaTeclado.next();
        System.out.println("Introduce la edad");
        int edad = entradaTeclado.nextInt();*/
        controllerBD.getResultados();


    }
}
