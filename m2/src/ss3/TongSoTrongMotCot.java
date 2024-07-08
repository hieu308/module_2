package ss3;

import java.util.Scanner;

public class TongSoTrongMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận:");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột của ma trận:");
        int cols = sc.nextInt();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Nhập cột cần tính tổng");
        int colum = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(colum == j+1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
