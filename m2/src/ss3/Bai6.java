package ss3;
import java.util.Scanner;
public class Bai6 {
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
            double maxValue = matrix[0][0];
            int maxRow = 0;
            int maxCol = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] > maxValue) {
                        maxValue = matrix[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }
            System.out.println("Phần tử lớn nhất trong ma trận là " + maxValue +
                    " tại vị trí (" + maxRow + ", " + maxCol + ")");
        }
    }

