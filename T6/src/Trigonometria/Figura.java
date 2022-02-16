package Trigonometria;

public class Figura {
    protected double altura, base;

    public Figura(double altura, double base) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {

    }

    public void mostrarDatos() {
        System.out.println("La base es \t" + base);
        System.out.println("La altura es \t" + altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
