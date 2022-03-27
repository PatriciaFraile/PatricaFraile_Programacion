package Explicacion.Anidacion.ejercicios.Partidos;

public class Entrada {
    public static void main(String[] args) {
        Partido partido = new Partido();
        Partido.Equipo madrid = partido.new Equipo("Madrid","Local");
        Partido.Equipo barcelona = partido.new Equipo("Barcelona","Visitante");

        partido.mostrarEquipos();
        partido.mostrarResultado();
        for (int i = 0; i <3 ; i++) {
            partido.jugarPartido();
            partido.mostrarResultado();
            partido.calcularPuntos();
        }
        madrid.mostrarInformacion();
        barcelona.mostrarInformacion();

    }
}
