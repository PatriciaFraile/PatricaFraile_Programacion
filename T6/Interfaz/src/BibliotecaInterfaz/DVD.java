package BibliotecaInterfaz;

public class DVD extends Elementos {
    tiposDVD tipo;
    private int año;
    private String director, actores;

    public DVD() {
    }

    public DVD(String id, String seccion, String titulo, boolean estado, int año, String director , String actor , tiposDVD tipo) {
        super(id, seccion, titulo, estado);
        this.año = año;
        this.director = director;
        this.actores = actores;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año " +año);
        System.out.println("Director " +director);
        System.out.println("Actores " +actores);
        System.out.println("Tipo " +tipo);
    }

    public tiposDVD getTipo() {
        return tipo;
    }

    public void setTipo(tiposDVD tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

}
