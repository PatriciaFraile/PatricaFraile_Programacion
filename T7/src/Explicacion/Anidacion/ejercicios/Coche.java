package Explicacion.Anidacion.ejercicios;

public class Coche {
    private double precio;
    private String modelo;
    private String marca;
    private int velocidad;
    private Motor motor;

    public Coche(String marca, String modelo, int velocidad) {
        this.precio = 10000;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void mostrarDatos() {
        System.out.println("Precio : " + precio);
        System.out.println("Marca :  " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Velocidad : " + velocidad);
        if (motor != null) {
            this.motor.mostrarDatosMotor();
        } else {
            System.out.println("El coche aún no tiene motor");
        }
    }

    public void accesoMotor() {
        motor.mostrarDatosMotor();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if (motor.cv > 0 && motor.cv <= 50) {
            precio = precio * 1.25;
        } else if (motor.cv > 50 && motor.cv <= 100) {
            precio = precio * 1.40;
        } else if (motor.cv > 100 && motor.cv <= 200) {
            precio = precio * 1.60;
        } else if (motor.cv > 200) {
            precio = precio * 1.80;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    class Motor {
        int cv;
        int cc;

        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }

        public void mostrarDatosMotor() {

            System.out.println("CV : " + cv);
            System.out.println("CC : " + cc);
        }

        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }
    }


}





