package InterfazInicial;

public final class Imagen extends Elemento implements Ejecutable {
    private int ISBN;

    public Imagen() {
    }

    public Imagen(String identificador, String titulo, String autor, int tamanio, String formato, int ISBN) {
        super(identificador, titulo, autor, tamanio, formato);
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: " + ISBN);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public void reiniciar() {

    }

    @Override
    public void parar() {

    }

    @Override
    public boolean ejecutar() {
        return false;
    }


}
