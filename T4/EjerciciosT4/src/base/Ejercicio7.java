package base;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        String []nombresAleatorios = new String [10];
        String[] palabras = new String[10];
        int opciones ;
        int contadorLetras = 0;
      do{
          for (int i = 0; i < palabras.length; i++) {
              System.out.println("Introduce diez palabras");
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
                  for (int i = 0; i <=10; i++) {
                      System.out.println(palabras[i]);
                  }

                  break;
              case 2 :
                  System.out.println("Has obtenido una palabra al lazar");
                  for (int i = 0; i <=10; i++) {
                      nombresAleatorios[i]=palabras[(int)(Math.floor(Math.random()*((palabras.length-9)+10)+0))];
                      System.out.println(nombresAleatorios[i]);
                  }
                  break;
              case 3 :
                  System.out.println("Has elegido ver el numero de letras");

                  char [] caracteres = texto . toCharArray ();

                  for (int i = 0; i < caracteres.length; i++) {
                      if(Character.isLetter(caracteres[i])){
                          ++contadorLetras;
                      }
                      
                  }

                  break;
              case 4 :
                  break;
              case 5 :
                  break;
              case 6:
                  break;
          }
      }while (opciones<=6);



    }
}
