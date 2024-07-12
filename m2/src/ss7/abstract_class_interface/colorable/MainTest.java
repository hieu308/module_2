package ss7.abstract_class_interface.colorable;

public class MainTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();
        shape[3] = new Circle();
        shape[4] = new Circle();
        for (Shape s : shape) {
            System.out.println(s);
            if (s instanceof Colorable) {

                ((Colorable) s).howToColor();


            }
        }
    }
}
