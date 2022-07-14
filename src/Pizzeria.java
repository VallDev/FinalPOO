import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<OfertaPizza> ofertaPizzas = new ArrayList<OfertaPizza>();

    public void agregarOfertaPizza(OfertaPizza op){
        ofertaPizzas.add(op);
    }

    public void mostrarInforme(){
        System.out.println("\n\nLa pizzería: Pizza Loca, cuenta con el siguiente catálogo de pizzas:");
        for (OfertaPizza op: ofertaPizzas) {
            if(op instanceof Simple){
                System.out.println("\nSimple:");
                if(((Simple) op).isGrande()){
                    System.out.print("Pizza Grande ->");
                } else {
                    System.out.print("Pizza Chica ->");
                }
            }else {
                System.out.println("\nCombinada:");
            }
            System.out.print(op.getNombre());
            System.out.print("  con precio -->   ");
            System.out.print(op.calcularPrecio());
            System.out.print("  pesos");
        }
    }
}
