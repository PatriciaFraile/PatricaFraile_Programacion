package TrabajosHerencia;
//incompleto

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Trabajadores> lista;
    Trabajadores trabajadores = new Trabajadores();

    public Empresa() {
        lista = new ArrayList<>();
    }

    public void añadirPersonal(Trabajadores trabajador) {
        if (existePersona(trabajador.getDin()) == null) {
            lista.add(trabajador);
        } else {
            System.out.println("Ya existe");
        }

    }

    private Trabajadores existePersona(String dni) {
        Trabajadores persona = null;
        for (Trabajadores item : lista) {
            if (item.getDin().equalsIgnoreCase(item.getDin())) {
                return item;
            }

        }
        return persona;
    }
    public void listarPersonas(){

    }

}



