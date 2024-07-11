package ss6_ke_thua.point_2d_3d;

public class Test {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        point2d.setXY(2,4);
        point2d.getXY();
        System.out.println(point2d.toString());
        Point3d point3d = new Point3d();
        point3d.setXYZ(2,4,5);
        point3d.getXYZ();
        System.out.println(point3d.toString());
    }

}
