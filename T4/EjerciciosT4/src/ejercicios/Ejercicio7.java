package ejercicios;
 //Crea un array de números de 100 posiciones,
 //que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media

public class Ejercicio7 {

     public static void main(String[] args) {

         int [] numero = new int [100];
         int suma = 0;
         double media = 0.0;
         for (int i = 0; i < numero.length; i++) {
             numero[i]= (int)(Math.random()*101);
             suma += numero [i];
             media = (double) suma/ numero.length;

         }
         System.out.println("La media es " + media );

         System.out.println("La suma es : " + suma);


     }
}
