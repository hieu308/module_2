package ss7.abstract_class_code_gym;

public class MainTest {
    public static void main(String[] args) {
         Shape []shape = new Shape[3];
         shape[0] = new Circle();
         shape[1] = new Rectangle();
         shape[2] = new Square();
        for (Shape s : shape) {
        if (s instanceof Circle) {
            ((Circle) s).resize(Math.random() * 100+1);
        }else if (s instanceof Rectangle) {
            ((Rectangle) s).resize(Math.random() * 100+1);
        }else if (s instanceof Square) {
            ((Square) s).resize(Math.random() * 100+1);
        }
            System.out.println(s);
        }
    }
}
