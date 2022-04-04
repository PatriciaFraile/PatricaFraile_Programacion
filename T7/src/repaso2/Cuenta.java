package repaso2;

public class Cuenta {
    private String id;
    private int pin, saldo;

    public Cuenta() {
    }

    public Cuenta(String id, int pin, int saldo) {
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta c) {
        id = c.id;
        pin = c.pin;
        saldo = c.saldo;
    }

    public void ingresarDinero(int dinero) {
        saldo = this.saldo + dinero;
    }

    public void sacarDinero(int dinero) {
        saldo = this.saldo - dinero;
        System.out.println(saldo);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
