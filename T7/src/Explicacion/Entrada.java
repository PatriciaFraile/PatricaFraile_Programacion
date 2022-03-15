package Explicacion;


public class Entrada {
    public static void main(String[] args) {
        ClaseC claseC = new ClaseC();
        ClaseB claseB = new ClaseB();
        ClaseA claseA = new ClaseA() {
            @Override
            public void mostrarDatos() {
                System.out.println("Comportamiento diferente");
            }

            @Override
            public void mensajeAbstracto() {
                System.out.println("El mensaje abstracto de la clase A");
            }
        };
        ClaseA claseA1 = new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("Mnesaje abs diferente");
            }
        };
        claseC.registrarMensaje(claseA);
        claseC.registrarMensaje(claseA1);
        claseC.registrarMensaje(new ClaseA() {
            //no lo va utilizar nadie
            //anonima
            @Override
            public void mensajeAbstracto() {
                System.out.println("Mensaje desde una anonima 100%");
            }
        });
        claseC.registrarMensaje(claseA);
        claseC.modificar("este es el mensaje que quiero modificar", new Modificables() {
            @Override
            public void lanzarMayusculas(String s) {
                System.out.println(s.toUpperCase());
            }

            @Override
            public void lanzarMinusculas(String s) {
                System.out.println(s.toLowerCase());

            }
        });
    }
}
