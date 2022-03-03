import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Seleccion listar = new Seleccion();
        Posiciones posicionesDefensa = Posiciones.defensa;
        Vocaciones vocacionesOfensivo = Vocaciones.ofensivo;
        int opcion;
        do{
            System.out.println("1.Añadir");
            System.out.println("2.Jugadores delanteros");
            System.out.println("3.Mostrar Gastos");
            System.out.println("4.Mostrar datos");
            System.out.println("Elige una opcion");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("--Añadir--");
                    do{
                        System.out.println("1.Jugadores");
                        System.out.println("2.Entrenadores");
                        opcion = entrada.nextInt();
                        switch (opcion){
                            case 1:
                                System.out.println("--Jugadores--");
                                System.out.println("Nombre");
                                String nombre = entrada.next();
                                System.out.println("Apellidos");
                                String apellidos = entrada.next();
                                System.out.println("DNI");
                                String dni = entrada.next();
                                System.out.println("Edad");
                                int edad = entrada.nextInt();
                                System.out.println("Posicion");
                                String posicion = posicionesDefensa.name();
                                System.out.println("Sueldo");
                                Double sueldo = entrada.nextDouble();
                                Jugador jugador = new Jugador(nombre,apellidos,dni,edad,posicion,sueldo);
                                listar.contratarJugador(jugador);
                                break;
                            case 2:
                                System.out.println("--Entrenadores--");
                                System.out.println("Nombre");
                                nombre = entrada.next();
                                System.out.println("Apellidos");
                                apellidos = entrada.next();
                                System.out.println("DNI");
                                dni = entrada.next();
                                System.out.println("Edad");
                                edad = entrada.nextInt();
                                System.out.println("Vocacion");
                                String vocacion = vocacionesOfensivo.name();
                                System.out.println("Sueldo");
                                sueldo = entrada.nextDouble();
                                Entrenador entrenador = new Entrenador(nombre , apellidos, dni,edad , vocacion ,sueldo);
                                listar.contratarEntrenador(entrenador);
                                break;
                        }
                    }while (opcion==2);
                    break;
                case 2:
                    System.out.println("Mostrar Jugadores delanteros");
                    System.out.println("Escribe la posicion");
                    String posicion = entrada.next();
                    listar.verPosicion("delantero");

                    break;
                case 3:
                    System.out.println("Mostrar Gastos de la selección");
                    listar.mostrarGastos();
                    break;
                case 4:
                    System.out.println("Mostrar Datos");
                    listar.listar();
            }

        }while(opcion!=4);




    }
}
