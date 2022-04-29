import controller.JSONController;

import java.io.FileNotFoundException;

public class Entrada {
    public static void main(String[] args) throws FileNotFoundException {
        JSONController controller = new JSONController();
       // controller.leerFicheros();
        controller.leerJSONAsignaturas();
    }
}
