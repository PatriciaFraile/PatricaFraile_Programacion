package base;

public class Ejercicio5 {
    //Realiza un programa que pida 8 números enteros,
    //  los guarde en un array y que luego muestre esos números junto con la palabra “par” o “impar”
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int numeroPares = 0;
        int numerosImpares = 0 ;
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int)(Math.random()*50)+1;
            System.out.println("El número Aleatorio es:" +numeros[i]);
            if((numeros[i]%2)==0){
                numeroPares++;
            } else {
                numerosImpares++;
            }

        }
        System.out.println("La cantidad de números Pares son :"+ numeroPares);
        System.out.println("La cantidad de números Impares son "+ numerosImpares);

    }
}
