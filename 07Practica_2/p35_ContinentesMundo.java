// p35_ContinentesMundo - Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre
// 26 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        int continente;

        System.out.println("Dado un numero entre 1 y 6 imprime el continente correspondiente\n");

        System.out.print("Dame el continente con número: ");
        continente = sc.nextInt();

        switch (continente) {
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("África");
                break;
            case 3:
                System.out.println("América");
                break;
            case 4:
                System.out.println("Antártida");
                break;
            case 5:
                System.out.println("Europa");
                break;
            case 6:
                System.out.println("Oceanía");
                break;
            default:
                System.out.println("Continente inválido");
                break;
        }

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}