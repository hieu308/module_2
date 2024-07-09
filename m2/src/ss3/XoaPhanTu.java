package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 4, 4, 4};

        System.out.print("Mảng ban đầu: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("\nNhập giá trị cần xoá: ");
        int deleteValue = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteValue) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                    arr[arr.length-1] = 0;
                }
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}


