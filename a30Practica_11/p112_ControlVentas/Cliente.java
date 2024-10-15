package a30Practica_11.p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
    private String Nombre, Domicilio, Correo;
    ArrayList<Venta> Ventas;

    public Cliente(String nombre, String domicilio, String correo) {
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
        Ventas = new ArrayList<>();
    }

    public void addVenta(Venta venta) {
        Ventas.add(venta);
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public double getTotal() {
        double total = 0;
        for (Venta venta : Ventas) {
            total = venta.getTotalVenta();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Ventas=" + Ventas.size() + ", Total=" + this.getTotal() + "]";
    }
}
