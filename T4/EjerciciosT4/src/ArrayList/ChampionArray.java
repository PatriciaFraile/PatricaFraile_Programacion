package ArrayList;
import java.util.ArrayList;
public class ChampionArray {
    public static void main(String[] args) {
        ArrayList<Integer> equipos = new ArrayList<>();
        int aleatorioUno;
        int aleatorioDos;
        String[] Bombo1 = {"Barcelona", "PSG", "Bayern", "City", "Juventus", "Leizpzig", "Valencia", "Liverpool"};
        String[] Bombo2 = {"Real Madrid", " Tottenham", "Napoles", "B.Dortmund", "Lyon", "Chelsea", "Atalanta", "Atletico de Madrid"};
        for (int i = 0; i < Bombo1.length; i++) {
            aleatorioUno = (int) (Math.random() * 8);
            aleatorioDos = (int) (Math.random() * 8);
            do {
                if (equipos.contains(aleatorioUno)) {
                    aleatorioUno = (int) (Math.random() * 8);
                } else {
                    equipos.add(aleatorioUno);
                }
            } while (!equipos.contains(aleatorioUno));
            do {
                if (equipos.contains(aleatorioDos)) {
                    aleatorioDos = (int) (Math.random() * 8);
                } else {
                    equipos.add(aleatorioDos);
                }
            } while (!equipos.contains(aleatorioDos));
            System.out.println(Bombo1[aleatorioUno] + "\t" + "\t" + Bombo2[aleatorioDos]);
        }
    }
}

