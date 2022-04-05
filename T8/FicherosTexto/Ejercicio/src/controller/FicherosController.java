package controller;

import java.io.File;

public class FicherosController {
    public void getDirectoryInfo(File directory){
        //listar ficheros
        int posicion = 1;
        File[] nombreFicheros = directory.listFiles();
        for (File nombre: nombreFicheros) {
            System.out.println(posicion+" -"+nombre.getName());
            posicion++;
        }
    }
    public void getDirectoryF1(File directory){
        File[] nombreFicheros = directory.listFiles();
        int posicion = 1;
        for (File item: nombreFicheros) {
            System.out.println(posicion+"."+item.getName());
            posicion++;
        }
    }
}
