package BibliotecaInterfaz;

public class Elementos {
    protected String id, seccion, titulo;

    public Elementos() {

    }

    public Elementos(String id, String seccion, String titulo) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
    }

    public void mostrarDatos() {
        System.out.println("ID " + id);
        System.out.println("Seccion " + seccion);
        System.out.println("Titulo " + titulo);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
