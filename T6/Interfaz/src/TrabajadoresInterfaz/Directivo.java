package TrabajadoresInterfaz;

public final class Directivo extends Persona implements Comision{
    private int capital;

    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni, int capital) {
        super(nombre, apellido, dni);
        this.capital = capital;

    }
    public double votar(){
        return((int)Math.random()*11)/2;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital "+capital);
    }

    @Override
    public double votar(int voto) {
        return 0;
    }

    @Override
    public void obtenerBeneficios() {

    }
}
