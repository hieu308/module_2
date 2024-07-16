package ss7_abstract_interface.abstract_class_code_gym;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square.resize(4);
        System.out.println("chu vi sau khi tăng là " + square.getPerimeter());
    }
}
