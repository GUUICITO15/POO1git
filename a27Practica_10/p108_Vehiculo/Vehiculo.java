package a27Practica_10.p108_Vehiculo;

public class Vehiculo {
    protected String Serie, Marca;
    protected int Anio;
    protected double Precio;

    public Vehiculo() {
    }

    public Vehiculo(String serie, String marca, int anio, double precio) {
        Serie = serie;
        Marca = marca;
        Anio = anio;
        Precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", Anio=" + Anio + ", Precio=" + Precio + "]";
    }
}
