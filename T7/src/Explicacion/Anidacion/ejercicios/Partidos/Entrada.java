package Explicacion.Anidacion.ejercicios.Partidos;

public class Entrada {
    public static void main(String[] args) {
        Partido partido = new Partido();
        for (int i = 0; i < 3; i++) {
            partido.agregarLocal();
            partido.agregarGolesVisitante();
        }
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 3; x++) {
                partido.agregarLocal();
                partido.agregarGolesVisitante();
            }
            System.out.println("El resultado en la "+i+1 +"parte es%n");
            partido.mostrarResultado();
        }

    }
}
