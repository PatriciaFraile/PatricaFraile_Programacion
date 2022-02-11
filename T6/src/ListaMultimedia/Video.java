package ListaMultimedia;

public class Video extends ElementoMultimedia {
    private String director, autor;

    public Video() {
    }

    public Video(String director, String autor) {
        this.director = director;
        this.autor = autor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El director es\t" + director);
        System.out.println("El autor es\t" + autor);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
