public class Array {

    public static void main(String[] args) {
        // Como crear una Arrays
        int[] numeros = new int[10];
        int[] numerosDos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeroPares=0;
        int numerosImpares=0;

        boolean[] aciertos = new boolean[5];
        String[] palabras = new String[3]; //nulo

        double[] decimales = new double[]{2.34, .23, 34.5};


        //Cuantos elementos tiene (length)
        int longitudArray = numerosDos.length;
        System.out.println(longitudArray);
        //Sacar todos los valores
        for (int i = 0; i < numerosDos.length; i++) {
            System.out.println(numerosDos[i]);
        }
        //Modificar una posición concreta
        numerosDos[7] = 88;

        System.out.println("Modifico alguna posición ");

        for (int i = 0; i < numerosDos.length; i++) {
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
