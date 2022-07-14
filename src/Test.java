public class Test {

    public static void main(String[] args) {
        //Se crea el objeto principal de la pizzeria
        Pizzeria pizzaLoca = new Pizzeria();

        //Se crean las diferentes pizzas simples
        Simple muzzarella = (Simple) OfertaPizzaFactory.getInstance().crearOfertaPizza("simple");
        muzzarella.setNombre("Muzzarella");
        muzzarella.setPrecioBase(700);
        muzzarella.setGrande(false);

        Simple especial = (Simple) OfertaPizzaFactory.getInstance().crearOfertaPizza("simple");
        especial.setNombre("Especial");
        especial.setPrecioBase(850);
        especial.setGrande(false);

        Simple anana = (Simple) OfertaPizzaFactory.getInstance().crearOfertaPizza("simple");
        anana.setNombre("Ananá");
        anana.setPrecioBase(950);
        anana.setGrande(false);

        //Se crea la pizza de peperoni para probar el método cuando la pizza es grande
        Simple peperoni = (Simple) OfertaPizzaFactory.getInstance().crearOfertaPizza("simple");
        peperoni.setNombre("Peperoni");
        peperoni.setPrecioBase(800);
        peperoni.setGrande(true);


        //Se crea la pizza combinada y se agregan las pizzas simples correspondientes
        Combinada combinadaLoca = (Combinada) OfertaPizzaFactory.getInstance().crearOfertaPizza("combinada");
        combinadaLoca.setNombre("Combinada Loca");
        combinadaLoca.agregarPizza(especial);
        combinadaLoca.agregarPizza(anana);

        //Se agregan todas las pizzas creadas al catálogo de pizzas que ofrece Pizza Loca
        pizzaLoca.agregarOfertaPizza(muzzarella);
        pizzaLoca.agregarOfertaPizza(especial);
        pizzaLoca.agregarOfertaPizza(anana);
        //Se agrega la pizza de prueba de peperoni para poder mostrarla en pantalla
        pizzaLoca.agregarOfertaPizza(peperoni);

        pizzaLoca.agregarOfertaPizza(combinadaLoca);


        //Se muestran en pantalla todas las pizzas que dispone el sistema y restaurante
        pizzaLoca.mostrarInforme();

    }
}
