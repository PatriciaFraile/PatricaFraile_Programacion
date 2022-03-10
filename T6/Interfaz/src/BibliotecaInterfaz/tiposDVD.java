package BibliotecaInterfaz;

public enum tiposDVD {
  pelicula1("intriga"),pelicula2("terror"), pelicula3("comedia") , pelicula4("drama");
    String tipo;

    tiposDVD(String tipo){
        this.tipo = tipo;
    }
    public void mostrarrDatos(){
        System.out.println(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
