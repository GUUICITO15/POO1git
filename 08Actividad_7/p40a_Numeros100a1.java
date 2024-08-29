// p40a_Numeros100a1 -  Imprimir los números de 100 a 1
// 28 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

public class p40a_Numeros100a1 {
    public static void main(String [] args){
        int num = 100;

        do {
            System.out.printf("%03d ", num-- );
            if (num % 10 == 0) System.out.println();
        } while (num > 0);

        System.out.println("\n\nProceso terminado...");
    }
    
}
