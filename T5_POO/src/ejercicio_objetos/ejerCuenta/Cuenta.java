package ejercicio_objetos.ejerCuenta;

public class Cuenta {
    public String nombre, numCuenta;
    public double interes, saldo;

    public Cuenta() {

    }

    public Cuenta(String nombre, String numCuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta c) {
        nombre = c.nombre;
        numCuenta = c.numCuenta;
        interes = c.interes;
        saldo = c.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingresar(double n){
        boolean operación = true;
        if(n<0){
            operación = false;
        }else{
            saldo = saldo+n;

        }
        return operación;
    }
    public boolean reintegro(double n){
        boolean operacion = true;
        if(n<0){
            operacion = false;
        }
        else{
            saldo = saldo - n;
        }
        return operacion;
    }
    public boolean transferencia(Cuenta c , double n){
        boolean correcto = true;
        if(n<0){
            correcto= false;
        }
        else if(n>=0){
            reintegro(n);
            c.ingresar(n);
        }else{
            correcto = false;
        }
        return correcto;

    }

}
