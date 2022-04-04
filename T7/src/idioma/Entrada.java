package idioma;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Idiomas español = new Idiomas("Castellano",1233) {
            @Override
            public void saludar() {
                System.out.println("Saludar en  "+getNombre()+ "es"+getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("Despedir en "+getNombre()+ "es "+getPalabras().get(1));

            }
        };
        Idiomas ingles = new Idiomas("Ingles",200000) {
            @Override
            public void saludar() {
                System.out.println("Saludar en " +getNombre() + " es "+getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("Despedir en "+getNombre()+ " es "+getPalabras().get(1));

            }
        };
        español.IngresarPalabra("Hola");
        español.IngresarPalabra("Adios");
        ingles.IngresarPalabra("Hello");
        ingles.IngresarPalabra("Bye");

        ArrayList<Idiomas>listaIdiomas = new ArrayList<>();
        listaIdiomas.add(español);
        listaIdiomas.add(ingles);
        for (Idiomas item: listaIdiomas) {
            item.saludar();
            item.despedir();
        }
        /*Dialecto ingles1 = new Dialecto(español ,1200);
        ingles1.saludar();
        ingles1.calcularNumeroHablantes(30, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                ingles1.setNumeroHablates(ingles.getNumeroHablantes()*n);
            }
        });*/

        for ( Idiomas idioma : listaIdiomas ) {
            idioma.listarPalabras();
        }
    }
}
