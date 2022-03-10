package BibliotecaInterfaz;

public class DVD extends Elementos {
    tiposDVD tipo1 = tiposDVD.pelicula1;
    tiposDVD tipo2 = tiposDVD.pelicula2;
    tiposDVD tipo3 = tiposDVD.pelicula3;
    tiposDVD tipo4 = tiposDVD.pelicula4;
    private int año;
    private String director, actores;

    public DVD() {
    }

    public DVD(String id, String seccion, String titulo, int año , String director , String actores) {
        super(id, seccion, titulo);
        this.año = año;
        this.director = director;
        this.actores = actores;
    }

}
