package base;

public class Ejercicio4 {
    //Tres arrays de 20 números enteros cada una , con nombres , su cuadrado y su cubo.
    //Carga el array con numeros aleatorios entre 0 - 100

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] cuadrado= new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =(int)(Math.random()*100)+1;
        }
        for (int i = 0 ; i<numeros.length; i++){
            cuadrado[i]= (int)Math.pow(numeros[i],2);
        }
        for(int i = 0 ; i<numeros.length ; i++){
            cubo[i] = (int)Math.pow(numeros[i],3);
        }
        for(int i = 0 ; i < numeros.length ; i++){
                    System.out.printf("%d\t   %d\t   %d%n" , numeros[i], cuadrado[i] , cubo[i]);
        }




    }
}


