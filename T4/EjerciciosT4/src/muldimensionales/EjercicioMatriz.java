package muldimensionales;

public class EjercicioMatriz {

    public static void main(String[] args) {

        int[][] alumnoIdioma = new int[3][4];

        alumnoIdioma[0][0] = 22 ;
        alumnoIdioma[0][1] = 55 ;
        alumnoIdioma[0][2] = 12 ;
        alumnoIdioma[0][3] = 78 ;

        alumnoIdioma[1][0] = 45 ;
        alumnoIdioma[1][1] = 12 ;
        alumnoIdioma[1][2] = 45 ;
        alumnoIdioma[1][3] = 9 ;

        alumnoIdioma[2][0] = 45 ;
        alumnoIdioma[2][1] = 456 ;
        alumnoIdioma[2][2] = 45;
        alumnoIdioma[2][3] = 54 ;


        for (int i = 0; i < alumnoIdioma.length; i++) {
            for (int j = 0; j < alumnoIdioma[i].length; j++) {
                System.out.print(alumnoIdioma[i][j] + " ");
            }
            System.out.println();
        }


    }
}
