package BibliotecaInterfaz;

public class Elementos {
    protected String id, seccion, titulo,elemento;
    protected boolean estado;

    public Elementos() {

    }

    public Elementos(String id, String seccion, String titulo, boolean estado) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.estado = estado;
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

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
}

