package ListaMultimedia;

public class ElementoMultimedia {

    protected String id, titulo, autor, tamaño, formato;

    public ElementoMultimedia() {
    }

    public ElementoMultimedia(String titulo, String autor, String tamaño, String formato, String id) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamaño = tamaño;
        this.formato = formato;
        this.id = id;
    }

    public void mostrarDatos() {
        System.out.println("Titulo\t" + titulo);
        System.out.println("Autor\t" + autor);
        System.out.println("Tamaño\t" + tamaño);
        System.out.println("Formato\t" + formato);
        System.out.println("Id\t" + id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
