package Explicacion.Excepciones;

import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        String palabra = null;
        String[] palabras = new String[]{"uno","dos","tres","cuatro"};
        try{
            System.out.println(palabra.length());
            System.out.println(palabras[1]);
        }catch(NullPointerException e){
            System.out.println("Palabra nula");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error de acceso en el array");
        }
        finally {
            System.out.println("Ejecución obligatoria");
        }
        System.out.println("Bloque final");
        Coche coche = new Coche();
        //Se puede tanto aqui como en Coche.java , si lo pones en
        // Coche.java NO lo puedes ponerlo en Entrada.java
        try {
            coche.metodoUno();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Fichero no encontrado");
        }

    }
}
