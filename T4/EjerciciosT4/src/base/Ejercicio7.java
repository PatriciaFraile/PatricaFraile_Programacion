package base;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        String[] palabras = new String[10];
        int sumaLetras = 0;
        int opciones ;
      do{
          for (int i = 0; i < palabras.length; i++) {
              System.out.println("Introduce una palabra");
              String palabra = entradaTeclado.nextLine();
              palabras[i] = palabra;
          }
          System.out.println("1.Ver todas las palabras: mostrarla todas las palabras del array");
          System.out.println("2.Obtener una palabra al azar: mostrará una palabra de las que existen en el array");
          System.out.println("3.Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras");
          System.out.println("4. Ver media de letras: mostrará el número medio de letras entre todas las palabas");
          System.out.println("5.Ver palabra con más letras");
          System.out.println("6.Ver palabra con menos letras");
          System.out.println("Elige una de las opciones");
          opciones = entradaTeclado.nextInt();
          switch (opciones){
              case 1 :
                  System.out.println("Has elegido :Ver todas las palabras ");
                  for (String item :palabras) {
                      System.out.println(item);
                  }
                  break;
              case 2 :
                  int nombresAleatorios= 0;
                  System.out.println("Has obtenido una palabra al lazar");
                      int aleatorio = (int) (Math.random() * 10);
                      System.out.println("La palabra aleatoria es: " + palabras[aleatorio]);

                  break;
              case 3 :
                  System.out.println("Has elegido el total de letras");
                  for (String item:palabras) {
                      item.length();
                      sumaLetras+=item.length();
                  }
                  System.out.println("La suma total de letras es :"+ sumaLetras);
                  break;
              case 4 :
                  System.out.println("Has elegido la media de las letras");
                  if(sumaLetras==0){
                      System.out.println("El numero de letras es 0 , posiblemente no lo has contado");
                  }else
                  System.out.println("El numero medio de letras" + sumaLetras/ palabras.length);
                  break;
              case 5 | 6:
                  String pequenia=palabras[0];
                  String grande =palabras[0];
                  for (String item:palabras) {
                      if(item.length()>grande.length()){
                          grande = item;
                      }
                      if (item.length()<pequenia.length()){
                          pequenia = item;
                      }
                  }
          }
      }while (opciones!=0);
      entradaTeclado.close();
    }
}
