package a31ExamenParcial2.p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador{
    private int Subordinados, Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados,
            int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total = salario + getBono();
    }
    
    @Override
    public double getBono() {
        return (Salario * 0.15) + (Proyectos * 100) + (Subordinados * 10);
    }
    
    public double getTotal() {
        return Salario + getBono();
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [" + super.toString() + ", Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", Total=" + Total + "]";
    }
}
