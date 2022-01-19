package ejercicio_objetos.ejercicio2;

public class Triangulo {
    private int altura, base;

    public Triangulo() {
    }

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int calcularTriangulo() {
        int resultadoTriangulo = (this.altura * this.base) / 2;
        return resultadoTriangulo;
    }

}
