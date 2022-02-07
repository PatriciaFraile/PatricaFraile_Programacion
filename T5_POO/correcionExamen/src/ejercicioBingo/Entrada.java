package ejercicioBingo;

public class Entrada {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Borja","123344",20);
        jugador.comprarCartones(5);
        jugador.verCartones();
        do{
            int aleatorio = (int)Math.random()*51;
            jugador.comprarCartones(aleatorio);
        }while(!jugador.isGanador());

    }
}
