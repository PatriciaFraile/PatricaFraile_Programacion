package Trigonometria;

public  class Figura {
    protected int altura;
    public Figura(){}

    public Figura(int altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return 0;

    }

    public void mostrarDatos() {

        System.out.println("La altura es \t" + altura);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
