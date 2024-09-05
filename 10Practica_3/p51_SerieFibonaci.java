// p51_SerieFibonaci - pantilla de trabajo POO en java
// 03 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.ArrayList;
import java.util.Scanner;

public class p51_SerieFibonaci {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        char resp;
        int auxCont, cantFib;
        ArrayList<Integer> fibonaci = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            do{
                System.out.print("Cuantos numeros de fibonaci quieres ver? ");
                cantFib = sc.nextInt();
            } while (cantFib <= 0);

            fibonaci.add(0);
            fibonaci.add(1);

            if (cantFib > 2) {
                auxCont = 0;
                do {
                    fibonaci.add(fibonaci.get(fibonaci.size() - 1) + fibonaci.get(fibonaci.size() - 2));
                    auxCont++;
                } while (auxCont <= cantFib);
            }
            
            auxCont = 1;
            do {
                System.out.printf("- %d ", fibonaci.get(auxCont - 1));
                auxCont++;
            } while (auxCont <= cantFib);
            System.out.println("-");

            fibonaci.clear();

            while (true){
                System.out.print("\nDeseas continuar (S/N)? ");
                resp = Character.toUpperCase(sc.next().charAt(0));
                if (resp == 'N' || resp == 'S')
                    break;
                else
                    System.out.println("responde con S (si) o N (no)");
            }
        } while (resp != 'N');

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
