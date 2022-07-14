import java.util.ArrayList;
import java.util.List;

public class Combinada extends OfertaPizza{

    private List<OfertaPizza> lasPizzas = new ArrayList<OfertaPizza>();

    public void agregarPizza(OfertaPizza op){
        lasPizzas.add(op);
    }


    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        int contadorPizzas = 0;

        for (OfertaPizza op: lasPizzas) {
            precioTotal += op.calcularPrecio();
            contadorPizzas++;
        }

        return precioTotal/contadorPizzas;
    }
}
