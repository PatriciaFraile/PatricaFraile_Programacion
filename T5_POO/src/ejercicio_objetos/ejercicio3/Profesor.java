package ejercicio_objetos.ejercicio3;

public class Profesor {

    public void ponerNotas(Alumno calificacion) {

        calificacion.getAsignatura1().setCalificación(Math.random() * 11);
        calificacion.getAsignatura2().setCalificación(Math.random() * 11);
        calificacion.getAsignatura3().setCalificación(Math.random() * 11);
    }

    public void calcularMedia(Alumno calificacionMedia) {
        calificacionMedia.getAsignatura1();
        return;


    }
}
