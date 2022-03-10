package BibliotecaInterfaz;

public class Revista extends Elementos {
    private int isbn;
    private boolean estado;

    public Revista() {
    }

    public Revista(String id, String seccion, String titulo, int isbn , boolean estado) {
        super(id, seccion, titulo);
        this.isbn = isbn;
        this.estado = estado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN " +isbn);
        System.out.println("Estado " +estado);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
