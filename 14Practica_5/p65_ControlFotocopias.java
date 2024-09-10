// p65_ControlFotocopias - lleva un control de las fotocopias que se venden así como los tamaños y costos
// 00 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p65_ControlFotocopias {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int ventas = 0, carta = 0, oficio = 0, doble = 0, hojasTotal, costoTotal;
        char resp, hoja;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");
        System.out.println();

        do {
            ventas++;
            System.out.println("Venta: " + ventas);
            do{
                System.out.print("Tipo de copia (C)arta $3, (O)ficio $4, (D)oble Of. $6: ");
                hoja = Character.toUpperCase(sc.next().charAt(0));
                
                switch (hoja) {
                    case 'C':
                        System.out.print("Cantidad? ");
                        carta += sc.nextInt();
                        break;
                    case 'O':
                        System.out.print("Cantidad? ");
                        oficio += sc.nextInt();
                        break;
                    case 'D':
                        System.out.print("Cantidad? ");
                        doble += sc.nextInt();
                        break;
                    default:
                        System.out.println("Responde C, O ó D, por favor\n");
                        break;
                }
            } while (hoja != 'C' && hoja != 'O' && hoja != 'D');

            while (true) {
                System.out.print("Otra venta (S/N)? ");
                resp = Character.toUpperCase(sc.next().charAt(0));
                if (resp == 'N' || resp == 'S')
                    break;
                else
                    System.out.println("responde con S (si) o N (no)");
            }
            System.out.println();
        } while (resp != 'N');

        hojasTotal = carta + oficio + doble;
        costoTotal = (carta * 3) + (oficio * 4) + (doble * 6);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Ventas realizadas: " + ventas);
        System.out.println("---------------------------------");
        System.out.printf("Carta      : %-6d - $%d\n", carta, (carta * 3));
        System.out.printf("Oficio     : %-6d - $%d\n", oficio, (oficio * 4));
        System.out.printf("Doble Of.  : %-6d - $%d\n", doble, (doble * 6));
        System.out.println("---------------------------------");
        System.out.printf("Tot. Ventas: %-6d - $%d\n", hojasTotal, costoTotal);
        System.out.println();

        System.out.print("Esta venta es una: ");
        if (costoTotal < 50)
            System.out.println("Venta moderada");
        else if (costoTotal >= 50 && costoTotal <= 100)
            System.out.println("Venta frecuente");
        else if (costoTotal > 100)
            System.out.println("Venta superada");

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
