package BibliotecaInterfaz;

import java.util.ArrayList;

public class Socio extends Persona {
    private ArrayList<Elementos> prestar;
    private int numSocio;

    public Socio(int numSocio) {
        prestar = new ArrayList<>();
        this.numSocio = numSocio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Prestar " + prestar);
        System.out.println("Numero de socio " + numSocio);
    }

    public void introduce(String nombre, String apellido, String dni) {
        this.numSocio = (int) Math.random();
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
}
