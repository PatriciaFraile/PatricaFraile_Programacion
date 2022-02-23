package TrabajosHerencia;

import java.util.ArrayList;

public class Jefes extends Trabajadores {
    private String nombre, apellidos, din, beneficios, acciones;
    private ArrayList<Trabajadores> lista;

    public Jefes() {
        lista = new ArrayList<>();
    }

    public Jefes(String nombre, String apellidos, String din, String beneficios, String acciones) {
        this.beneficios = beneficios;
        this.acciones = acciones;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.din = din;
    }


    @Override
    public void mostrarDatos(String din) {
        super.mostrarDatos(din);
        System.out.println("Acciones\t" + acciones);
        System.out.println("Beneficios\t" + beneficios);
    }

    @Override
    public void mostrarDatoss() {
        super.mostrarDatoss();
        System.out.println("Acciones\t" + acciones);
        System.out.println("Beneficios\t" + beneficios);
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getDin() {
        return din;
    }


    public void setDin(String din) {
        this.din = din;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }
}
