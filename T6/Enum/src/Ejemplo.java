public class Ejemplo {
    //utilizar la clase de enum

    Equipo equipo = Equipo.Madrid;
    Equipo equipo1 = Equipo.Barcelona;

    public void mostrarConjunto(){
        equipo.mostrarDatos();
    }

    public void mostrarDatos(){
        System.out.println(equipo.nombre);
        System.out.println(equipo.name()); //name traducirlo al String
    }
}
