package a30Practica_11.p112_ControlVentas;

public abstract class Venta {
    protected String Articulo;
    protected double Cantidad, Precio, Total;

    public Venta(String articulo, double cantidad, double precio) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = Precio * Cantidad;
    }

    abstract double getTotalVenta();

    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + Total + "]";
    }

    
}
