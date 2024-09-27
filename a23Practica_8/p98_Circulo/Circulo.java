package a23Practica_8.p98_Circulo;

import java.text.DecimalFormat;

public class Circulo {
    private double radio;

    public Circulo() {}

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * (radio * radio);
    }

    public double getCircunferencia() {
        return Math.PI * (2 * radio);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.##");
        return String.format("Circulo [Radio=%s]", df.format(radio));
    }
}