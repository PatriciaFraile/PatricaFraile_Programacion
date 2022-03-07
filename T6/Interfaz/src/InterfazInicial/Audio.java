package InterfazInicial;

public final class Audio extends Elemento implements Ejecutable {
    private int duracion;
    private String soporte;

    public Audio(String identificador, String titulo, String autor, int tamanio, String formato, int duracion, String soporte) {
        super(identificador, titulo, autor, tamanio, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duración: " + duracion);
        System.out.println("Soporte:" + soporte);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
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
