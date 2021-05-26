package app;

public class BebidaAzucarada extends Bebida {

    private double porcentajeAzucar;
    private boolean promocion; // va ser true por defecto

    public BebidaAzucarada(double cantidad, double precio, String marca, double porcentaje, boolean promocion) {
        super(cantidad, precio, marca);
        this.porcentajeAzucar = porcentaje;
        this.promocion = promocion;
    }

    public double getPorcentaje() {
        return porcentajeAzucar;
    }

    public void setPorcentaje(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public double getPrecio() {
        if (isPromocion()) {
            return super.getPrecio() * 0.9; //le decimos que vamos a realizar un descuento del 10%
        } else {
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPorcenja Azucar : " + porcentajeAzucar + "\nPromocion : " + promocion ;
    }

}
