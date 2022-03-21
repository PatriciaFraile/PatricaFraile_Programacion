package Explicacion.Anidacion.ejercicios.Partidos;

public class Partido {
    private boolean jugado;
    private int golesLocal, golesVisitante;
    private Equipo equipoLocal;
    private Equipo equipo;


    public void agregarLocal() {
        golesLocal  += (int) Math.random() * 3;
    }

    public void agregarGolesVisitante() {
        golesVisitante += (int) Math.random() * 3;

    }

    public void mostrarResultado() {
        System.out.printf("%s:%d - %s:%d", equipoLocal.getNombre() , getGolesLocal() , equipo.getNombre(), getGolesVisitante());
    }
    public void repartirPuntos(){
        if(golesVisitante == golesLocal){
            this.equipo.setPuntos(equipo.getPuntos()+1);
            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+1);

        } else if(golesVisitante>golesLocal){
            this.equipo.setPuntos(equipo.getPuntos()+1);
            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+1);
        }
    }
    public void escribirClasificacion(){
        if(equipoLocal.getPuntos()>equipo.getPuntos()){
            System.out.println("1- Atleti"+ equipoLocal.getPuntos());
            System.out.println("2- Sevilla" + equipo.getPuntos());
        }else {
            System.out.println("1- Sevilla" + equipo.getPuntos());
            System.out.println("2- Atleti"+ equipoLocal.getPuntos());

        }
    }
    public void reiniciarPartido(){
        
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
        private int puntos;
        private String nombre;

        public Equipo(String nombre, String posicion) {
            this.nombre = nombre;
            if (nombre.equalsIgnoreCase("Atleti")){
                setEquipoLocal(this);
            } else if(nombre.equalsIgnoreCase("Sevilla")){
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
