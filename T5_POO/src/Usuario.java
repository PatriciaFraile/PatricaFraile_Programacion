public class Usuario {
    //variables siempre tienen que ser privadas
    private String correoElectronico, nombre, apellido, password, fecha;
    private int edad;


    //constructores
    //si no hay constructores escritos , hay un constructor que es el vacio (por defecto)
    //este deja de existir cuando se escribe algun contructor
    public Usuario() {
        nombre = "Por defecto";
        correoElectronico = "por defecto";
        edad = 18;

    }

    public Usuario(String nombre, String correoElectronico, String pasword) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;

    }

    public Usuario(String correoElectronico, String password, int edad) {
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }


    //metodos
    public void mostrarDatos(){
        System.out.println("Nombre" +nombre);
        System.out.println("Password" +password);
        System.out.println("Edad" +edad);
        System.out.println("Gmail" +correoElectronico);
        System.out.println("Apellido" +apellido);
        System.out.println("Fecha" +fecha);
    }
    public String mostrarDatosRetorno(){
        return  "Nombre" +nombre+"\n"+"Apellidos"+apellido+"\n";

    }
    public void saludar(String nombreSaludar){
        System.out.println("Hola"+nombreSaludar+"que tal estas");
    }
    public void saludar(Usuario usuario){
        System.out.println("Hola"+usuario.getNombre()+"que tal estas");

    }

    //metodos especiales getters y setters
    public String getPassword(){
        return password;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public String getFecha(){
        return fecha;
    }
    // establecer
    public void setPassword(String password) {
        this.password = password;
    }
}

