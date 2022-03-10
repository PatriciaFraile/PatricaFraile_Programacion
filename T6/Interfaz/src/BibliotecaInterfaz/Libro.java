package BibliotecaInterfaz;

public class Libro extends Elementos {
    private int isbn, paginas;
    private String autor, editorial;
    private boolean estado;

    public Libro() {

    }

    public Libro(String id, String seccion, String titulo, int isbn, int paginas, String autor, String editorial, boolean estado) {
        super(id, seccion, titulo);
        this.isbn = isbn;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
        this.estado = estado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Isbn " + isbn);
        System.out.println("Paginas " + paginas);
        System.out.println("Autor " + autor);
        System.out.println("Editorial " + editorial);
        System.out.println("Estado " + estado);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
