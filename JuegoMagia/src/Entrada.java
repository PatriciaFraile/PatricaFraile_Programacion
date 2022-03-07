import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        preguntas preguntas = new preguntas();
        Scanner entradada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Como me  llamo ");
            System.out.println("2.Que soy");
            System.out.println("3.Donde trabajo");
            System.out.println("4.Que asignatura doy");
            System.out.println("5.Salir del juego");
            System.out.println("Que pregunta quieres");
            opcion = entradada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--Como me  llamo--");
                    preguntas.mostrarNombre();
                    break;
                case 2:
                    System.out.println("--Que soy--");
                    preguntas.mostrarProfesion();
                    break;
                case 3:
                    System.out.println("--Donde trabajo--");
                    preguntas.mostrarLugar();
                    break;
                case 4:
                    System.out.println("--Que asignatura doy--");
                    preguntas.mostrarAsignatura();
                    break;
                case 5:
                    System.out.println("Salir del juego");

            }
        } while (opcion<5);
    }
}
