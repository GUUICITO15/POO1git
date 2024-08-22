// p20_ConversionTipos - Conversion entre tipos de datos en Java
// 21 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

public class p20_ConversionTipos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        // Conversión implicita: de pequeño a grande
        int var1 = 9;
        double var2 = var1; // int a double
        float var3 = 123456.789f;
        double var4 = var3; // float a double
        
        System.out.printf("Implicita de int a double: %d %f\n",var1,var2);
        System.out.printf("Implicita de float a double: %f %f\n", var3, var4);
        
        // Conversiones explicitas : de grande a pequeño
        long var5 = 1234567890123456L;
        int var6 = (int) var5;
        int var7 = 21448364;
        short var8 = (short) var7;

        System.out.printf("Manual con casting de long a int: %d %d\n",var5,var6);
        System.out.printf("Manual con casting de int a short: %d %d\n",var7,var8);
    }
}
