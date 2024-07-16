package ss7_abstract_interface.abstract_class_interface.colorable;

public class Square extends Shape implements Resizeable,Colorable {
    private double side = 2;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public void resize(double percent) {
        side += side * (percent / 100.0);
    }
    public void howToColor() {
        System.out.println("Color all for side...");
    }

    public String toString() {
        return "Diện tích hình vuông :" + getPerimeter();

    }
}

