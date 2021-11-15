package base;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[30];
        int suma = 0;
        int media = 0;
        int longitudArray = numeros.length;
        for (int i = 0; i <30; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
            System.out.println("El número Aleatorio es:" +numeros[i]);
            suma = suma+numeros[i];
             media = suma /30;
        }

        System.out.println("Numeros obtenidos es :" + suma);
        System.out.println("La media es :"+ media);
    }
}
