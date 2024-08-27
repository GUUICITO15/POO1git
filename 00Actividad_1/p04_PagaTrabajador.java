// p04_PagaTrabajador - Calcula el monto a pagar a un empleado
// 14 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p04_PagaTrabajador{
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagaBruta, pagaNeta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del Trabajador: ");
        nombre = sc.nextLine();
        System.out.print("Horas Trabajadas: ");
        horas = sc.nextInt();
        System.out.print("Paga X Hora: ");
        paga = sc.nextFloat();
        tasa = 0.03;

        pagaBruta = horas * paga;
        impuesto = pagaBruta * tasa;
        pagaNeta = pagaBruta - impuesto;

        System.out.println("\nResumen de Pagos\n");
        System.out.println(String.format(
                "El Trabajador %s, trabajo: %dhrs., con una paga de $%.2f por hora, con una tasa de impuesto de %.2f",
                nombre, horas, paga, tasa
                ));
        System.out.println(String.format("Paga Bruta        =%.2f", pagaBruta));
        System.out.println(String.format("Impuesto        =%.2f", impuesto));
        System.out.println(String.format("Paga Neta        =%.2f", pagaNeta));
        sc.close();
    }
}
