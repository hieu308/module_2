package ss5.access_modifier;

public class TestCircle {
    private double radius;
    private String color;

    TestCircle() {
        this.radius = 1.0;
        this.color = "red";
    }

    TestCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
