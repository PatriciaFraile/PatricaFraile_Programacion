package Explicacion.Anidacion.ejercicios.Partidos;

public class Partido {
    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    private int golesLocal, golesVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Partido() {

    }

    public void agregarGolesLocales() {
        golesLocal += (int) Math.random() * 3;
    }

    public void agregarGolesVisitantes() {
        golesVisitante += (int) Math.random() * 3;
    }

    public void mostrarResultado() {
        System.out.printf("%s:%d - %s:%d", equipoLocal.getNombre(), getGolesLocal(), equipoVisitante.getNombre(), getGolesVisitante());
    }

    public void repartirGoles() {
        if (golesLocal == golesVisitante) {
            this.equipoLocal.setPuntos(getGolesLocal() + 1);
            this.equipoVisitante.setPuntos(getGolesVisitante() + 1);

        } else if (golesLocal > golesVisitante) {
            this.equipoLocal.setPuntos(getGolesLocal() + 3);
        } else if (golesVisitante > golesVisitante) {
            this.equipoVisitante.setPuntos(getGolesVisitante() + 3);
        }
    }

    public void reiniciarPartido() {
        golesLocal = 0;
        golesVisitante = 0;
    }

    public void clasificacion() {
        if (equipoLocal.getPuntos() > equipoVisitante.getPuntos()) {
            System.out.println("1. " + equipoLocal.getNombre());
            System.out.println("2. " + equipoVisitante.getNombre());
        } else {
            System.out.println("1. " + equipoVisitante.getNombre());
            System.out.println("2. " + equipoLocal.getNombre());
        }
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

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    class Equipo {
        private int puntos;
        private String nombre;

        public Equipo(String nombre, String posicion) {
            this.nombre = nombre;
            if(nombre.equalsIgnoreCase("Madrid")){
                setEquipoLocal(this);
            }else if(nombre.equalsIgnoreCase("Barcelona")){
                setEquipoVisitante(this);
            }
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
