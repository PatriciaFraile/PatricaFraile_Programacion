package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FicherosController {

    public void getFileInfo(File file) {

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println("Padre" + file.getParent());
        System.out.println("Nombre" + file.getName());
        System.out.println("Ruta absoluta " + file.getAbsolutePath());
        System.out.println("Ruta Relativa " + file.getPath());


        //crear un nuevo fichero
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getDirectoryInfo(File file) {
        if (file.isDirectory()) {
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

    public void lecturaFichero(File file){
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
           int lectura = fileReader.read();
            System.out.println(lectura);
            while((lectura=fileReader.read())!=-1){
                System.out.println((char)lectura);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }

    }
    public void lecturaBuffer(File file)  {

        BufferedReader bufferedReader = null;
        try {
           bufferedReader = new BufferedReader(new FileReader(file));
           /* String linea = bufferedReader.readLine();
            System.out.println(linea);*/
            //leer todo el fichero entero
            String lectura = null;
            String lecturaCompleta = "";
            while((lectura = bufferedReader.readLine())!=null){
                System.out.println(lectura);
                lecturaCompleta+=lectura;
                lecturaCompleta+="\n";
            }
            System.out.println("La lectura completa es");
            System.out.println(lectura);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void escrituraFichero(File file){
        FileWriter fileWriter = null;
        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dentro del fichero";
        try{
            fileWriter = new FileWriter(file, true);
            /*fileWriter.write("Ejemplo");
            fileWriter.write("\n");
            fileWriter.write("esto es un nuevo fichero");
            fileWriter.write(101)*/
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public void cifrar(){
        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dentro del fichero";
        List<Integer> listar = lineaEscribir.chars().boxed().collect(Collectors.toList());
        for (int item: listar) {
            System.out.println(item);
        }



    }
}
