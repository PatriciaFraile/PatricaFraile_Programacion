package Trigonometria;

public class Entrada {
    public static void main(String[] args) {
       Circulo circulo = new Circulo(22.5);
        System.out.println("--Circulo--");
       circulo.mostrarDatos();
        System.out.println("--Area--");
       circulo.calcularArea();
        System.out.println("--Diametro--");
       circulo.calcularDiametro();
       Rectangulo rectangulo = new Rectangulo(22,34);
        System.out.println("--Rectangulo--");
       rectangulo.mostrarDatos();
        System.out.println("--Area--");
       rectangulo.calcularArea();
        System.out.println("--Perimetro--");
       rectangulo.calcularPerimetro();
       Triángulo triangulo = new Triángulo(33,21);
        System.out.println("--Triangulo--");
       triangulo.mostrarDatos();
        System.out.println("--Area--");
       triangulo.calcularArea();
    }
}
