package ss2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int counter = 1;
        int N = 2;
        boolean isPrime = true;
        System.out.println("Nhập số nguyên tố cần in ra:");
        number = sc.nextInt();
        while (counter <= number) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;

                } else {
                    isPrime = true;
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