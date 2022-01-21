package ejercicio_objetos.ejercicio2;
public class Cuadrado {
    private int base , altura;
    private double area , perimetro;
    public Cuadrado(){

    }
    public Cuadrado(int base , int altura ){
        this.altura=altura;
        this.base=base;
    }
    public double calcularArea(){
        area = base*altura;
        return area;
    }
    public double calcuPerimetro(){
        perimetro = 2*area+2*base;
        return perimetro;
    }


}
