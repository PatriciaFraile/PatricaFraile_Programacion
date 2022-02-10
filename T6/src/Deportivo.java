public class Deportivo extends Coche {

    //todo lo que tiene el coche

    private int par;

    public Deportivo() {
    }

    public Deportivo(String matricula, String bastidor, int cv, int cc, int par) {
        super(matricula, bastidor, cv, cc);
        this.par = par;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Par\t" +par);
    }

    @Override //cambiar cosas
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        System.out.println("Velocidad calculada");
        int aleatorio = (int) (Math.random() * 11) + 30;
        setVelocidad(getVelocidad() + aleatorio);
        // tambien se puede calcular this.velocidad+=aleatorio
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
