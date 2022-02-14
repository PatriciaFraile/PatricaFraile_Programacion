package ListaMultimedia;

public class Audio extends ElementoMultimedia {
    private int duracion;
    private String soporte;

    public Audio() {
    }

    public Audio(String titulo, String autor, String tamaño, String formato, String id, int duracion, String soporte) {
        super(titulo, autor, tamaño, formato, id);
        this.duracion = duracion;
        this.soporte = soporte;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La duración es\t" + duracion);
        System.out.println("El soporte es\t" + soporte);
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
}
