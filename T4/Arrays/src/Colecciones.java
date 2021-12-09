import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {
    public static void main(String[] args) {
        //lista de cualquier tipo>OBJECT
        ArrayList listaCosas = new ArrayList();
        //Para poder saber su tamaño
        int tamanio = listaCosas.size();//--->0
        System.out.println(tamanio);
        //Meter cosas en la lista
        listaCosas.add(5);
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        listaCosas.add("Borja");
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        //Imprimir el ArrayList entero
        System.out.println(listaCosas);
        //Borrar cosas del Arraylist
        //Imprimir el contenido que esta en la posicion concreta
        String palabra = String.valueOf(listaCosas.get(1)); // Imprimir palabras
        System.out.println("El valor es : " + palabra);
        int num = (int) listaCosas.get(0); //Imprimir numeros
        System.out.println("El valor es :" + num);
        //Contenido del ArrayList
        listaCosas.add(true);
        listaCosas.add("Paula");
        listaCosas.add("Angela");
        listaCosas.add(12);
        //Imprimir el ArrayList en forma de lista
        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println((i + 1) + "-" + listaCosas.get(i));
        }
        int posiciones =1;
        //Imprimir el ArrayList con el foreach
        for (Object item:listaCosas) {
            System.out.println(posiciones + "-" + item);
            posiciones++;
        }
        //Buscar dentro de una lista la palabra "Borja" , cuando se encuentre sacar el mensaje de la palabra y la posicion
        /*for (int i = 0; i < listaCosas.size(); i++) {
            if(listaCosas.contains("Borja")){
                System.out.println("Palabra encontrada en la posicion");
            }
            else{
                System.out.println("Palabra no encontrada");
            }
        }*/
        posiciones= 0;
        for (Object item:listaCosas) {
            if (item.equals("Borja")){
                System.out.println("Palabra encontrada");
                System.out.println("En la posicion " + posiciones);
            }
            posiciones++;
        }

    }
}
