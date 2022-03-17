package Explicacion.Anidacion.ejercicios.Partidos;
//incompleto
public class Partido {
    private boolean jugado;
    private int golesLocal, golesVisitante;
    private Equipo equipoLocal;
    private Equipo equipo;

    public Partido(boolean jugado, int golesLocal, int golesVisitante) {
        this.jugado = jugado;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public void agregarLocal() {
        this.golesLocal = (int) Math.random() * 3;
    }

    public void agregarGolesVisitante() {
        this.golesVisitante = (int) Math.random() * 3;

    }

    public void mostrarResultado() {
        System.out.println(equipo + " : " + golesVisitante + " -" + equipoLocal + ": " + golesLocal);
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

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    class Equipo {
        int puntos;
        String nombre;

        public Equipo(String nombre, String posicion) {
            this.nombre = nombre;
            if (posicion.toLowerCase().equals("local")){
                setEquipoLocal(this);
            } else if(posicion.toLowerCase().equals("visitante")){
                setEquipo(this);
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
