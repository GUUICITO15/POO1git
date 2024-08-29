// p39a_Numeros1a100 - Imprimir los números de 1 a 100
// 28 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

public class p39a_Numeros1a100 {
    public static void main(String [] args){
        int num = 0;

        do {
            num++;
            System.out.printf("%03d ", num );
            if (num % 10 == 0) System.out.println();
        } while (num < 100);

        System.out.println("\n\nProceso terminado...");
    }
    
}
