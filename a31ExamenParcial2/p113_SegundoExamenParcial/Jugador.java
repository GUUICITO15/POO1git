package a31ExamenParcial2.p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String Nombre;
    protected char Sexo;
    protected String Descripcion;
    protected double Salario, Total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }

    abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario + "]";
    }
}
