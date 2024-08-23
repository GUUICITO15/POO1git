// p24_PagaTrabajadorv2 - Calcular la paga de un trabajador, las horas extra se pagan al doble
// 21 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int horas, extra;
        float paga, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando la paga de un trabajador\n");
        System.out.print("¿Dame las horas? ");
        horas = sc.nextInt();
        System.out.print("¿Dame la paga? ");
        paga = sc.nextFloat();
        
        if( horas > 40 ) {
            extra = horas - 40;
            total = (40 * paga) + (extra * paga * 2);
            System.out.printf("\nHoras extra: %d", extra);
        }
        else
            total = horas * paga;
        
        System.out.printf("\nPago total: %.2f", total);
        sc.close();
    }
}
