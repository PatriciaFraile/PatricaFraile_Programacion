public class Suv extends Coche {
    private int traccion;

    public Suv() {
    }

    public Suv(String matricula, String bastidor, int cv, int cc, int traccion) {
        super(matricula, bastidor, cv, cc);
        this.traccion = traccion;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        this.velocidad = (int) (Math.random() * 11) * 10;
    }
}
