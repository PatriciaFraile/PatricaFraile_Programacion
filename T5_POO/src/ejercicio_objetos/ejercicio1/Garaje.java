package ejercicio_objetos.ejercicio1;

public class Garaje {
    private  Coche coche;
    private String averia;
    private int numCoches;

    public boolean aceptarCoche(Coche coche , String averia){
        if(this.coche!=null){
            return false;
        }else{
            this.coche=coche;
            if(averia.equalsIgnoreCase("aceite")){
                coche.getMotor().setLitros(coche.getMotor().getLitros()+10);
            }
            numCoches++;
            return true;
        }
    }
    public void devolverCoche(){
        this.coche=null;
    }
}
