package a30Practica_11.p112_ControlVentas;

public class VentaCredito extends Venta{
    private int Meses;
    private double Intereses;

    public VentaCredito(String articulo, double cantidad, double precio, int meses, double intereses) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Intereses = intereses;
    }

    @Override
    double getTotalVenta() {
        return Total + (Total * Intereses * Meses);
    }

    @Override
    public String toString() {
        return "VentaCredito [" + super.toString() + ", Meses=" + Meses + ", Intereses=" +  (Intereses * 100) + "%, Total=" + getTotalVenta() +"]";
    }
}
