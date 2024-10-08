package a25Practica_9.p104_PuntoCirculo;

import java.text.DecimalFormat;

public class Circulo {
    private Punto Centro;
    private double Radio;
    
    public Circulo() {
    }

    public Circulo(Punto centro, double radio) {
        Centro = centro;
        Radio = radio;
    }

    public Punto getCentro() {
        return Centro;
    }

    public void setCentro(Punto centro) {
        Centro = centro;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(Radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.###");
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + ", Area=" + df.format(getArea()) + ", Circunferencia=" + df.format(getCircunferencia()) + "]";
    }
}
