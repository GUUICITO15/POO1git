// p69_TablaMultiplicar - Tabla de multiplicar
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p69_TablaMultiplicar {
    public static void Tabla(int t, int n) {
        System.out.printf("\nTabla del %d\n", t);

        for (int i = 1; i <= n; i++)
            System.out.printf("%d x %d = %d\n", t, i, t * i);
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        Scanner sc = new Scanner(System.in);
        int t, n;
        
        System.out.print("Que tabla quieres ? ");
        t = sc.nextInt();
        System.out.print("Hata donde la quieres ? ");
        n = sc.nextInt();
        
        Tabla(t, n);
        
        sc.close();
    }
}
