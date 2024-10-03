package a25Practica_9.p104_PuntoCirculo;

public class Punto {
    private int X, Y;

    public Punto() {
    }

    public Punto(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
    
    
    public double getDistancia(Punto punto) {
        return Math.sqrt((Math.pow((punto.getX() - X), 2) + Math.pow((punto.getY() - Y), 2)));
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
}