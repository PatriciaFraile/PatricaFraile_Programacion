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
                                System.out.println("Escribe el identificador");
                                String id = entradaLista.next();
                                System.out.println("Escribe el nombre");
                                String titulo = entradaLista.next();
                                System.out.println("Escribe la duración");
                                int duracion = entradaLista.nextInt();
                                System.out.println("Escribe el soporte");
                                String soporte = entradaLista.next();
                                System.out.println("Escribe el autor ");
                                String autor = entradaLista.next();
                                System.out.println("Escribe el tamaño ");
                                String tamanio = entradaLista.next();
                                System.out.println("Escribe el formato");
                                String formato = entradaLista.next();
                                Audio audio = new Audio(id, titulo, tamanio, formato, autor, duracion, soporte);
                                entrada.añadir(audio);
                                break;
                            case 2:
                                System.out.println("--Libro--");
                                System.out.println("Escribe el identificador");
                                id = entradaLista.next();
                                System.out.println("Escribe el nombre del libro");
                                titulo = entradaLista.next();
                                System.out.println("Escribe el ISBN");
                                int ISBN = entradaLista.nextInt();
                                System.out.println("Escribe el numero de paginas");
                                int numeroPaginas = entradaLista.nextInt();
                                System.out.println("Escribe el autor del libro");
                                autor = entradaLista.next();
                                System.out.println("Escribe el tamaño del libro");
                                tamanio = entradaLista.next();
                                System.out.println("Escribe el formato del libro");
                                formato = entradaLista.next();
                                Libro libro = new Libro(id, titulo, autor, tamanio, formato, ISBN, numeroPaginas);
                                entrada.añadir(libro);
                                break;
                            case 3:
                                System.out.println("--Video--");
                                System.out.println("Escribe el identificador");
                                id = entradaLista.next();
                                System.out.println("Escribe el nombre");
                                titulo = entradaLista.next();
                                System.out.println("Escribe el nombre del director");
                                String director = entradaLista.next();
                                System.out.println("Escribe el nombre del actor");
                                String actor = entradaLista.next();
                                System.out.println("Escribe el autor ");
                                autor = entradaLista.next();
                                System.out.println("Escribe el tamaño ");
                                tamanio = entradaLista.next();
                                System.out.println("Escribe el formato");
                                formato = entradaLista.next();
                                Video video = new Video(id, titulo, director, actor, autor, tamanio, formato);
                                entrada.añadir(video);
                                break;

                        }
                    } while (opcion == 4);
                    break;
                case 2:
                    System.out.println("--Eliminar colección");
                    System.out.println("Escribe el identificador");
                    String id = entradaLista.next();
                    entrada.eliminar(id);
                    break;
                case 3:
                    System.out.println("--Listar colección");
                    do {
                        System.out.println("1.Audio\n2.Libro\n3.Video");
                        System.out.println("Que opcion quieres");
                        opcion = entradaLista.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("--Audio--");
                                break;
                            case 2:
                                System.out.println("--Libro--");
                                entrada.listar();
                                break;
                        }

                    } while (opcion != 3);
            }
        } while (opcion != 4);
    }

}
