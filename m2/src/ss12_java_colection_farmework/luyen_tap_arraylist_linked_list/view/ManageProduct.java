package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.view;

import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.controller.ProductManagerController;

import java.util.Scanner;

public class ManageProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagerController products = new ProductManagerController();
        int choice;
        do {
            System.out.println("Thông tin sản pham: \n" +
                    "1.Quảng lý sản phẩm \n" +
                    "2.Đặt mua sản phẩm \n" +
                    "3.Tư vấn sản phẩm \n" +
                    "4.Thoát chương trình");
            System.out.println("Nhập chọn lựa của bạn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    products.displayDetail();
                    break;
                case 2:
                    System.out.println("đang hoàn thiện");
                    break;
                case 3:
                    System.out.println("đang hoàn thiện");
                    break;
                case 4:
                    return;

            }
        } while (true);
    }
}
