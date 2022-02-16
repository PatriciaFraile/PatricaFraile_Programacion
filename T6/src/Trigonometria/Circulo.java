package Trigonometria;

public class Circulo extends Figura {
    private double radio, resultado;

    public Circulo(double altura, double base, double radio) {
        super(altura, base);
        this.radio = radio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El radio es \t" + radio);
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        this.resultado = Math.PI * (Math.pow(radio, 2));
        System.out.println("El area es :\t" + resultado);
    }

    public void calcularDiametro() {
        this.resultado = radio * 2;
        System.out.println("El diámetro es:\t" + resultado);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
