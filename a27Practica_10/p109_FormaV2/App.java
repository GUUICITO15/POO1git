package a27Practica_10.p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("verde", false, 12);
        Circulo circulo2 = new Circulo("morado", true, 54);
        Rectangulo rectangulo1 = new Rectangulo("negro", true, 23, 8);
        Rectangulo rectangulo2 = new Rectangulo("blanco", true, 21, 54);

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(circulo1);
        formas.add(circulo2);
        formas.add(rectangulo1);
        formas.add(rectangulo2);

        System.out.println("Todas las Formas");
        for (Forma forma : formas) {
            System.out.println(forma.toString());
        }
        
        System.out.println("\nCalculando Area y Perimetro de las figuras");
        for (Forma forma : formas) {
            if(forma instanceof Rectangulo) {
                System.out.println("La forma es un Recangulo");
            }
            else if (forma instanceof Circulo) {
                System.out.println("La forma es un Circulo");
            }
            
            System.out.println("El area es     : " + forma.getArea());
            System.out.println("El perimetro es: " + forma.getPerimetro());
        }
    }
}
