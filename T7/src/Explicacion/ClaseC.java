package Explicacion;

public class ClaseC {
    public void registrarMensaje(ClaseA claseA){
        claseA.mostrarDatos();
        claseA.mensajeAbstracto();
    }
    public void modificar(String s, Modificables modificables){
        modificables.lanzarMayusculas(s);
        modificables.lanzarMinusculas(s);

    }
}
