package ss7.abstract_class_code_gym;

public class Square extends Shape implements Resizeable {
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

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString() + "\n"
                + "chu vi" + " " + getPerimeter() + "\n";

    }
}

