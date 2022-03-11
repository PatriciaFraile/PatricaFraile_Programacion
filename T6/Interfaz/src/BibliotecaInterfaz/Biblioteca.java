package BibliotecaInterfaz;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Persona>listar;
    private ArrayList<Elementos> listarObjetos;
    public Biblioteca(){
        listar = new ArrayList<>();
        listarObjetos = new ArrayList<>();
    }
    public void registrarPersona(Persona persona){
        if (!existePersona(persona.dni)) {
            listar.add(persona);
            System.out.println("Añadido correctamente");
        }
    }
    public void registrarElemento(Elementos elemento){
        listarObjetos.add(elemento);
        System.out.println("Añadido correctamente");
    }

    private boolean existePersona(String dni) {
        boolean existe = false;
        for (Persona item : listar) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                System.out.println("Ya existe");
                existe = true;
            }
        }
        return existe;
    }
    public void prestamo(Persona persona , Elementos elemento){
        ((Socio)persona).getPrestar().add(elemento);
        ((Prestar)elemento).prestar();
    }
    public void devoluciones(Persona persona , Elementos elemento) {
        ((Socio)persona).getPrestar().remove(elemento);
        ((Prestar)elemento).devolver();
    }
    public void mostrarPrestados(){
        for (Elementos item: listarObjetos) {
            if(!item.estado){
                item.mostrarDatos();
            }
        }
    }
    public void mostrarDevoluciones(){
        for (Elementos item: listarObjetos) {
            if(item.estado){
                item.mostrarDatos();
            }

        }
    }
    public void mostrarElementosSocio(String dni){
        for ( Persona itemPersona : listar ) {
            if (itemPersona.getClass().getSimpleName().toLowerCase().equals("socio")
                    && itemPersona.getDni().toLowerCase().equals(dni) ){
                itemPersona.mostrarDatos();
            }
        }
    }
}
