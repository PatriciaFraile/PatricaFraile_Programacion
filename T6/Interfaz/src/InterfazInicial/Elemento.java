package InterfazInicial;

public class Elemento {
    protected String identificador, titulo, autor,formato;
    protected int tamanio;

    public Elemento() {
    }

    public Elemento(String identificador, String titulo, String autor, int tamanio, String formato) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;
    }

    public void mostrarDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Formato: " + formato);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
