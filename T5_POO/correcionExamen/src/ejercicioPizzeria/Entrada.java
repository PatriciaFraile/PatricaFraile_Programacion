package ejercicioPizzeria;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        ArrayList<Ingredientes> listaIngredientesMargarita = new ArrayList();
        //añadir ingredientes en listaIngredientesMargarita
        listaIngredientesMargarita.add(new Ingredientes("Jamon", 2));
        Pizza margarita = new Pizza("Borja", listaIngredientesMargarita);
        pizzeria.agregarPedido(margarita);
        pizzeria.servirPizza(1);
        System.out.println(pizzeria.getCaja());
    }

}
