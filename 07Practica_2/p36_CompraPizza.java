// p36_CompraPizza - Procesa un pedido de pizza, calculando el coste y el descuento, dado el tamaño y la cantidad
// 27 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        int chica = 0, mediana = 0, grande = 0, cantidad = 0, costoSub;
        Float descuento = 0.15f, costoTotal;
        char tamano;
        
        while (true){
            System.out.println("¿que tamaño quieres de pizza?\n");
            System.out.println("[C]hica\t\t-\t$5");
            System.out.println("[M]ediana\t-\t$10");
            System.out.println("[G]rande\t-\t$20");
            System.out.println("[N]ada más\n");
            tamano = Character.toUpperCase(sc.next().charAt(0));

            if (tamano == 'N') {
                if (chica == 0 && mediana == 0 && grande == 0) {
                    System.out.println("\nAún no has pedio\n");
                    continue;
                } else 
                    System.out.println("\033[H\033[2JGracias por tu pedido\n");
                    break;
            } else {
                System.out.print("\n¿cuantas pizzas querras? ");
                cantidad = sc.nextInt();
                System.out.println("\nEntendido, ¿quieres de otro tamaño más?");
            }
            
            switch (tamano) {
                case 'C':
                    chica = cantidad;
                    break;
                case 'M':
                    mediana = cantidad;
                    break;
                case 'G':
                    grande = cantidad;
                    break;
                default:
                    System.out.println("\nTamaño invalido...\n");
                    break;
            }
        }


        costoSub = chica * 5 + mediana * 10 + grande * 20;

        if (costoSub >= 2000)
            costoTotal = costoSub - (costoSub * descuento);
        else
            descuento = 0f;
            costoTotal = (float) costoSub;
        
        System.out.printf("\nSubTotal:\t%d\nDescuento:\t%s\nTotal:\t\t%.2f\n", costoSub, ((int) ((descuento) * 100) + " %"), costoTotal);

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
