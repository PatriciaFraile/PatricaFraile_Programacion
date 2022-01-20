package ejercicio_objetos.ejercicio1;

public class Coche {
    private String marca, modelo;
    private Motor motor;
    private double precioAcumulado;

    public Coche(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void acumularAveria(double acumulado) {
        this.precioAcumulado += acumulado;
    }

    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    public void setPrecioAcumulado(double precioAcumulado) {
        this.precioAcumulado = precioAcumulado;
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

    public  Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
