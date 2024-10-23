package a34Practica_12.p120_Vehiculo;

public class Maquina {
    private String Nombre, Propietario;
    private int Pasajeros;
    
    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }

    public void repostar() {
        System.out.println("Repostando...");
    }
    
    public void arrancar() {
        System.out.println("Arrancando...");
    }
    
    public void frenar() {
        System.out.println("Frenando...");
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }
}