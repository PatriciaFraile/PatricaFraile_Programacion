package ejercicio_objetos.ejercicio3;

public class Profesor {

    public void ponerNotas(Alumno alumno) {

        alumno.getAsignatura1().setCalificación((int) Math.random() * 11);
        alumno.getAsignatura2().setCalificación((int) Math.random() * 11);
        alumno.getAsignatura3().setCalificación((int) Math.random() * 11);
    }

    public double calcularMedia(Alumno alumno) {
        double media = (alumno.getAsignatura1().getCalificación() + alumno.getAsignatura3().getCalificación() + alumno.getAsignatura3().getCalificación()) / 3;
        return media;
    }
}
