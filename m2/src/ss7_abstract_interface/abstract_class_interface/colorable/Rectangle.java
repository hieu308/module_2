package ss7_abstract_interface.abstract_class_interface.colorable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 2.0;
    private double length = 5.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
      return width * this.length;

    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    public void resize(double percent) {
        width += width * (percent / 100.0);
        length += length * (percent / 100.0);


    }

    @Override
    public String toString() {
        return "diện tích hình chữ nhật" +  getArea();

    }
}