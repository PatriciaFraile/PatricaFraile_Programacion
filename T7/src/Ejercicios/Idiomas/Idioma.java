package Ejercicios.Idiomas;

import java.util.ArrayList;

public abstract class Idioma {
     private String nombre;
     private int numeroHablantes;
     private ArrayList<String> listaPalabras;

    public Idioma(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        this.listaPalabras = new ArrayList();
    }
    public Idioma(){}

    public abstract void saludar();

    public abstract void despedir();

    public void ingresarPalabra(String palabras) {
        this.listaPalabras.add(palabras);
    }

    public void listarPalabras() {
        System.out.printf("Las palabras en %s son", nombre);
        for (String item: listaPalabras) {
            System.out.println(item);
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList<String> getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ArrayList<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
}
