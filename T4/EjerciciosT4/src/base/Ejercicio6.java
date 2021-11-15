package base;

public class Ejercicio6 {
    //Un array de 20 números aleatorios entre el 0 y el 30
    //Modificar todos los 6 por 8
    //Modificar todos los 7 por 15
    //Modificar todos los 20 por 10
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int sumaModificaciones=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 30) + 1;

        }
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] ==6){
                numeros[i] = 8;
                sumaModificaciones++;
            }else if (numeros[i] ==7){
                numeros[i]=15;
                sumaModificaciones++;
            }else if (numeros[i]==20){
                numeros[i]=10;
                sumaModificaciones++;
            }
        }
        System.out.println("El numero de modificaciones es :"+ sumaModificaciones);
    }
}
