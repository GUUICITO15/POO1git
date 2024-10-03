package a24Actividad_16.p103_ClienteFactura;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static Factura llenar() {
        Scanner sc = new Scanner(System.in);
        Factura f = new Factura();
        Cliente c = new Cliente();

        System.out.println("Id es : ");
        f.setId(sc.nextInt());
        System.out.println("Monto es : ");
        f.setMonto(sc.nextInt());
        System.out.println("Id del Cliente es : ");
        c.setId(sc.nextInt());sc.nextLine();
        System.out.println("El Nombre del Cliente es : ");
        c.setNombre(sc.nextLine());
        System.out.println("Descuento del cliente es : ");
        c.setDescuento(sc.nextFloat());
        f.setCliente(c);

        return f;
    }

    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();

        Factura f1 = new Factura(1, 1500, new Cliente(1, "Juan Perez", 0.03f));
        Factura f2 = new Factura(2, 2300, new Cliente(1, "Maria Lopez", 0.01f));

        facturas.add(f1);
        facturas.add(f2);

        Factura f3 = new Factura();
        f3 = llenar();

        System.out.print("\033[H\033[2J");

        System.out.println("Mi factura es: " + f3);
        facturas.add(f3);

        Factura f4 = new Factura();
        f4 = llenar();

        System.out.println("Mi factura es: " + f4);
        facturas.add(f4);

        for (Factura factura : facturas) {
            System.out.println("Id es : " + factura.getId());
            System.out.println("Cliente es : " + factura.getCliente());
            System.out.println("Monto es : " + factura.getMonto());
            System.out.println("Cliente Id es : " + factura.getCliente().getId());
            System.out.println("Cliente Nombre es : " + factura.getCliente().getNombre());
            System.out.println("Cliente Descuento es : " + factura.getCliente().getDescuento() + "%");
        }
    }
}
