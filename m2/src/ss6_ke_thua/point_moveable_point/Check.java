package ss6_ke_thua.point_moveable_point;

public class Check {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        p1.getXY();
        System.out.println(p1.tostring());
        MovablePoint p2 = new MovablePoint(1, 2, 4, 4);
        System.out.println(p2.tostring());
        p2.move();
        System.out.println(p2.tostring());
    }

}
