package ejercicios_objetos.EjercicioObjeto_eje1;

public class Motor {
    private int litros;
    private int cv;

    public Motor (int cv){
        this.litros = 0;
        this.cv = cv;
    }

    public Motor (int cv,int litros){
        this.litros = litros;
        this.cv = cv;
    }

    public int getLitros() {
        return litros;
    }
    public void setLitros(int litros) {
        this.litros = litros;
    }
    public int getCv() {
        return cv;
    }
}
