package ss3;

import java.util.Scanner;

public class ThemPhanTuVaoMang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Nhập phần tử mún chèn:");
        int X = input.nextInt();
        System.out.println("Nhập vị trí index:");
        int index = input.nextInt();
        int length = array.length;
        if (index <= -1 || index >= length - 1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = X;
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }

    }
}

