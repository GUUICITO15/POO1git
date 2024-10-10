package a27Practica_10.p108_Vehiculo;

public class Compacto extends Vehiculo{
    private int Pasajeros, Puertas;

    public Compacto() {}

    public Compacto(String serie, String marca, int anio, double precio, int pasajeros, int puertas) {
        super(serie, marca, anio, precio);
        Pasajeros = pasajeros;
        Puertas = puertas;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        Puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto [" + super.toString() + ", Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }
}
