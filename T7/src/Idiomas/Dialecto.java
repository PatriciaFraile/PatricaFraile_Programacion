package Idiomas;

public final class Dialecto extends Idioma implements Cuantificable{
 private Idioma idioma;
 private  int numeroHablantes;

   //public Dialecto(int numeroHablantes , Idioma idioma) {
        /*super(nombre, numeroHablantes);
        this.numeroHablantes = numeroHablantes;
        this.idioma = idioma;*/
   // }

    @Override
    public void saludar() {
        System.out.println("Este es el saludo en catalan");
    }

    @Override
    public void despedir() {
        System.out.println("Este es la despedida en catalán");
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    @Override
    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    @Override
    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }
    public void calcularNumeroHablantes(int numeroHablantes, Cuantificable c){
        c.cuantificarHablantes(numeroHablantes);
    }
}
