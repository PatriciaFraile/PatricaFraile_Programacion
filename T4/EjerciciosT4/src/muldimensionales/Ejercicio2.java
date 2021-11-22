package muldimensionales;


import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        int alumnos =3;
        int alumnosRegistrados = 0;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int notaMedia = 0;

        Object [][] alumno = new Object [3][5];
        alumno[0][0] = "Paula";
        alumno [0][1] = nota1;
        alumno [0][2] = nota2;
        alumno [0][3] = nota3;
        alumno[0][4] = notaMedia;

        alumno[1][0] = "Alejandro";
        alumno [1][1] = nota1;
        alumno [1][2] = nota2;
        alumno [1][3] = nota3;
        alumno[1][4] = notaMedia;

        alumno[2][0] = "Pablo";
        alumno [2][1] = nota1;
        alumno [2][2] = nota2;
        alumno [2][3] = nota3;
        alumno[2][4] = notaMedia;

        nota1 = (int)(Math.random()*11);
        nota2 = (int)(Math.random()*11);
        nota3 = (int)(Math.random()*11);
        notaMedia = (nota1+nota2+nota3)/3;

        int opcion;
        do{

            System.out.println("1.Definir el numero de registros");
            System.out.println("2. Registrar alumnos");
            System.out.println("3. Ver datos media de los alumnos");
            System.out.println("4.Ver datos concretos de un alumno");
            System.out.println("5. Ver media asignatura1");
            System.out.println("6.Ver media asignatura2");
            System.out.println("7.Ver media asignatura3");
            System.out.println("Que opción quieres");
            opcion= entradaTeclado.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("Has elegido definir el numero de registros");
                    System.out.println("Que numero de registros quieres");
                    alumnosRegistrados = entradaTeclado.nextInt();
                    if(alumnos==alumnosRegistrados){
                        System.out.println("El numero registrado de alumnos es 3");
                    }
                    else if (alumnos!=alumnosRegistrados){
                        System.out.println("Error");
                    }
                    break;
                case 2 :
                    System.out.println("Has elegido registrar alumnos");

                    if(alumno[0][0]==null){
                        System.out.println("No hay alumnos registrados");
                    }
                    else if(alumno[0][0]!=null){
                    System.out.println("Hay alumno registrado");
                }
                if(alumno[1][0]==null){
                    System.out.println("No hay alumnos registrados");
                }
                else if(alumno[1][0]!=null){
                    System.out.println("Hay alumno registrado");
                }
                if(alumno[2][0]==null){
                    System.out.println("No hay alumnos registrados");
                }
                else if(alumno[2][0]!=null){
                    System.out.println("Hay alumno registrado");
                }
                    break;
                case 3:
                    System.out.println("Has elegido ver nota media de los alumnos");
                    String nombre = (String) alumno[0][0];
                    System.out.println(nombre + " su nota media es " + notaMedia);
                    String nombre2 = (String) alumno[1][0];
                    System.out.println(nombre2 + " su nota media es " + notaMedia);
                    String nombre3 = (String) alumno[2][0];
                    System.out.println(nombre3 + " su nota media es " + notaMedia);
                    break;
                case 4:
                    String persona;
                    System.out.println("Has elegido ver datos concretos de un alumno");
                    System.out.println("Que alumno quieres ver");
                    persona = entradaTeclado.nextLine();
                case 5:
                    int mediaAsignatura1;
                    mediaAsignatura1 = (nota1 + nota1 + nota1 )/3;
                    System.out.println("Has elegido ver la media de la nota 1 ");
                    System.out.println("La media es :" + mediaAsignatura1);
                    break;
                case 6:
                    int mediaAsignatura2;
                    mediaAsignatura2 = (nota2+nota2+nota2)/3;
                    System.out.println("Has elegido ver la media de la nota 2 ");
                    System.out.println("La media es :" + mediaAsignatura2);
                    break;
                case 7:
                    int mediaAsignatura3;
                    mediaAsignatura3 = (nota3+nota3+nota3)/3;
                    System.out.println("Has elegido ver la media de la nota 2 ");
                    System.out.println("La media es :" + mediaAsignatura3);
                    break;
                default:
                    System.out.println("Salir");
            }
        }while(opcion<=7);
        entradaTeclado.close();

    }

}
