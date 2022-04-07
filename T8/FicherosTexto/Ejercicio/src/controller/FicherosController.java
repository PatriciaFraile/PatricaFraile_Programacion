package controller;
import java.io.*;
import java.util.Scanner;

public class FicherosController {
    Scanner scanner = new Scanner(System.in);

    public void listParentDirectory(){
        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero");
        File[] ficherosParent = file.listFiles();
        System.out.println("Imprimiendo "+file.getName());
        int contador=0;
        int opcion=0;
        for ( File item: ficherosParent ) {
            System.out.println(contador + " - "+item.getName());
            contador++;
            //}
        }
        System.out.println("Que directorio quieres listar");
        opcion = scanner.nextInt();
        if (opcion>=0 && opcion<ficherosParent.length){
            if (ficherosParent[opcion].isDirectory()){
                listarChild(ficherosParent[opcion]);
            } else {
                System.out.println("Error. es un fichero");
            }
        } else {
            System.out.println("Opción incorrecta");
        }
    }

    public void listarChild(File child){
        int contador=0;
        int opcion=0;
        File[] ficherosChild = child.listFiles();
        for ( File childItem : ficherosChild ) {
            System.out.println(contador +" - " + childItem.getName());
            contador++;
        }
        System.out.println("Que opcion quieres");
        opcion = scanner.nextInt();
        if (opcion>=0 && opcion<ficherosChild.length){
            if (ficherosChild[opcion].isDirectory()){
                listarChild(ficherosChild[opcion]);
            } else {
                System.out.println("Error. es un fichero");
            }
        } else {
            System.out.println("Opción incorrecta");
        }
    }
    public void lecturaFichero(File file){
        FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                int lectura=0;
                while((lectura=fileReader.read())!=-1){
                    System.out.println((char)lectura);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                } catch (IOException | NullPointerException e) {
                    e.printStackTrace();
                }
            }
    }

}
