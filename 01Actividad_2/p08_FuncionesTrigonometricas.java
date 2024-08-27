// p08_FuncionesTrigonometricas - calcula el sen, cos y tan, de  un angulo en radianes
// 15 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p08_FuncionesTrigonometricas {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        double angulog;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un angulo en Grados: ");
        angulog = sc.nextDouble();

        double anguloR = Math.toRadians(angulog);
        double sen = Math.sin(anguloR);
        double cos = Math.cos(anguloR);
        double tan = Math.tan(anguloR);
        
        System.out.println(String.format(
            "El angulo es: %.2f\nSeno: %.2f\nCoseno: %.2f\\nTangente: %.2f", anguloR, sen, cos, tan
        ));
        
        sc.close();
    }
    
}