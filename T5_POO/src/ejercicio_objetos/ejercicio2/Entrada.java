package ejercicio_objetos.ejercicio2;
import java.util.Scanner;
public class Entrada { //incompleto
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Triangulo triangulo= new Triangulo(12 , 20);
        System.out.println(  triangulo.calcularTriangulo());
        Círculo circulo = new Círculo(33.4 );
        System.out.println(circulo.carcularCuadrado());
        System.out.println(circulo.calcularDiametro());
        Cuadrado cuadrado = new Cuadrado(13,13);
        System.out.println(cuadrado.calcularArea());
        System.out.println("Modificación");

        do {
            System.out.println("1.Trabajar con triangulos");
            System.out.println("2.Trabajar con circulo");
            System.out.println("3.Trabajar con cuadrados");
            System.out.println("Que opcion quieres");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("Has elegido trabajar con triangulos");
                    System.out.println("Introduce una base ");
                    int base = entrada.nextInt();
                    System.out.println("Introduce una altura");
                    int altura = entrada.nextInt();
                    Triangulo triangulo1 = new Triangulo(base,altura);
                    do{
                        System.out.println("1.Calcular area");
                        System.out.println("Mostrar datos");
                    }
                    break;
            }
        }while (opcion!=3);

    }
}
