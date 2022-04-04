package idioma;

public final class Dialecto extends Idiomas {
    // al base del dialecto;
    private Idiomas idioma;
    // el numero del dialecto
    private int numeroHablates;

    public Dialecto(String nombre, int numeroHablantes, Idiomas idioma, int numeroHablates) {
        super(nombre, numeroHablantes);
        this.idioma = idioma;
        this.numeroHablates = numeroHablates;
    }

    /*public Dialecto(Idiomas idioma, int numeroHablates) {
        this.idioma = idioma;
        this.numeroHablates = numeroHablates;
    }*/

    @Override
    public void saludar() {
        System.out.println("Este es el saludo en catalan");

    }

    @Override
    public void despedir() {
        System.out.println("Esta la despedida en catalan");
    }

    public Idiomas getIdioma() {
        return idioma;
    }

    public void setIdioma(Idiomas idioma) {
        this.idioma = idioma;
    }

    public int getNumeroHablates() {
        return numeroHablates;
    }

    public void setNumeroHablates(int numeroHablates) {
        this.numeroHablates = numeroHablates;
    }

    public void calcularNumeroHablantes(int numeroHablates, Cuantificable c) {
        c.cuantificarHablantes(numeroHablates);
    }


}