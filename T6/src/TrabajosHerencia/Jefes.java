package TrabajosHerencia;
//incompleto
public class Jefes extends Trabajadores {
    private String nombre, apellidos, din, beneficios, acciones;

    public Jefes(String nombre, String apellidos, String din, String beneficios, String acciones) {
        super(nombre, apellidos, din);
        this.beneficios = beneficios;
        this.acciones = acciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones"+ acciones);
        System.out.println("Beneficios"+ beneficios);
    }
    public void depedirTrabajador(String dni){


    }
}
