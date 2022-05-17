package model;

public class Perfil {
    private String id_numerico , nombre;

    public Perfil(String id_numerico, String nombre) {
        this.id_numerico = id_numerico;
        this.nombre = nombre;
    }

    public String getId_numerico() {
        return id_numerico;
    }

    public void setId_numerico(String id_numerico) {
        this.id_numerico = id_numerico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
