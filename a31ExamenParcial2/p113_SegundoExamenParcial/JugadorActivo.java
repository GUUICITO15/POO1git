package a31ExamenParcial2.p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int Partidos, Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
        Total = salario + getBono();
    }

    @Override
    double getBono() {
        return (Salario * 0.10) + (Partidos * 50) + (Goles * 5);
    }

    public double getTotal() {
        return Salario + getBono();
    }

    public char getSexo() {
        return Sexo;
    }

    @Override
    public String toString() {
        return "JugadorActivo [" + super.toString() + ", Partidos=" + Partidos + ", Goles=" + Goles + ", Total=" + Total + "]";
    }
}
