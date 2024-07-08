package ss3;

import java.util.Scanner;

public class TongHaiDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận:");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột của ma trận:");
        int cols = sc.nextInt();
        while (rows != cols) {

            System.out.println("Nhập lại số hàng của ma trận:");
             rows = sc.nextInt();
            System.out.println("Nhập lại số cột của ma trận:");
             cols = sc.nextInt();
        }
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i];
        }
        for (int i = rows-1; i >= 0; i--) {
            sum += matrix[i][i];
        }
        System.out.println(sum);
    }
}
