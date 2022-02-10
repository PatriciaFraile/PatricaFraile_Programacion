public class Deportivo extends Coche {

    //todo lo que tiene el coche

    private int par;

    public Deportivo() {
    }

    public Deportivo(String matricula, String bastidor, int cv, int cc, int par) {
        super(matricula, bastidor, cv, cc);
        this.par = par;

    }
    //calcularvelocidad
    //deportivo --> 30-40
    //electricos --> 20-30
    //suv-->10-20

    @Override //cambiar cosas
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        System.out.println("Velocidad calculada");
        this.velocidad = (int) (Math.random() * 11) + 30;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
