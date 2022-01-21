package ejercicio_objetos.ejercicio2;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Triangulo triangulo = new Triangulo(12, 20);
        System.out.println(triangulo.calcularTriangulo());
        Círculo circulo = new Círculo(33.4);
        System.out.println(circulo.carcularCuadrado());
        System.out.println(circulo.calcularDiametro());
        Cuadrado cuadrado = new Cuadrado(13, 13);
        System.out.println(cuadrado.calcularArea());
        System.out.println("Modificación");

        do {
            System.out.println("1.Trabajar con triangulos");
            System.out.println("2.Trabajar con circulo");
            System.out.println("3.Trabajar con cuadrados");
            System.out.println("4.Salir");
            System.out.println("Que opcion quieres");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido trabajar con triangulos");
                    System.out.println("Introduce una base ");
                    int base = entrada.nextInt();
                    System.out.println("Introduce una altura");
                    int altura = entrada.nextInt();
                    Triangulo triangulo1 = new Triangulo(base, altura);
                    do {
                        System.out.println("1.Calcular area");
                        System.out.println("2.Mostrar datos");
                        System.out.println("Que operacion quieres hacer");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Has elegido calcular area");
                                triangulo1.calcularTriangulo();
                                break;
                            case 2:
                                System.out.println("Mostrar los datos");

                                    System.out.println("Area:" + triangulo1.calcularTriangulo());


                                break;
                        }
                    } while (opcion != 2);
                    break;
                case 2:
                    System.out.println("Has elegido trabajar con circulo");
                    System.out.println("Introduce el radio");
                    int radio = entrada.nextInt();
                    Círculo circulo1 = new Círculo(radio);
                    do {
                        System.out.println("1.Calcular radio");
                        System.out.println("2.Calcular diametro");
                        System.out.println("3.Mostrar los datos");
                        System.out.println("Que operacion quieres hacer");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Has elegido calcular el radio");
                                circulo1.carcularCuadrado();
                                break;
                            case 2:
                                System.out.println("Has elegido calcular el diámetro");
                                circulo1.calcularDiametro();
                                break;
                            case 3:
                                System.out.println("Has elegido mostrar los datos");

                                    System.out.println("Radio:" + circulo1.carcularCuadrado());
                                    System.out.println("Diametro:" + circulo1.calcularDiametro());

                                break;
                        }
                    } while (opcion != 3);
                    break;
                case 3:
                    System.out.println("Has elegido trabajar con cuadrados");
                    System.out.println("Introduce la base");
                    base = entrada.nextInt();
                    System.out.println("Introduce la altura");
                    altura = entrada.nextInt();
                    Cuadrado cuadrado1 = new Cuadrado(base,altura);
                    do{
                        System.out.println("1.Calcula el area");
                        System.out.println("2.Calcula el perimetro");
                        System.out.println("3.Mostrar datos");
                        System.out.println("Que operación quieres hacer");
                        opcion= entrada.nextInt();
                        switch (opcion){
                            case 1 :
                                System.out.println("Has elegido calcular el area");
                                cuadrado1.calcularArea();
                                break;
                            case 2:
                                System.out.println("Has elegido calcular el perimetro");
                               cuadrado1.calcuPerimetro();
                               break;
                            case 3:
                                System.out.println("Mostrar los datos");
                                    System.out.println("Area : " +cuadrado1.calcularArea());
                                    System.out.println("Perimetro :" +cuadrado1.calcuPerimetro());

                                break;
                        }

                    }while(opcion!=3);
                case 4:
                    System.out.println("Has elegido salir");

            }
        } while (opcion != 4);

    }
}
