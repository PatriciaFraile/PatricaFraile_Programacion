package Explicacion.Anidacion.ejercicios.Torneos;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Torneo champion = new Torneo("Champion");
        Torneo.Equipo Barcelona = new Torneo.Equipo("Barcelona",100,60);
        Torneo.Equipo Madrid = new Torneo.Equipo("Madrid",88,90);
        ArrayList<Torneo.Equipo>lista = new ArrayList<>();
        lista.add(Barcelona);
        lista.add(Madrid);

    }
}
