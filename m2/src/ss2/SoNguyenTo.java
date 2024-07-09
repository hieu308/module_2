package ss2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int counter = 0;
        int N = 2;
        boolean isPrime;
        System.out.println("Nhập số nguyên tố cần in ra:");
        number = sc.nextInt();
        while (counter < number) {
             isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
                System.out.println(N);
            }
            N++;
        }
    }
}