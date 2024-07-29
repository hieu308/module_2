package ss15.xu_ly_ngoai_le;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhapp cạnh a");
            int a = sc.nextInt();
            System.out.println("Nhapp cạnh b");
            int b = sc.nextInt();
            System.out.println("Nhapp cạnh c");
            int c = sc.nextInt();
            checkTriangle(a, b, c);
            System.out.println("Các cạnh hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Lỗi");
        }

    }
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("không đúng dữ liệu");
        } else if (a + b < c || b + c < a || c + a < b) {
            throw new IllegalTriangleException("Không đúng dữ liệu");
        }
    }

}
