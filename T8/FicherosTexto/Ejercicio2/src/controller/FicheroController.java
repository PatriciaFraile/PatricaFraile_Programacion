package controller;

import java.io.*;
import java.util.Scanner;

public class FicheroController {
    Scanner entradsTeclado = new Scanner(System.in);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void escribirFicheroCompleto(File file) throws IOException {
        int opcion = 0;
        String linea = "";
        do {
            try {
                linea = bufferedReader.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("Quieres crear más lineas 0(no)/1(si)");
            opcion = entradsTeclado.nextInt();

        }while (opcion!=0);
       /* FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            String escribir = entradsTeclado.next();
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(escribir);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

                /*if (bufferedWriter != null) {
                    //fileWriter.close();
                    bufferedWriter.close();
                }
            if (fileWriter != null) {
                //fileWriter.close();
                fileWriter.close();
            }*/


        }

    }



