package Strings;
import java.util.Arrays;
public class FrasesArray {
    //Sacar la palabra  larga
    //Sacar la palabra corta
    //Sacar la palabra de 4 caracteres
    public static void main(String[] args) {
        String fraseCompleta = "A veces es el viaje lo que te enseña sobr tu destino";
        String[] oracion = fraseCompleta.split(" ");
        String menor = "aaaaaaaaaaaaa";
        String mayor = " ";
        for (String item : oracion) {
            item.length();
            if (item.length() > mayor.length()) {
                mayor = item;
            } else if (item.length() < menor.length()) {
                menor = item;
            }
            if(item.length()==4){
                System.out.println("La palabra de 4 caracteres es :" + item);
            }
        }
        System.out.println("La palabra mayor es : " + mayor);
        System.out.println("La palabra menor es :" + menor);

    }
}
