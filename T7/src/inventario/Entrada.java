package inventario;

public class Entrada {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        Carne filete = new Carne("Galicia","Superior",12,"grande");
        filete.calcularPrecio();
        Carne filetePollo = new Carne("Asturias","Inferior",20,"Pequeño");
        filetePollo.calcularPrecio();
        Lacteo leche = new Lacteo("Madrid","Grande",21,33);
        leche.calcularPrecio();
        Silla silla = new Silla("Madera","Pequeño",12,4);
        Supermercado<Alimento>supermercado1 = new Supermercado<>();
        supermercado1.registrarElementos(filete);
        supermercado1.registrarElementos(filetePollo);
        supermercado1.registrarElementos(leche);
        Supermercado<Mueble> supermercado2 = new Supermercado<>();
        supermercado2.registrarElementos(silla);

        Supermercado<Inventariable> supermercado3 = new Supermercado<>();
        supermercado3.registrarElementos(silla);
        supermercado3.registrarElementos(filete);
        supermercado3.registrarElementos(leche);
        supermercado3.PreciosFinales();
        supermercado3.listarCosas();


    }
}
