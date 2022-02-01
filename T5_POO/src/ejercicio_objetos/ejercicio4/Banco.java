package ejercicio_objetos.ejercicio4;

import java.util.ArrayList;

public class Banco {
    private String nombre, cif;
    private ArrayList<Cuenta> conjuntoCuentas;

    public Banco() {
        this.nombre = nombre;
        this.cif = cif;
        this.conjuntoCuentas = new ArrayList();
    }

    public void crearCuenta(Cuenta cuenta) {
        conjuntoCuentas.add(cuenta);
        int ISBN = ((int) Math.random() * 10000) + 1;
    }

    public void cancelarCuenta(String dni, int pin) {
        boolean encontrada = false;
        for (int i = 0; i < conjuntoCuentas.size(); i++) {
            if (conjuntoCuentas.get(i).permitirAcceso(dni, pin)) {
                conjuntoCuentas.remove(i);
                encontrada = true;
            }
            if (!encontrada) {
                System.out.println("No encontrado");
            }

        }


    }

    public void listarCuentas() {

        if (conjuntoCuentas.size() > 0) {

            for (Cuenta cuenta : conjuntoCuentas) {
                System.out.println("Impimiendo cuenta *****");
                cuenta.verResumen(cuenta.getDni(), cuenta.getPin());
            }

            System.out.println("Cuentas impresas");
        } else {
            System.out.println("No hay cuentas para mostrar");
        }


    }

    public void listaCuentasCliente(String dni) {

        for (Cuenta cuenta : conjuntoCuentas) {
            if (cuenta.getDni().toLowerCase().equals(dni.toLowerCase())) {
                cuenta.verResumen(cuenta.getDni(), cuenta.getPin());
            }
        }

    }

}



