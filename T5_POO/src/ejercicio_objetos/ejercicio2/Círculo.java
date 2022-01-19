package ejercicio_objetos.ejercicio2;

public class Círculo {
    private double radio, diametro, area, pi;

    public Círculo() {
    }

    public Círculo(double radio) {
        this.radio = radio;
    }

    public double carcularCuadrado(double pi) {
        this.pi = 3.14;
        double resultadoCuadrado = pi * (Math.pow(radio, 2));
        return resultadoCuadrado;
    }

    public double calcularDiametro() {
        double resultadoDiametro = 2 * diametro;
        return resultadoDiametro;
    }
}
