// p17_TrabajandoFlotantes - Trabajando con números flotantes
// 21 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

public class p17_TrabajandoFlotantes {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        float num1 = 423.45f;
        float num2 = 123f;
        float num3 = 1.94e-8f;
        double num4 = 1232312321.434343d;
        double num5 = .3456;

        System.out.println("\nUso de String.format para formateo de números flotantes: ");
        System.out.printf("\n\tnum1 y num2 en formato flotante: %f %f",num1,num2);
        System.out.printf("\n\tnum1 y num2 en formato flotante con decimales: %.2f %.3f",num1,num2);
        System.out.printf("\n\tnum1 alineado en formato flotante alineado: %10.2f",num1);
        System.out.printf("\n\tnum1 alineado en formato flotante alineado: %10.2f",num2);
        System.out.printf("\n\tnum3 en formato exponencial: %e",num3);
        System.out.printf("\n\tnum3 en formato exponencial cifras: %.3e",num3);
        System.out.printf("\n\tnum 4 con separador de miles y decimales: %,.2f", num4);
        System.out.printf("\n\tnum 5 en formato flotante: %f", num5);

        System.out.println("\n\nUso de System.out.prinf para dar formato a números flotantes: ");
        System.out.printf("\n\tnum1, num2 en formato floante: %f %f \n", num1,num2);
        System.out.printf("\tnum3, num4 en formato flotante con decimales: %.2f %.2f \n", num3,num4);
        System.out.printf("\tnum4, num5 en formato exponencial: %e %e \n", num4,num5);
        System.out.printf("\tnum4, num5 en formato exponencial con decimales: %.2e %.2e \n", num4, num5);
        
        System.out.println("\nUso MIN_VALUE y MAX_VALUE conocer los rangos de los números flotantes: ");
        System.out.printf("\n\tTipo:\tfloat\n\tMin: %f\n\tMax: %f",Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("\n\n\tTipo:\tdouble\n\tMin: %f\n\tMax: %f",Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
