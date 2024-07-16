package ss7_abstract_interface.abstract_class_code_gym;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        rectangle.resize(2);
        System.out.println("Chu vi sau khi tăng là "+rectangle.getPerimeter());
    }
}
