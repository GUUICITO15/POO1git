// p78_MedidasLongitud - convierte pulgadas a centímetros y convierte de metros a pies.
// 18 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p78_MedidasLongitud {
    public static Float centimetros(float pulgadas) {
        return pulgadas * 2.54f;
    }
    
    public static Float pies(float metros) {
        return metros * 3.281f;
    }
    
    public static void main(String[] args) {
        char resp;
        float medida;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        while (true) {
            System.out.print("\nDeseas convierta\n(C) pulgadas a centímetros\n(P) metros a pies.? ");
            resp = Character.toUpperCase(sc.next().charAt(0));

            if (resp == 'P' || resp == 'C')
                break;
            else
                System.out.println("responde con P ó C");
        }

        System.out.println("dame la medida: ");
        medida = sc.nextFloat();
        
        if (resp == 'P')
            System.out.println("Pies: " + pies(medida));
        else
            System.out.println("Centimetros: " + centimetros(medida));

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
