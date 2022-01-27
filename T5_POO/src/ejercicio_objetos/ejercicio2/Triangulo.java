package ejercicio_objetos.ejercicio2;

public class Triangulo {
    private int altura, base;
    private double area;

    public Triangulo() {
    }

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public void calcularTriangulo() {
        this.area = (this.altura * this.base) / 2;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
