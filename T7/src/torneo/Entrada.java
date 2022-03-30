package torneo;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Torneo champion = new Torneo("Champion");
        Torneo.Equipo equipo1 = new Torneo.Equipo("Barcelona",12,30);
        Torneo.Equipo equipo2 = new Torneo.Equipo("Madrid",30,12);
        Torneo.Equipo equipo3 = new Torneo.Equipo("Atletico de Madrid",11,23);
        Torneo.Equipo equipo4= new Torneo.Equipo("Sevilla",50,14);
        ArrayList<Torneo.Equipo> lista = new ArrayList<>();
        lista.add(equipo1);
        lista.add(equipo2);
        lista.add(equipo3);
        lista.add(equipo4);
        champion.realizarSorteo(lista);
        champion.iniciarTorneo();
        champion.imprimirClasificacion();


    }
}
