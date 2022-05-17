import controller.GestionBD;
import model.Perfil;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestionBD gestionBD = new GestionBD();
        gestionBD.insertarPerfiles();



    }
}
