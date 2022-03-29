package Genericos;

public class Entrada {
    public static void main(String[] args) {
        Coleccion<Disco,Double,Boolean>coleccionDiscos = new Coleccion();
        coleccionDiscos.agregarCosas(new Disco());
         /*Coleccion <Coleccionable> coleccionColeccionables = new Coleccion();
         coleccionColeccionables.agregarCosas(new Disco());
         coleccionColeccionables.agregarCosas(new Camiseta());*/
        ColeccionEspecifica<Disco> listaEspecifica = new ColeccionEspecifica<Disco>();

        Coleccion<Camiseta, Character,String> coleccionCamisetas = new Coleccion<>();
        coleccionCamisetas.agregarCosas(new Camiseta());



    }


}
