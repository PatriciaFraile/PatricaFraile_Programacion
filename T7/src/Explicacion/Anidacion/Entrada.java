package Explicacion.Anidacion;

public class Entrada {
    public static void main(String[] args) {
        ClaseGeneral claseGeneral = new ClaseGeneral("Gneral", 1 , false);
        claseGeneral.mostrarDatos();
        ClaseGeneral.ClaseAnidada claseAnidada = claseGeneral.new ClaseAnidada("Elena",2 , true);
        claseAnidada.accesoGeneral();
    }
}
