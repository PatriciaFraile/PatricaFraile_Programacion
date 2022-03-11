package BibliotecaInterfaz;

public class CD extends Elementos implements Prestar {
    tiposCD tipos;
    private int anio;

    public CD() {

    }

    public CD(String id, String seccion, String titulo, boolean estado, tiposCD tipos , int anio) {
        super(id, seccion, titulo, estado);
        this.tipos = tipos;
        this.anio = anio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año " + anio);
        System.out.println("Tipo " + tipos);
        System.out.println("Estado " + estado);
    }

    public tiposCD getTipos() {
        return tipos;
    }

    public void setTipos(tiposCD tipos) {
        this.tipos = tipos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
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
