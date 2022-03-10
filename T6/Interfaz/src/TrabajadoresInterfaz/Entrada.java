package TrabajadoresInterfaz;

public class Entrada {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("ces", 1000000);
        empresa.añadirPersona(new Asalariado("1234A", "Borja", "W", 10000, Departamentos.Comercial, 980));
        empresa.añadirPersona(new Autonomo("12534A", "b", "W", 1000, Departamentos.Fianzas, 56));
        empresa.listarPersonas();
       // empresa.registrarVotacion(//los que están en la comision //(comision)empresa.getPersona().get(2)))
        System.out.println("Los votos de la empresa son : " +empresa.getVotos());
    }
}
