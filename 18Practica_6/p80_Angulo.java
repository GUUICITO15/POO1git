// p80_Angulo - Recibe como parámetro un ángulo entre 0 y 360 grados, y regresa una palabra con el tipo de ángulo
// 18 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p80_Angulo {
    
    /**
     * identifica que tipo de angulo es el angulo dado
     * @param anguloNum (int) angulo de forma numerica
     * @return regresa el tipo de angulo que es el angulo dado (String)
     */
    public static String tipoAngulo(int anguloNum) {
        if(anguloNum < 90)
            return "Agudo";

        else if(anguloNum == 90)
            return "Recto";

        else if(anguloNum > 90 && anguloNum < 180)
            return "Obtuso";

        else if(anguloNum == 180)
            return "Llano";

        else if(anguloNum > 180 && anguloNum < 360)
            return "Concavo";

        else if(anguloNum == 360)
            return "Completo";
        else
            return "";
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int anguloNum;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("dame un angulo de 0 a 360");
            anguloNum = sc.nextInt();

            if (anguloNum < 0 || anguloNum > 360)
                System.out.println("por favor, que sea no menor a 0 y no mayor a 360");;
        } while (anguloNum < 0 || anguloNum > 360);

        System.out.println(anguloNum + " es un angulo: " + tipoAngulo(anguloNum));

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
