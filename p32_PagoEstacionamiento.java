// p32_PagoEstacionamiento - Administra el pago por estacionamiento de acuerdo a la Zona
// 26 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p32_PagoEstacionamiento {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int op;
        float tasa = 0, pago = 0, impuesto = 0, total = 0;
        String salida = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Administra el pago por estacionamiento de acuerdo a la Zona\n");

        System.out.println("1 - Estacionamiento Tacuba 3%");
        System.out.println("2 - Estacionamiento Portales 5%");
        System.out.println("3 - Estacionamiento Conquistadores 10%");
        System.out.println("4 - Estacionamiento Pajaros Caidos 15%");

        System.out.print("Elige opción ? ");
        op = sc.nextInt();
        System.out.print("Pago efectuado ? ");
        pago = sc.nextFloat();

        switch (op) {
            case 1:
                tasa = 0.03f;
                break;
            case 2:
                tasa = 0.05f;
                break;
            case 3:
                tasa = 0.10f;
                break;
            case 4:
                tasa = 0.15f;
                break;
            default:
                System.out.println("Opción Inválida !!!");
                break;
        }

        impuesto = pago * tasa;
        total = pago + impuesto;
        salida = String.format("\nElegiste el estacionamiento %d \n" +
        "Pagaste %.2f por el tiempo de uso \n" +
        "Corresponde un impuesto de %,.2f \n" +
        "El pago total es de %,.2f", op, pago, impuesto, total);
        
        System.out.println(salida);

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
