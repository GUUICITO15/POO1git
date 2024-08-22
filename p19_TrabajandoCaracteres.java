// p19_TrabajandoCaracteres - Trabajando con caracteres
// 21 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

public class p19_TrabajandoCaracteres {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Character c1 = 'A', c2 = 'B';
        Character numero = '9';
        Character arroba = '@';
        Character pesos = 36;
        Character corazon = '\u2665';
        Character letraw = 119;
        Character espacio = ' ';
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(numero);
        System.out.println(arroba);
        System.out.println(pesos);
        System.out.println(corazon);
        System.out.println(letraw);
        System.out.println();
        c1++; c2++; numero--;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(numero);
        System.out.println(Character.isLetter(c1));
        System.out.println(Character.isDigit(numero));
        System.out.println(Character.isAlphabetic(pesos));
        System.out.println(Character.isSpaceChar(espacio));
    }
}
