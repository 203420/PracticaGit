public class Pago_Efectivo {
    private double costo_total;
    private int pago;
    private double cambio;

    public void setCosto(double costo_total){
        this.costo_total=costo_total;
    }
    public double getCosto(){
        return costo_total;
    }
    public void setPago(int pago){
        this.pago=pago;
    }
    public int getPago(){
        return pago;
    }
    public double getCambio(){
        cambio=((double)Math.round(cambio * 100d) / 100d); //Limita decimales del valor del cambio.
        return cambio;
    }
    public void realizarPago(){
        if(pago>costo_total){
            cambio=pago-costo_total;
        }
    }
}