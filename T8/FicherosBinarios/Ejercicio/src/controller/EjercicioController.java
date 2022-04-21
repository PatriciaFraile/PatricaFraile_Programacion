package controller;

import java.io.*;
import java.util.Scanner;

public class EjercicioController {
    Scanner entradaTeclado = new Scanner(System.in);

    public void escribirFichero(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario DAM1\\Desktop\\2\\fichero.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario DAM1\\Desktop\\2\\fichero.txt"));
            System.out.println("Introduzca el nombre");
            String nombre = entradaTeclado.nextLine();
            System.out.println("Introduzca el apellido");
            String apellido = entradaTeclado.nextLine();
            System.out.println("Introduce la contraseña");
            String password = entradaTeclado.next();
            bw.write(nombre);
            bw.newLine();
            bw.write(apellido);
            bw.newLine();
            bw.write(password);
            //HACER UNA NUEVA LINEA
            bw.newLine();
            //GUARDAR LOS CAMBIOS
            bw.flush();
            //LEER EL FICHERO
            String linea = br.readLine();
            while(linea!=null){
                //IMPRIMIR EL FICHERO
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
