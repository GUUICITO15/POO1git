// p50_ConversionTemperaturas - pantilla de trabajo POO en java
// 03 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char resp;
        int centigradosIni, centigradosFin;
        float farenheit;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.print("dame los grandos centigrados de donde comenzaremos: ");
            centigradosIni = sc.nextInt();

            do {
                System.out.print("dame los grandos centigrados de donde terminaremos: ");
                centigradosFin = sc.nextInt();
            } while (centigradosFin < centigradosIni);

            
            System.out.println("------------------------------------------");
            System.out.printf("%-20s %s%n", "Centígrados", "Fahrenheit");
            System.out.println("------------------------------------------");

            do {
                farenheit = (float) centigradosIni * 9.0f / 5.0f + 32.0f;
                System.out.printf("%-20d %.2f%n", centigradosIni, farenheit);
                centigradosIni++;
            } while (centigradosFin >= centigradosIni);

            System.out.println("------------------------------------------");

            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(sc.next().charAt(0));
        } while (resp != 'N');
        
        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
