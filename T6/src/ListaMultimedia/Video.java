package ListaMultimedia;

public class Video extends ElementoMultimedia {
    private String director, actor;

    public Video() {
    }

    public Video(String titulo, String autor, String tamaño, String formato, String id, String director, String actor) {
        super(titulo, autor, tamaño, formato, id);
        this.director = director;
        this.actor = actor;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El director es\t" + director);
        System.out.println("El actor es\t" + actor);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
