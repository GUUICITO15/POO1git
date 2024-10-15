package a30Practica_11.p112_ControlVentas;

public class VentaContado extends Venta {
    private double Descuento;
    private String Regalo;

    public VentaContado(String articulo, double cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio);
        Descuento = descuento;
        Regalo = regalo;
    }

    @Override
    double getTotalVenta() {
        return Total - (Total * Descuento);
    }

    @Override
    public String toString() {
        return "VentaContado [" + super.toString() + ", Descuento=" +  (Descuento * 100) + "%, Regalo=" + Regalo + ", Total=" + getTotalVenta() +"]";
    }

    
}
