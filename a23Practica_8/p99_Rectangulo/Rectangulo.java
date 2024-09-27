package a23Practica_8.p99_Rectangulo;

import java.text.DecimalFormat;

public class Rectangulo {
    private float largo, ancho;

    public Rectangulo (){}
    
    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getLargo() {
        return largo;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAncho() {
        return ancho;
    }

    public float getArea() {
        return largo * ancho;
    }

    public float getPerimetro() {
        return 2 * (ancho + largo);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.##");
        return String.format("Rectangulo [Largo=%s, Ancho=%s]", df.format(largo), df.format(ancho));
    }
}
