package ss2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        int N = 2;
        boolean isPrime = true;
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        while (N <= 100) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;

                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {

                System.out.println(N);
            }
            N++;
        }
    }

}

