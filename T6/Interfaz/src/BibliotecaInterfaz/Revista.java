package BibliotecaInterfaz;

public class Revista extends Elementos implements Prestar {
    private int isbn;


    public Revista() {
    }

    public Revista(String id, String seccion, String titulo, boolean estado, int isbn) {
        super(id, seccion, titulo, estado);
        this.isbn = isbn;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN " +isbn);
        System.out.println("Estado " +estado);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
