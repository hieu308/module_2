package ss3;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "soguku danh voi saitama ai win";
        System.out.println("Nhập kí tự cần đếm");
        char word = sc.next().charAt(0);
       int count = 0;
       for (int i = 0; i < string.length(); i++) {
           if (string.charAt(i) == word) {
               count++;
           }
       }
        System.out.println("số lần xuất hiện ký tự" +word +" là"+count);
    }
}
