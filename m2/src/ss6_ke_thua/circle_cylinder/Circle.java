package ss6_ke_thua.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle Bán kính hình tròn = " + radius + ", color = " + color ;
    }


}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.floor(Math.PI * Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return "Cylinder Chiều cao = " + height + ", Thể tích hình trụ = " + getVolume() ;
    }
}
