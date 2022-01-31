package ejercicio_objetos.ejercicio6;

public class Coche {
    private int caballos , velocidad;
    private String matricula, modelo;
    private double kilometros,calcularKilometro ;

    public Coche() {
        this.caballos = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "sin especificar";
        this.kilometros = 0.0;
    }

    public Coche(String modelo, String matricula, int caballos) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.caballos = caballos;
    }

    public void acelerarCoche(int acelerar) {
        this.velocidad = acelerar;
        this.calcularKilometro = (this.velocidad * (this.caballos * Math.random() * 11)+1);
        if (velocidad > 180) {
            System.out.println("Te pasaste de velocidad");
        }
    }

    public void frenarCoche(int frenar) {
        this.velocidad = frenar;
        if (velocidad < 0) {
            System.out.println("Te pasaste de velocidad mínima");
        }
    }

    public void pararCoche() {
        this.velocidad = 0;

    }

    public void resetear() {
        this.velocidad = 0;
        this.kilometros = 0;

    }

    public void mostrarDatos() {
        System.out.println("Matricula\t" + matricula);
        System.out.println("Modelo\t" + modelo);
        System.out.println("Caballos\t" + caballos);
        System.out.println("Velocidad\t" + velocidad);
        System.out.println("Kilometros\t" + kilometros);

    }


    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
       this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }
}
