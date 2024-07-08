package ss1;

import java.util.Scanner;

public class ExchangeCurrency {
    public static void main(String[] args) {
        double Vn = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of USD");
        usd = sc.nextDouble();
        Vn = usd * Vn / 100;
        System.out.println("The USD value is " + Vn);

    }
}
