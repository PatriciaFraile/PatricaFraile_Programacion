package Ejercicios.Partido;

public class Entrada {
    public static void main(String[] args) {
        Partidos partidos = new Partidos();
        Partidos.Equipo Barcelona = partidos.new Equipo("Barcelona","local");
        Partidos.Equipo Madrid = partidos.new Equipo("Madrid","visitante");
        partidos.mostrarEquipos();
        partidos.mostrarResultado();
        for (int i = 0; i < 3; i++) {
            partidos.jugarPartido();
            partidos.mostrarResultado();
            partidos.calcularPuntos();
        }
        Barcelona. mostrarInformacion();
        Madrid.mostrarInformacion();
        partidos.reiniciarPartido();



    }



}
