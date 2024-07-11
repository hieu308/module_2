package ss6_ke_thua.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"blue");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(2,"red",4);
        System.out.println(cylinder.toString());
    }
}
