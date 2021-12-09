import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
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
        //Imprimir el contenido que esta en la posicion concreta
        String palabra = String.valueOf(listaCosas.get(1)); // Imprimir palabras
        System.out.println("El valor es : " + palabra);
        int num = (int) listaCosas.get(0); //Imprimir numeros
        System.out.println("El valor es :" + num);
        //Contenido del ArrayList
        listaCosas.add(true);
        listaCosas.add(12);
        listaCosas.add("Paula");
        listaCosas.add("Patricia");
        listaCosas.add("Paula");
        listaCosas.add(2.23);
        listaCosas.add(12);
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
        System.out.println("Otra forma de buscar");
        posiciones = 1;
        int posicionElemento = listaCosas.indexOf("Borja");
        if(posicionElemento>-1){
            System.out.println("Palabra encontrada");
            System.out.println("En la posicion " + posicionElemento);
        }
        System.out.println("Que palabra quieres buscar");
        Object buscar = entradaTeclado.next();
        posiciones= 0;
        //El metodo contains puede fallar
        if(listaCosas.contains(buscar)){
            System.out.println("Palabra encontrada");
        }
        else{
            listaCosas.add(buscar);
            for (Object item:listaCosas) {
                System.out.println(posiciones + "-" + item);
                posiciones++;
            }
        }
        //Borrar numeros repetidos
        System.out.println(listaCosas);
        for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i).equals(12)){
                listaCosas.remove(i);
            }
        }
        System.out.println(listaCosas);
        //Borrar cosas del Arraylist
        /*System.out.println("El tamaño actual es de :" +listaCosas.size());
        listaCosas.remove(0);//Borrar
        System.out.println(listaCosas);*/
        entradaTeclado.close();

    }
}
