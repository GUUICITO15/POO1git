// p05_OperacionesMatematicas - hace diferntes operaciones a los mismos valores
// 15 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p05_OperacionesMatematicas {
    
    public static void main(String[] args) {
        double x, y, suma, resta, mult, div, res, pot;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame el primer valor: ");
        x = sc.nextDouble();
        System.out.print("Dame el segundo valor: ");
        y = sc.nextDouble();
        
        suma = x + y;
        resta = x - y;
        mult = x * y;
        div = x / y;
        res = x % y;
        pot = Math.pow(x, y);
        
        System.out.println(String.format("Los numeros son %.2f y %.2f", x, y));
        System.out.println(String.format("la suma es:\t\t%.2f", suma));
        System.out.println(String.format("la resta es:\t\t%.2f", resta));
        System.out.println(String.format("la multiplicacion es:\t%.2f", mult));
        System.out.println(String.format("la divicion es:\t\t%.2f", div));
        System.out.println(String.format("la resto es:\t\t%.2f", res));
        System.out.println(String.format("la potencia es:\t\t%.2f", pot));
    }
    
}