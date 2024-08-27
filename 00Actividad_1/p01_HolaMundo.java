
// p01_HolaMundo - manda una salida de Hola Mundo en la pantalla
// 14 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

public class p01_HolaMundo{
    public static void main(String[] args){
        String amiga = "Karina";
        String hermano = "Isaac";
        String mensaje = String.format("Tanto %s como %s desean aprender Java", amiga, hermano);

        System.out.println("Hola Mundo, desde el lenguaje de Java");
        System.out.println("\nHola, amiga "+ amiga + " bienvenida a Java");
        System.out.println("\nMi amiga es " + amiga + " y mi hermano es " + hermano);
        System.out.println("\n" + mensaje);
    }
}