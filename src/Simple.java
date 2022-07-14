public class Simple extends OfertaPizza{

    private double precioBase;
    private boolean grande;

    @Override
    public double calcularPrecio() {
        double precioFinal = 0;

        if(this.grande==true){
            precioFinal = this.precioBase * 2;
        } else {
            precioFinal = precioBase;
        }

        return precioFinal;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isGrande() {
        return grande;
    }

    public void setGrande(boolean grande) {
        this.grande = grande;
    }

}
