package Explicacion.Anidacion.ejercicios;

public class ClaseGenerica {
    private  String nombre;
    private  int numero;
    private  boolean aciertos;
    private ClaseStatic claseStatic;

    public ClaseGenerica(String nombre , int numero,boolean aciertos , ClaseStatic claseStatic) {
        this.nombre = nombre;
        this.numero = numero;
        this.aciertos = aciertos;
        this.claseStatic = claseStatic;
    }
    public  void mostrar(){
        System.out.println(nombre);
        System.out.println(numero);
        System.out.println(aciertos);
        claseStatic.mostrarStatic();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAciertos() {
        return aciertos;
    }

    public void setAciertos(boolean aciertos) {
        this.aciertos = aciertos;
    }
    static class ClaseStatic{
        private String nombreStatic;
        private int numeroStatic;
        private boolean aciertoStatic;

        public ClaseStatic(String nombreStatic , int numeroStatic, boolean aciertoStatic) {
            this.nombreStatic = nombreStatic;
            this.numeroStatic = numeroStatic;
            this.aciertoStatic = aciertoStatic;
        }
        public void mostrarStatic(){
            System.out.println(nombreStatic);
            System.out.println(numeroStatic);
            System.out.println(aciertoStatic);
        }

        public String getNombreStatic() {
            return nombreStatic;
        }

        public void setNombreStatic(String nombreStatic) {
            this.nombreStatic = nombreStatic;
        }

        public int getNumeroStatic() {
            return numeroStatic;
        }

        public void setNumeroStatic(int numeroStatic) {
            this.numeroStatic = numeroStatic;
        }

        public boolean isAciertoStatic() {
            return aciertoStatic;
        }

        public void setAciertoStatic(boolean aciertoStatic) {
            this.aciertoStatic = aciertoStatic;
        }
    }
}
