package ArrayList;

public class GenerarPalabras {
    //Sacar el usuario de un correo

    public static void main(String[] args) {
        String correo ="Alejandra.martinez@gmail.com";
        System.out.println(correo.substring(0,12));
        System.out.println(correo.substring(13,35));
        correo.indexOf("@");
        String nombre = correo.substring(0,correo.indexOf("@"));
        System.out.println(nombre);
        String dominio = correo.substring(correo.indexOf("@")+1, correo.length());
        System.out.println(dominio);
    }
}
