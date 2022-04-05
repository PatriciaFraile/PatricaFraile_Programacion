package controller;

import java.io.File;
import java.io.IOException;

public class FicherosController {
    public void getFileInfo(File file){

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println("Padre"+file.getParent());
        System.out.println("Nombre"+file.getName());
        System.out.println("Ruta absoluta "+file.getAbsolutePath());
        System.out.println("Ruta Relativa "+file.getPath());


        //crear un nuevo fichero
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getDirectoryInfo(File file){
        if(file.isDirectory()){
            String[] nombreFicheros = file.list();
            //System.out.println(nombreFicheros);
            //Nombre de los ficheros
           /* for (String fichero :nombreFicheros) {
                System.out.println(fichero.getName());
            }*/
            //listar ficheros
           /* File[] ficheros = file.listFiles();
            for (File nombre : ficheros) {
                System.out.println(ficheros);
            }*/
        }
    }
}
