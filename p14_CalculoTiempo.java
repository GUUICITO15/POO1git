// p13_VolumenCilindro - Dada una cantidad de horas, calcula su equivalente en días, minutos y segundos.
// 19 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double dias;
        int hrs, mins, seg;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame las horas a convertir: ");
        hrs = sc.nextInt();

        seg = hrs * 3600;
        mins = hrs * 60;
        dias = hrs / 24.00;

        System.out.println(String.format("%d hrs. equivalen a %d segundos, %d minutos y a %.2f días", hrs, seg, mins, dias));
        sc.close();
    }
}
