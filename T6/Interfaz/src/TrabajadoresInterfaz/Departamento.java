package TrabajadoresInterfaz;

public enum Departamento {
    ;
    int fianzas, ventas, it, comercial;

    Departamento() {
    }

    public void Departamento(int fianzas, int ventas, int it, int comercial) {
        this.fianzas = fianzas;
        this.ventas = ventas;
        this.it = it;
        this.comercial = comercial;
    }

    public int getFianzas() {
        return fianzas;
    }

    public void setFianzas(int fianzas) {
        this.fianzas = fianzas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public int getComercial() {
        return comercial;
    }

    public void setComercial(int comercial) {
        this.comercial = comercial;
    }
}
