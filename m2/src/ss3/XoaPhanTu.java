package ss3;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        System.out.print("Mảng ban đầu: ");
        displayArray(arr, n);
        System.out.print("\nNhập giá trị cần xoá: ");
        int deleteValue = scanner.nextInt();
        int deleteIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == deleteValue) {
                deleteIndex = i;
                break;
            }
        }
        if (deleteIndex != -1) {
            for (int i = deleteIndex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.print("Mảng sau khi xoá: ");
            displayArray(arr, n);
        } else {
            System.out.println("Không tìm thấy phần tử " + deleteValue + " trong mảng.");
        }
    }

    public static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

