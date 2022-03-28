package Ejercicios.Idiomas;

import Ejercicios.Idiomas.Dialecto;
import Ejercicios.Idiomas.Idioma;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Idioma idioma1 = new Idioma("castellano", 500) {
            @Override
            public void saludar() {
                System.out.println(" El saludo en " + getNombre() + "es " + getListaPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println(" La despedida en " + getNombre() + " es" + getListaPalabras().get(1));

            }
        };
        Idioma idioma2 = new Idioma("Ingles", 500) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + "es " + getListaPalabras().get(2));
            }

            @Override
            public void despedir() {
                System.out.println(" La despedida en " + getNombre() + " es" + getListaPalabras().get(3));

            }
        };
        Idioma idioma3 = new Idioma("Aleman", 500) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + "es " + getListaPalabras().get(4));
            }

            @Override
            public void despedir() {
                System.out.println(" La despedida en " + getNombre() + " es" + getListaPalabras().get(5));

            }
        };
        Dialecto catalan = new Dialecto();
        idioma1.ingresarPalabra("Hola");
        idioma1.ingresarPalabra("Que");
        idioma2.ingresarPalabra("Hello");
        idioma2.ingresarPalabra("Who");
        idioma3.ingresarPalabra("Hallo");
        idioma3.ingresarPalabra("wie");

        ArrayList<Idioma> listarIdiomas = new ArrayList<>();
        listarIdiomas.add(idioma1);
        listarIdiomas.add(idioma2);
        listarIdiomas.add(idioma3);


        for (Idioma item : listarIdiomas) {
            item.saludar();
            item.despedir();

        }
        for (Idioma item : listarIdiomas) {
            item.listarPalabras();

        }

    }
}
