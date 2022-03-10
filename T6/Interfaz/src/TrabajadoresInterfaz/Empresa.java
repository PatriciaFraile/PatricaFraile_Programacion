package TrabajadoresInterfaz;

import java.util.ArrayList;

public class Empresa  {
    private ArrayList<Persona>listar;

    public Empresa() {
        listar = new ArrayList<>();
    }
    public void votar(Comision c){
        this.votos += c.votar();
    }

}
