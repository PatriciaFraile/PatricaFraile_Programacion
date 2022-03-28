package Ejercicios.Partido;

public class Entrada {
    public static void main(String[] args) {
        Partidos partidos = new Partidos();
        Partidos.Equipo Barcelona = partidos.new Equipo("Barcelona","2");
        Partidos.Equipo Madrid = partidos.new Equipo("Madrid","1");
        partidos.mostrarInformacion();
        for (int i = 0; i < 3; i++) {
            partidos.jugarPartido();
            partidos.repartirPuntos();
            partidos.mostrarResultados();
        }
        partidos.reiniciarPartido();



    }



}
