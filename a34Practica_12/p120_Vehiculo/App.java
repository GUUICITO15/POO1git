package a34Practica_12.p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Vochito", "Maria Díaz", 4);

        System.out.println(sedan.toString());
        System.out.println();

        sedan.sistemaElectrico();
        sedan.conbustionInterna();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();
        System.out.println();

        Suv suv = new Suv("La Mamalona", "Carlos Castañeda", 6);

        System.out.println(suv.toString());
        System.out.println();
        
        suv.sistemaElectrico();
        suv.conbustionInterna();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.arrancar();
        suv.frenar();
    }
}
