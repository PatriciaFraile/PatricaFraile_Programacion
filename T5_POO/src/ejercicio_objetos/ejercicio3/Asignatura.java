package ejercicio_objetos.ejercicio3;

public class Asignatura {
    private int identificador;
    private double calificación;

    public Asignatura(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCalificación() {
        return calificación;
    }

    public void setCalificación(double calificación) {
        this.calificación = calificación;
    }
}
