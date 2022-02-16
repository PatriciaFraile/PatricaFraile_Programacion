package Trigonometria;

public class Triángulo extends Figura {
    private double altura, base, resultado;

    public Triángulo(double altura, double base) {
        super(altura, base);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        this.resultado = (base * altura) / 2;
        System.out.println("El area es:\t" + resultado);
    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getBase() {
        return base;
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
