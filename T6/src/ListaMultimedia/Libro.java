package ListaMultimedia;

public class Libro extends ElementoMultimedia {
    private int ISBN;
    private int numeroPaginas;

    public Libro() {

    }

    public Libro(int ISBN, int numeroPaginas) {
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN\t" + ISBN);
        System.out.println("Numero de páginas\t" + numeroPaginas);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
