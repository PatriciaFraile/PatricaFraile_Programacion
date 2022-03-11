package BibliotecaInterfaz;

public enum tiposCD {
    valores("musical"),valores2("monologo"), valores3("educativo");
    String tipos;
    tiposCD(String tipos){
        this.tipos = tipos;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
}
