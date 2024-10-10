package a27Practica_10.p108_Vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        double sumPrecios = 0;
        Vehiculo compacto1 = new Compacto("CP1992200", "Ford", 2020, 1885000, 5, 4);
        Vehiculo compacto2 = new Compacto("CA2334511", "Fiat", 2024, 452000, 4, 2);
        Vehiculo camioneta1 = new Camioneta("CT6554432", "Ford", 2016, 748000, 1.5, 4);
        Vehiculo camioneta2 = new Camioneta("CM2344542", "Ram", 2025, 3482000, 3.5, 4);


        System.out.println("Datos de los vehiculos de la flota\n");
        System.out.println(compacto1);
        System.out.println(compacto2);
        System.out.println(camioneta1);
        System.out.println(camioneta2);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(compacto1);
        vehiculos.add(compacto2);
        vehiculos.add(camioneta1);
        vehiculos.add(camioneta2);

        System.out.println("\nCalculando el total de precio de todos los vehiculos...");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getPrecio());
            sumPrecios += vehiculo.getPrecio();
        }

        System.out.println("La suma es: " + sumPrecios);
    }
}
