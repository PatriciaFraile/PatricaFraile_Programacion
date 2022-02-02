package ejercicio_objetos.equipos;

public class Equipo {
    public String nombre;
    public int nivelAtaque, nivelCentro, nivelDefensa;
    public int goles;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 101);
        this.nivelCentro = (int) (Math.random() * 101);
        this.nivelDefensa = (int) (Math.random() * 101);
        this.goles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelCentro;
        this.nivelAtaque = nivelAtaque;
    }

    public boolean atacar() {
        boolean meter = false;
        int aleatorio = (int) (Math.random() * 2);
        int resultado = (nivelAtaque * (aleatorio) + (nivelCentro * aleatorio / 2));
        if (resultado > 90) {
            meter = true;
        }
        return false;
    }


}
