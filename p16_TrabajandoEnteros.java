// p16_TrabajandoEnteros - Trabajando con con variables y literales enteras
// 21 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

public class p16_TrabajandoEnteros{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int num1 = 42;
        int num2 = 0x2A;
        int num3 = 0b00101010;

        byte val1 = 120, val2 = 1;
        short horas = 24, dias = 9099;
        long ganancia = 9223372036854733307L;

        System.out.println("\nUso de String.format para formateo de números enteros: ");
        System.out.printf("\n\tnum1 base decimal: %d",num1);
        System.out.printf("\n\tnum1 base octal: %o",num1);
        System.out.printf("\n\tnum2 base hexadecimal: %x",num2);
        System.out.printf("\n\tLa ganancia anual: %,d\n", ganancia);

        System.out.println("\nUso de Integer.toString para formateo de números enteros: ");
        System.out.println("\n\tnum2 base decimal.: " + Integer.toString(num2));
        System.out.println("\tnum2 base octal: " + Integer.toString(num2,8));
        System.out.println("\tnum2 base hexadecimal: " + Integer.toString(num2,16));
        System.out.println("\tnum2 base binaria: " + Integer.toString(num2,2));
        System.out.println("\tnum3 base binaria: " + Integer.toString(num3, 2));
        
        System.out.println("\nUso de System.out.prinf para dar formato a números enteros: ");
        System.out.printf("\n\tval1, val2 en formato decimal: %d %d \n",val1, val2);
        System.out.printf("\thoras, dias en formato decimal: %d %d \n",horas, dias);
        System.out.printf("\thoras, dias en formato octal: %o %o \n",horas, dias);
        System.out.printf("\thoras, dias en formato hexadecimal: %x %x \n", horas, dias);
        
        System.out.println("\nUso MIN_VALUE y MAX_VALUE conocer los rangos de los números enteros: ");
        System.out.printf("\n\tTipo:\tbyte\n\tMin: %d\n\tMax: %d",Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("\n\n\tTipo:\tshort\n\tMin: %d\n\tMax: %d",Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("\n\n\tTipo:\tint\n\tMin: %d\n\tMax: %d",Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("\n\n\tTipo:\tlong\n\tMin: %d\n\tMax: %d",Long.MIN_VALUE, Long.MAX_VALUE);
    }
}