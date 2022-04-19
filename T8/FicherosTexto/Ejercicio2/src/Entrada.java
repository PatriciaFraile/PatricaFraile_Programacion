import controller.FicheroController;

import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) throws IOException {
        File file = null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\2\\fichero.txt");
        FicheroController ficheroController = new FicheroController();
        ficheroController.escribirFicheroCompleto(file);
    }
}
