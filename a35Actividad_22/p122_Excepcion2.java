package a35Actividad_22;

import java.util.Scanner;

public class p122_Excepcion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Dame un valor : ");
            int val = sc.nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es " + val);
        } catch (Exception e) {
            System.out.println("Debes introducir un número");
        }
        
        sc.close();
    }
}
