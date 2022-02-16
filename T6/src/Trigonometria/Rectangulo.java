package Trigonometria;

public class Rectangulo extends Figura {
    private double base, altura, resultado;

    public Rectangulo(double altura, double base) {
        super(altura, base);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        this.resultado = base * altura;
        System.out.println("El area es:\t" + resultado);

    }

    public void calcularPerimetro() {
        this.resultado = 2 * (base + altura);
        System.out.println("El perimetro es:\t" + resultado);

    }

    @Override
    public double getBase() {
        return base;
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
