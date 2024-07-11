package ss6_ke_thua.point_2d_3d;

public class Point2d {
    private float x;
    private float y;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public String toString() {
        return "(" + x + " " + y + ")";
    }


}

class Point3d extends Point2d {
    private float z;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{getZ(),getY(),getZ()};
    }
    public String toString() {
        return "(" + getX() + " " + getY() + " " + z+")";
    }


}
