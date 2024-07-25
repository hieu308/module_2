package bai_tap_them.view;

import bai_tap_them.controller.CarController;

import java.util.Scanner;

public class wiew {
    public static void main(String[] args) {
        CarController carController = new CarController();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Quảng lý phương tiện giao thông: \n" +
                    "Chọn chức năng \n" +
                    "1.Hiển thị phương tiện \n" +
                    "2.Thêm mới phương tiện \n" +
                    "3.Xoá phương tiện \n" +
                    "4.Tìm kiem theo bien kiểm soát \n" +
                    "5.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn phương tiện muốn hiển thị: \n" +
                            "1.Hiển thị xe máy\n" +
                            "2.Hiển thị ôto\n" +
                            "3.Hiển thị xe máy\n" +
                            "4.Trở về");
                    int choiceDisplay = Integer.parseInt(sc.nextLine());
                    switch (choiceDisplay) {
                        case 1:
                            carController.display();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            return;
                    }
                case 2:
                    System.out.println("Chọn phương tiện cần thêm: \n"+
                            "1.Thêm mới xe máy \n" +
                            "2.Thêm mới ô tô \n" +
                            "3.Thêm mới xe máy \n"+
                            "4.Trở ve ");
                    int choiceAdd = Integer.parseInt(sc.nextLine());
                    switch (choiceAdd) {
                        case 1:
                            

                    }
              break;

            }
        } while (true);
    }
}

