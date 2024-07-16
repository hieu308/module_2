package ss7_abstract_interface.abstract_class_interface.colorable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public void resize(double percent) {
        radius += radius*(percent/100.0);
    }

    @Override
    public String toString() {
        return "Diện tích hinh tròn :" + getPerimeter();
    }
}
