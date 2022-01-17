package ejercicios_objetos.EjercicioObjeto_eje1;

public class Garaje {
    private Coche Micoche;
    private String averiaAsociada;
    private int numCoches;

    public void Garaje() {
        this.Micoche = null;
        this.averiaAsociada = " ";
        this.numCoches = 0;
    }

    public boolean Atender () {
        if (numCoches == 1) {
            System.out.println("Ya estamos atendiendo un coche ");
            return false;
        } else {
            System.out.println("Podemos aceptar su coche");
            return true;
        }
    }
    public void atenderCoche(Coche coche , String descAveria){
        if(Atender()==true){
            System.out.println("Podemos aceptar su coche");
            this.Micoche=coche;
            this.averiaAsociada= descAveria;
            if(this.averiaAsociada.equalsIgnoreCase("aceite")){//incompleto
                Micoche.getMotor().getLitros();
                this.MiCoche.getMotor().setLitros(litros+10);
            }else{

            }
        }
    }

    public void devolverCoche() {
        this.numCoches = 0;
        System.out.println("Hemos devuelto su coche");
    }

}
