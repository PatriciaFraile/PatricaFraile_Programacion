package ArrayList;
public class EjercicioPalindromo {
    public static void main(String[] args) {
        String fraseCompleta = "Allí ve Sevilla";
        boolean palindromo = false;
        fraseCompleta = fraseCompleta.replaceAll(" ", "").replaceAll("í", "i").toLowerCase();
        for (int i = 0; i < (fraseCompleta.length() / 2); i++) {
            if (fraseCompleta.charAt(i) == fraseCompleta.charAt(fraseCompleta.length() - 1 - i)) {
                palindromo = true;
            } else {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

    }
}


