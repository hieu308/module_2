package thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = sc.nextLine();
        System.out.println("nhập ký tự");
        char character = sc.next().charAt(0);
        System.out.println( display(str, character));
    }

    public static int display(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        return count;


    }
}