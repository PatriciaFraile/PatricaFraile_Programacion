package ListaMultimedia;
//incompleto

import java.util.Scanner;

public class Aplicación {
    public static void main(String[] args) {
        int opcion;
        Entrada entrada = new Entrada();
        Scanner entradaLista = new Scanner(System.in);
        do {
            System.out.println("1.Añadir collección\n2.Eliminar colección\n3.Lista elementos\n4.Salir");
            System.out.println("Que opción quieres elegir");
            opcion = entradaLista.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-- Añadir colección");
                    do {
                        System.out.println("1.Audio\n2.Libro\n3.Video");
                        System.out.println("Que opcion quieres");
                        opcion = entradaLista.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("--Audio--");
                                System.out.println("Escribe la duración");
                                int duracion = entradaLista.nextInt();
                                System.out.println("Escribe el soporte");
                                String soporte = entradaLista.next();
                                Audio audio = new Audio(duracion, soporte);
                                entrada.añadir(audio);
                                break;
                            case 2:
                                System.out.println("--Libro--");
                                System.out.println("Escribe el ISBN");
                                int ISBN = entradaLista.nextInt();
                                System.out.println("Escribe el numero de paginas");
                                int numeroPaginas = entradaLista.nextInt();
                                Libro libro = new Libro(ISBN, numeroPaginas);
                                entrada.añadir(libro);
                                break;
                            case 3:
                                System.out.println("--Video--");
                                System.out.println("Escribe el nombre del director");
                                String director = entradaLista.next();
                                System.out.println("Escribe el nombre del actor");
                                String actor = entradaLista.next();
                                Video video = new Video(director, actor);
                                entrada.añadir(video);
                                break;

                        }
                    } while (opcion == 3);
                    break;
                case 2:
                    System.out.println("--Eliminar colección");
                    System.out.println("Escribe el identificador");
                    int id = entradaLista.nextInt();
                    entrada.eliminar(id);
                    break;
                case 3:
                    System.out.println("--Listar colección");
                        do {
                            System.out.println("1.Audio\n2.Libro\n3.Video\n4.Todos");
                            System.out.println("Que opcion quieres");
                            opcion = entradaLista.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("--Audio--");

                            }
                        } while (opcion != 4);


                    }
        }while(opcion!=4);
    }
}
