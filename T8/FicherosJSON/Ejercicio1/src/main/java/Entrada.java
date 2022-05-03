import controller.JSONController;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        JSONController controller = new JSONController();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Genero");
        String genero = entrada.nextLine();
        controller.lecturaUsuarios();



    }
}
