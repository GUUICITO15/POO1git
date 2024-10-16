package a31ExamenParcial2.p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre, Liga;
    ArrayList<Jugador> Jugadores;

    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this();
        Nombre = nombre;
        Liga = liga;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public double getTotalBono() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getBono();
        }
        return total;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador instanceof JugadorActivo)
                total += ((JugadorActivo) jugador).getTotal();
            else if (jugador instanceof JugadorEntrenador)
                total += ((JugadorEntrenador) jugador).getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalH = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador instanceof JugadorActivo)
                if (((JugadorActivo) jugador).getSexo() == 'H')
                    totalH++;
            else if (jugador instanceof JugadorEntrenador)
                if (((JugadorEntrenador) jugador).getSexo() == 'H')
                    totalH++;
        }
        return totalH;
    }

    public int getTotalM() {
        int totalM = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador instanceof JugadorActivo)
                if (((JugadorActivo) jugador).getSexo() == 'M')
                    totalM++;
            else if (jugador instanceof JugadorEntrenador)
                if (((JugadorEntrenador) jugador).getSexo() == 'M')
                    totalM++;
        }
        return totalM;
    }

    public void reporte() {
        System.out.println(this.toString());
        if (Jugadores.size() != 0) {
            for (Jugador jugador : Jugadores) {
                System.out.println("\n- " + jugador.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]";
    }
}
