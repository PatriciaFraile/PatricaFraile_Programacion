public enum Equipo {

    //construidos (valores por defecto)
    Barcelona("FCB",12434), Madrid("RM", 34566);

    //variables
    String nombre;
    int presupuesto;

    //constructores
    Equipo(String nombre , int presupuesto){
        this.nombre = nombre;
        this.presupuesto = presupuesto;

    }
    Equipo(){

    }


    //metodos
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(presupuesto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
