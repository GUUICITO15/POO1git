package a30Practica_11.p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mini Super El Rodillo", "Urzula Marin Rodriguez", "calle Francisco Mateo num. 145");

        Cliente cliente1 = new Cliente("Juan Manuel", "calle Francisco Mateo num. 163A", "null@gmail.com");
        Cliente cliente2 = new Cliente("Rocio Marce", "calle Francisco Mateo num. 118", "RociMar_@gmail.com");
        Cliente cliente3 = new Cliente("Jose Maria", "calle I. Madero num. 75", "Marijo96@gmail.com");
        Cliente cliente4 = new Cliente("Soledad Mercedez", "calle I. Madero num. 16", "Sol_Marce@yahoo.com.mx");

        tienda.addCliente(cliente1);
        tienda.addCliente(cliente2);
        tienda.addCliente(cliente3);
        tienda.addCliente(cliente4);

        System.out.println("Reporte de clientes sin ventas: " + tienda.toString() + "\n");
        tienda.reporte();

        Venta venta1 = new VentaContado("Manzanas", 2.5, 34, .10, "1/4 de Platano");
        Venta venta2 = new VentaContado("Maruchan", 6, 18, .14, null);
        Venta venta3 = new VentaContado("Jabon", 5, 24, .2, "Shampoo seco");
        Venta venta4 = new VentaContado("Manzanas", 1.2, 34, .08, "1 Platano");
        Venta venta5 = new VentaCredito("Papaya", 1.35, 23, 2, .2);
        Venta venta6 = new VentaCredito("Papas", 7, 23, 3, .12);
        Venta venta7 = new VentaCredito("Leche", 3, 47, 2, .1);
        Venta venta8 = new VentaCredito("Magdalenas", 11, 16.5, 2, .15);


        tienda.getClientes().get(0).addVenta(venta1);
        tienda.getClientes().get(0).addVenta(venta6);
        tienda.getClientes().get(1).addVenta(venta8);
        tienda.getClientes().get(1).addVenta(venta3);
        tienda.getClientes().get(1).addVenta(venta7);
        tienda.getClientes().get(2).addVenta(venta5);
        tienda.getClientes().get(2).addVenta(venta2);
        tienda.getClientes().get(2).addVenta(venta4);

        System.out.println("Reporte de ventas de los clientes: " + tienda.toString() + "\n");
        tienda.reporte();
    }
}
