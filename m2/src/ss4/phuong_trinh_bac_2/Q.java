package ss4.phuong_trinh_bac_2;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
        double a = sc.nextDouble();
        System.out.println("nhập b");
        double b = sc.nextDouble();
        System.out.println("nhập c");
        double c = sc.nextDouble();
        QuadraticEquation root = new QuadraticEquation(a, b, c);
        double delta = root.getDiscriminant();
        if (delta > 0) {
            System.out.println("phương trình có 2 nghiệm" + " " + root.getRoot1() + "và" + " " + root.getRoot2());
        } else if (delta == 0) {
            System.out.println("phuong trình có nghiệm kép" + " " + root.getRoot1());

        } else System.out.println("phuong trinh vo nghiem");
    }
}