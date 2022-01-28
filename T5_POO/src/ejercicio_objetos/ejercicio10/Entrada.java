package ejercicio_objetos.ejercicio10;
import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = entrada.next();
        System.out.println("Introduce la edad");
        int edad = entrada.nextInt();
        System.out.println("Introduce el peso");
        System.out.println("Introduce el sexo");
        char sexo = entrada.next().charAt(0);
        double peso = entrada.nextDouble();
        System.out.println("Introduce la altura");
        double altura = entrada.nextDouble();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona(nombre,sexo,peso,altura,edad);
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);//incompleto
        persona1.setAltura(1.60);

        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
        System.out.println("Persona1");
        persona1.muestraMensajePeso(persona1);
        persona1.muestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        persona2.muestraMensajePeso(persona2);
        persona2.muestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        persona3.muestraMensajePeso(persona3);
        persona3.muestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());






    }
}
