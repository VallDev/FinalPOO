public class OfertaPizzaFactory {

    private static OfertaPizzaFactory instance = new OfertaPizzaFactory();

    private OfertaPizzaFactory(){};

    public static OfertaPizzaFactory getInstance(){
        return instance;
    }

    public OfertaPizza crearOfertaPizza(String tipoPizza){
        OfertaPizza opCreada = null;

        if(tipoPizza.equals("simple")){
            opCreada = new Simple();
        }
        if(tipoPizza.equals("combinada")){
            opCreada = new Combinada();
        }

        return opCreada;
    }
}
