package ejercicio_objetos.ejercicio10;

public class Persona {
    private String nombre, DNI;
    private final static char sexo_def = 'H';
    private final static int pesoIdeal = 0;
    private final static int infraPeso = -1;
    private final static int sobrePeso = 1;

    private char sexo;
    private double peso, altura;
    private int edad;
    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre ="Por defecto";
        this.edad = 0 ;
        this.sexo = 0;

    }

    public Persona(String nombre, char sexo, double peso, double altura, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        comprobarSexo();
    }

    public void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexo_def;
        }
    }
    public int calcularIMC(){
        double pesoActual = peso/(Math.pow(altura,2));
        if(pesoActual<20){
            return infraPeso;
        }
        else if(pesoActual>=20 && pesoActual<=25){
            return pesoIdeal;
        }
        else {
            return sobrePeso;
        }
    }

    public   void muestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.pesoIdeal:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.infraPeso:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.sobrePeso:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
    }
    }

    public  void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

    public boolean esMayorEdad(){
        boolean mayor = false;
        if(edad>=18){
            mayor= true;
        }
        return mayor;
    }
    public String toString(){
        String sexo;
        if(this.sexo=='H'){
            sexo= "Hombre";
        }
        else{
            sexo = "Mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
