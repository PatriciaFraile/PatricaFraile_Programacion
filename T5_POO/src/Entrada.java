public class Entrada {
    //ambito de clase
    //String nombre = "Borja";

    public static void main(String[] args) {
        //ambito de metodo
        //String nombre = "Borja";
        Usuario usuario1 = new Usuario();
        //nombre = por defecto, password, correo = por defecto , fecha = 18 , apellidos


        Usuario usuario2 = new Usuario();
        //nombre = por defecto, password, correo = por defecto , fecha = 18 , apellidos

        Usuario usuario3 = new Usuario("Borja", "borja.martin@ces.es", "pass");
        //nombre, password, correo , fecha , apellidos
        Usuario usuario4 = new Usuario("borja.martin", "pass", 20);
        /*
        //añadir contraseña al usuario1
        usuario1.password = "contraseña";
        //no se puede hacer
        */
        usuario1.setPassword("contraseña");
        System.out.println(usuario1.getPassword());

        System.out.println("Usuario 3 ");
        System.out.println(usuario3.getNombre());
        System.out.println(usuario3.getCorreoElectronico());
        System.out.println(usuario3.getPassword());



    }
}
