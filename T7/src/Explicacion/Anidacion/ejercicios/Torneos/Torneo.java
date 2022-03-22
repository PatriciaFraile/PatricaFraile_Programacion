package Explicacion.Anidacion.ejercicios.Torneos;

import java.util.ArrayList;

public class Torneo {
    private ArrayList<Partido> partido;
    String nombre;
    private Equipo equipo;

    public Torneo(String nombre) {
        this.nombre = nombre;
        partido = new ArrayList<>();
    }

    public void realizarSorteo(ArrayList<Partido> lista){
        for (int i = 0; i < lista.size(); i++) {
            Partido equipo1 = lista.get(i);
            for (int j = i+1; j < lista.size(); j++) {
                Partido equipo2 = lista.get(j);
                new Partido(equipo1,equipo2);
                lista.add(new Partido(equipo1,equipo2));
            }
        }
        for (int i = lista.size()-1; i >= 0 ; i--) {
            Partido equipo1= lista.get(i);
            for (int j = i-1; j >= 0; j++) {
                Partido equipo2 = lista.get(j);
                new Partido(equipo1,equipo2);
                lista.add(new Partido(equipo1,equipo2));
            }
        }

    }
    public void jugarPartido(Partido partido) {

    }
    public void mostrarPartidos(){
        for (Partido partidos: partido) {

        }
    }
    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    class Partido {
        private Equipo equipoLocal, equipoVisitante;
        private boolean jugado;
        private int numeroGoles;
        private ArrayList<Equipo>equipos;

        public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
        }

        public Equipo getEquipoLocal() {
            return equipoLocal;
        }

        public void setEquipoLocal(Equipo equipoLocal) {
            this.equipoLocal = equipoLocal;
        }

        public Equipo getEquipoVisitante() {
            return equipoVisitante;
        }

        public void setEquipoVisitante(Equipo equipoVisitante) {
            this.equipoVisitante = equipoVisitante;
        }

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }

        public int getNumeroGoles() {
            return numeroGoles;
        }

        public void setNumeroGoles(int numeroGoles) {
            this.numeroGoles = numeroGoles;
        }

        public ArrayList<Equipo> getEquipos() {
            return equipos;
        }

        public void setEquipos(ArrayList<Equipo> equipos) {
            this.equipos = equipos;
        }
    }

    static class Equipo {
        private int nivelAtaque , nivelDefensa;
        private String nombre;
        public Equipo(String nombre , int nivelAtaque, int nivelDefensa){
            this.nombre = nombre;
            this.nivelAtaque = nivelAtaque;
            this.nivelDefensa = nivelDefensa;
        }

        public int getNivelAtaque() {
            return nivelAtaque;
        }

        public void setNivelAtaque(int nivelAtaque) {
            this.nivelAtaque = nivelAtaque;
        }

        public int getNivelDefensa() {
            return nivelDefensa;
        }

        public void setNivelDefensa(int nivelDefensa) {
            this.nivelDefensa = nivelDefensa;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
