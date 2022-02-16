package TrabajosHerencia;
//incompleto
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Trabajadores> lista;
    Trabajadores trabajadores = new Trabajadores();

    public Empresa() {
        lista = new ArrayList<>();
    }
    public void añadirPersonal(Trabajadores trabajador){
        lista.add(trabajador);
    }
    public void personaExistente(){

    }

}
