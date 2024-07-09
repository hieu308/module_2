package ss4.phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
       return   this.b * this.b - (4 * this.a * this.c);

    }

    public double getRoot1() {
       return (-this.b + Math.sqrt(this.b * this.b - (4 * this.a * this.c))) / (this.a * 2);


    }
    public double getRoot2() {
       return  (-this.b - Math.sqrt(this.b * this.b - (4 * this.a * this.c))) / (this.a * 2);

    }
}

