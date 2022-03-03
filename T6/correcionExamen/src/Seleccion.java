import java.util.ArrayList;

public final class Seleccion {
    private ArrayList<Persona> lista;
    private double gastos;
    private String nombre;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        lista = new ArrayList<>();
    }

    public Seleccion() {
    }

    public void contratarJugador(Jugador jugador) {
        if (!existePersona(jugador.dni)) {
            lista.add(jugador);
            System.out.println("Añadido correctamente");
        }
    }

    private boolean existePersona(String dni) {
        boolean existe = false;
        for (Persona item : lista) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                System.out.println("Ya existe");
                existe = true;
            }
        }
        return existe;
    }

    public void contratarEntrenador(Entrenador entrenador) {
        if (existePersona(entrenador.dni)) {
            System.out.println("Existe");
        } else {
            lista.add(entrenador);
            System.out.println("Añadido Correctamente");
        }
    }

    public void verPosicion(String posicion) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(posicion)) {
                verJugadores();
            }
        }


    }

    public void verJugadores() {
        for (Persona item : lista) {
            System.out.println("Jugadores");
            if (item instanceof Jugador) {
                item.mostrarDatos();
            }
        }
    }

    public void verEntrenadores() {
        for (Persona item : lista) {
            if (item instanceof Entrenador) {
                item.mostrarDatos();
            }
        }
    }

    public void mostrarGastos() {
        for (Persona item : lista) {
            gastos+= item.getSueldo();

        }
    }

    public void listar() {
        for (Persona item : lista) {
            verEntrenadores();
            verJugadores();
        }
    }

    public void verPlantilla() {
        int jugadores = 0, entrenadores = 0;
        for (Persona item : lista) {
            item.mostrarDatos();
            if (item instanceof Jugador) {
                jugadores++;
            } else {
                entrenadores++;
            }
        }
    }
}




