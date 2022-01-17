package ejercicios_objetos.EjercicioObjeto_eje1;

public class motor {
    private int litrAceite, CV, motor;
    private String marca, modelo;
    private double precioAcumulado;

    public motor() {
        CV = 12;
        litrAceite = 0;
    }
    public  motor(String modelo , String marca){
        this.modelo= modelo;
        this.marca= marca;
    }
    public void importeGastado(double acumulado){
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

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public int getLitrAceite() {
        return litrAceite;
    }

    public void setLitrAceite(int litrAceite) {
        this.litrAceite = litrAceite;
    }
}
