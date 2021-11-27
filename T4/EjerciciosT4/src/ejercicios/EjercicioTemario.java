package ejercicios;

public class EjercicioTemario {

    public static void main(String[] args) {
        String [] temario  = new String [10];
        System.out.println("Numero de temas : 10");
        temario[0] = "Tema 1: Introducción\n";
        temario[1] = "Tema 2: Estructuras de datos\n";
        temario[2] = "Tema 3: Estructuras\n";
        temario[3] = "Tema 4: Colecciones\n";
        temario[4] = "Tema 5: Orientación a objetos\n";
        temario[5] = "Tema 6: Clases y Objetos\n";
        temario[6] = "Tema 7; Abstracción, Herencia y Polimorfismo\n";
        temario[7] = "Tema 8: Ficheros y Excepciones\n";
        temario[8] = "Tema 9: Bases de datos\n";
        temario[9] = "Tema 10: Interfaces\n";
        for (int i = 0; i < temario.length; i++) {
            System.out.print(temario[i]);
        }
    }
}
