package Explicacion.Excepciones.Inventario;

public class Entrada {
    public static void main(String[] args) {
        Silla silla = new Silla("Roble",5,100,4);
        silla.mostrarDatos();
        silla.calcularPrecio();

        Carne filete = new Carne("Origen", "Galicia",100,4);
        filete.mostrarDatos();
        filete.calcularPrecio();

        Mesa mesa = new Mesa("Roble",20,300,6);
        mesa.calcularPrecio();
        Lacteo leche = new Lacteo("Premium","Galicia",50,100);
        leche.calcularPrecio();

        Supermercado<Alimento> supermercadoAlimentos = new Supermercado<>();
        supermercadoAlimentos.anadirGenero(filete);
        supermercadoAlimentos.anadirGenero(leche);
        supermercadoAlimentos.mostrarPrecioFinal();

        Supermercado<Mueble>supermercadoMueble = new Supermercado<>();
        supermercadoMueble.anadirGenero(silla);
        supermercadoMueble.anadirGenero(mesa);
        supermercadoMueble.mostrarPrecioFinal();

        Supermercado<Inventariable>inventariableSupermercado = new Supermercado<>();
        inventariableSupermercado.anadirGenero(silla);
        inventariableSupermercado.anadirGenero(leche);
        inventariableSupermercado.anadirGenero(mesa);
        inventariableSupermercado.listarDatos();
        inventariableSupermercado.mostrarPrecioFinal();
    }
}
