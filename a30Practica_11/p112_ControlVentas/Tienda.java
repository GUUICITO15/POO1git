package a30Practica_11.p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {
    private String Nombre, Propietario, Domicilio;
    private ArrayList<Cliente> Clientes;

    public Tienda(String nombre, String propietario, String domicilio) {
        Clientes = new ArrayList<>();
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void addCliente(Cliente cliente) {
        Clientes.add(cliente);
    }

    public double getTotal() {
        double total = 0;
        for (Cliente cliente : Clientes) {
            total += cliente.getTotal();
        }
        return total;
    }

    public void reporte() {
        for (Cliente cliente : Clientes) {
            System.out.println(">> " + cliente.toString());
            for (Venta venta : cliente.getVentas()) {
                System.out.println(venta.toString());
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + ", Total=" + this.getTotal() + "]";
    }
    
    
}
