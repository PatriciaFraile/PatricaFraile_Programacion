package Ejercicios.Partido;

public class Partidos {
    private Equipo local, visitante;
    private boolean jugado;
    private int golesLocal, golesVisitante;

    public void agregarGolesLocal() {
        golesLocal += (int) Math.random() * 3;
    }

    public void agregarGolesVisitantes() {
        golesVisitante += (int) Math.random() * 3;
    }
    public void mostrarInformacion(){
        System.out.println(local + "VS" + visitante);
    }

    public void mostrarResultados() {
        System.out.printf("%d:%s - %d:%s", local.getNombre(), getGolesLocal(), visitante.getNombre(), getVisitante());
    }
    public void reiniciarPartido(){
        golesLocal = 0;
        golesVisitante = 0;
    }
    public void repartirPuntos(){
        if(golesLocal>golesVisitante){
            local.setPuntos(local.getPuntos()+3);
        }else if(golesLocal==golesVisitante){
            local.setPuntos(local.getPuntos()+1);
            visitante.setPuntos(visitante.getPuntos()+1);
        } else if (golesVisitante>golesLocal){
            visitante.setPuntos(visitante.getPuntos()+3);
        }
    }
    public void jugarPartido(){
        golesLocal = 0 ;
        golesVisitante = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(local.atacar()>visitante.defender()){
                    golesLocal++;
                }
                else{
                    golesVisitante++;
                }
            }

        }
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
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
        String nombre;
        int puntos;

        public Equipo(String nombre, String posicion) {
            this.nombre = nombre;
            if (posicion.toLowerCase().equals("local")) {
                setLocal(this);
            }
             else if (posicion.toLowerCase().equals("visitante")) {
                setVisitante(this);
            }
        }
        public int atacar(){
            return (int)Math.random()*100;
        }
        public int defender(){
            return (int)Math.random()*100;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }
    }
}
