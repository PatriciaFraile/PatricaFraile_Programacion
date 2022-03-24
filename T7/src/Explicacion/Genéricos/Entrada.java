package Explicacion.Genéricos;

public class Entrada {
    public static void main(String[] args) {
        Coleccion<Disco>coleccionDiscos = new Coleccion();
        coleccionDiscos.agregarCosas(new Disco());
         Coleccion <Coleccionable> coleccionColeccionables = new Coleccion();
         coleccionColeccionables.agregarCosas(new Disco());
         coleccionColeccionables.agregarCosas(new Camiseta());
        ColeccionEspecifica<Disco> listaEspecifica = new ColeccionEspecifica<Disco>();
        //discos -- Double
        // listar -- boolean

        //camiseta -- char
        //listar-- String


    }


}
