package ejercicio_objetos.ejercicio3;

public class Entrada {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura bbdd = new Asignatura(2);
        Asignatura entornos = new Asignatura(3);

        Alumno borja = new Alumno(programacion, bbdd, entornos);
        Profesor profesor = new Profesor();
        profesor.ponerNotas(borja);
        System.out.println(borja.getAsignatura1().getCalificación());
        System.out.println(borja.getAsignatura2().getCalificación());
        System.out.println(borja.getAsignatura3().getCalificación());
        System.out.println(profesor.calcularMedia(borja));

    }
}
