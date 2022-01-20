package ejercicio_objetos.ejercicio2;

public class Círculo {
    private double radio, diametro;

    public Círculo() {
    }

    public Círculo(double radio) {
        this.radio = radio;
    }

    public double carcularCuadrado() {
        double resultadoCuadrado = Math.PI * (Math.pow(radio, 2));
        return resultadoCuadrado;
    }

    public double calcularDiametro() {
        double resultadoDiametro = 2 * radio;
        return resultadoDiametro;
    }
}
