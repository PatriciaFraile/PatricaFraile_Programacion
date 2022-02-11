import java.util.ArrayList;

public class Concesionario {
     private ArrayList<Coche> listaCoches;

    public Concesionario() {
        listaCoches = new ArrayList<>();
    }

    public void agregarCoche(Coche coche) {
        listaCoches.add(coche);
    }

    public void buscarCoches(String matricula) {
        boolean encontrado = false;
        for (Coche item : listaCoches) {
            if (matricula.equals(item.getMatricula())) {
                encontrado = true;
                System.out.println("Matricula\t" + item.getMatricula());
                System.out.println("Bastidor\t" + item.getBastidor());
                System.out.println("CV\t" + item.getCv());
                System.out.println("CC\t" + item.getCc());
            }
        }
        if (!encontrado) {
            System.out.println("Coche no encontrado");
        }

    }

    public void borrarCoche(String matricula) {
        boolean encontrado = false;
        for (int i = 0; i < listaCoches.size(); i++) {
            if (listaCoches.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Coche encontrado");
                encontrado = true;
                System.out.println("Tipo de coche es");
            }
        }
        if (!encontrado) {
            System.out.println("Coche no encontrado");
        }


    }


    public void clasificarCoche(String matricula) {
        boolean encontrado = false;
        for (Coche item : listaCoches) {
            if (matricula.equals(item.getMatricula())) {
                encontrado = true;
                System.out.println("Matricula\t" + item.getMatricula());
                System.out.println("Bastidor\t" + item.getBastidor());
                System.out.println("CV\t" + item.getCv());
                System.out.println("CC\t" + item.getCc());
            }
        }
        if (!encontrado) {
            System.out.println("Coche no encontrado");
        }
    }

}
