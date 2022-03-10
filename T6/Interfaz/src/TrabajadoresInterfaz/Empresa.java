package TrabajadoresInterfaz;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> listar;
    private String nombre;
    private int votos;
    private int beneficios;

    public Empresa() {
    }

    public Empresa(String nombre, int beneficios) {
        this.votos = votos;
        this.beneficios = beneficios;
        listar = new ArrayList<>();
    }

    public void listarPersonas() {
        for (Persona item : listar) {
            item.mostrarDatos();
        }
    }

    public void añadirPersona(Persona persona) {
        listar.add(persona);
    }

    public void despedirPersona(String dni) {
        for (int i = 0; i < listar.size(); i++) {
            if (listar.get(i).getDni().equalsIgnoreCase(dni)) {
                listar.remove(i);
                break;
            }

        }
    }

    public void buscarPersonas(String dni) {
        for (Persona item : listar) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                item.mostrarDatos();
            }
        }
    }
    public void registrarVotacion(Comision comision){
        this.votos += comision.votar();
    }
    public void repartirBeneficios(){
        for (Persona item: listar) {
            if(item instanceof Comision){
                ((Comision) item).obtenerBeneficios(beneficios);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }
}
