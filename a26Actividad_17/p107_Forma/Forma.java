package a26Actividad_17.p107_Forma;

abstract class Forma {
    private String Color;
    
    public Forma(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public abstract double getArea();
}
