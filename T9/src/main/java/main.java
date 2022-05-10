import controller.Alumno;
import controller.ControllerBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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


    }
}
