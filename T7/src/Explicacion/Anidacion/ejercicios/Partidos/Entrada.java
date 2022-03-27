package Explicacion.Anidacion.ejercicios.Partidos;

public class Entrada {
    public static void main(String[] args) {
        Partido partido = new Partido();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                partido.agregarGolesLocales();
                partido.agregarGolesVisitantes();
            }
            System.out.println("El resultado en la " +i+1 + "parte es:");
            partido.mostrarResultado();

        }

    }
}
