package BibliotecaInterfaz;

public class Libro extends Elementos implements Prestar{
    private int isbn, paginas;
    private String autor, editorial;

    public Libro() {

    }

    public Libro(String id, String seccion, String titulo, boolean estado, int isbn , int paginas , String autor , String editorial) {
        super(id, seccion, titulo, estado);
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
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

    @Override
    public void prestar() {
        if(estado){
            this.estado = false;
        }
        else{
            System.out.println("Ya esta prestado");

        }
    }

    @Override
    public void devolver() {
        if (!estado) {
            this.estado = true;
        }
        else{
            System.out.println("Ya esta disponible");
        }

    }
}
