// p88_Aleatorios - Genera números aleatorios
// 23 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Random;

public class p88_Aleatorios {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Random rnd = new Random();

        int aleatorio1 = Math.abs(rnd.nextInt());
        int aleatorio2 = Math.abs(rnd.nextInt(30));
        int aleatorio3 = Math.abs(rnd.nextInt(50)) + 50;
        
        System.out.printf("\nNúmero aleatorio entero positivo : %d", aleatorio1);
        System.out.printf("\nNúmero aleatorio 0 ..30 : %d", aleatorio2);
        System.out.printf("\nNúmero aleatorio en el rango de 50 a 99 : %d", aleatorio3);

        System.out.println("\n\nProceso terminado...");
    }
}
