import controller.FicherosController;

import java.io.File;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        File file1 = null;
        File directory1 = null;
        File file2 = null;
        File file3 = null;
        File file4 = null;
        File file5 = null;
        File file6 = null;
        File file7 = null;
        File directory2= null;
        File directory3 = null;
        File directory4 = null;
        directory1 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero");
        directory2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero1");
        file1 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero1\\fichero1_1.txt");
        file2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero1\\file1_2.txt");
        directory3 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero2");
        file3 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero2\\file2_1.txt");
        file4 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero2\\file2_2.txt");
        directory4 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero3");
        file5 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero3\\file3_1.txt");
        file6 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\Fichero3\\file3_2.txt");
        file7 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Fichero\\fichero.txt");

        FicherosController ficherosController = new FicherosController();
        int opcion;
        do {
            System.out.println("Directorios");
            ficherosController.getDirectoryInfo(directory1);
            System.out.println("Cual quieres listar");
            opcion = entradaTeclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("--Fichero1--");
                    ficherosController.getDirectoryF1(directory2);

                    break;
                case 2:
                    System.out.println("--Fichero2--");
                    ficherosController.getDirectoryF1(directory3);
                    break;
                case 3:
                    System.out.println("--Fichero3--");
                    ficherosController.getDirectoryF1(directory4);
                    break;
                case 4:
                    System.out.println("No se puede listar, no es un directorio");
            }

        }while(opcion!=4);

    }
}
