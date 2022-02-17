package Trigonometria;

public final class Rectangulo extends Figura {
    private double  resultado;
    private int altura, base;

    public Rectangulo(int altura, int base) {

        this.altura = altura;
        this.base = base;
    }
    public Rectangulo(){}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public double calcularArea() {
        super.calcularArea();
        this.resultado = base * altura;
        System.out.println("El area es:\t" + resultado);
        return this.resultado;

    }

    public void calcularPerimetro() {
        this.resultado = 2 * (base + altura);
        System.out.println("El perimetro es:\t" + resultado);

    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
