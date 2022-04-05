import controller.FicherosController;

import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args){
        File file = null;
        File directory = null;
        file  = new File("C:\\Users\\Usuario DAM1\\Desktop\\ficheros\\fichero1.txt");
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\ficheros");

        //llamar al otro archivo
        FicherosController ficherosController = new FicherosController();
        ficherosController.getFileInfo(file);
        //Nombre de los ficheros
        //ficherosController.getDirectoryInfo(directory);
        //listar ficheros
        ficherosController.getDirectoryInfo(file);
    }
}
