package a23Practica_8.p100_Articulo;

import java.text.DecimalFormat;

public class Articulo {
    private String id, desc;
    private int cant;
    private double precioUnit;

    public Articulo(String id, String descripcion, int cantidad, double precioUnit) {
        this.id = id;
        this.desc = descripcion;
        this.cant = cantidad;
        this.precioUnit = precioUnit;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setCant(int cantidad) {
        this.cant = cantidad;
    }

    public int getCant() {
        return cant;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public double getTotal() {
        return precioUnit * cant;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.##");
        return String.format("Articulo [Id=%s, Desc=%s, Cant=%d, PrecioUnit=%s]", id, desc, cant, df.format(precioUnit));
    }
}
