package a23Practica_8.p98_Circulo;

// App - 
// 26 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10.40);
        System.out.println(c1);

        Circulo c2 = new Circulo();
        c2.setRadio(12.45);

        System.out.println(c2.toString());
        System.out.println("El radio es : " + c2.getRadio());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Circunferencia = " + c1.getCircunferencia());
    }
}
