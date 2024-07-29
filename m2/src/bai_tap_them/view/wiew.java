package bai_tap_them.view;

import bai_tap_them.controller.CarController;
import bai_tap_them.controller.MotoController;
import bai_tap_them.controller.TruckController;

import java.util.Scanner;

public class wiew {
    public static void main(String[] args) {
        CarController carController = new CarController();
        MotoController motoController = new MotoController();
        TruckController truckController = new TruckController();
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
                            "3.Hiển thị xe tải\n" +
                            "4.Trở về");
                    int choiceDisplay = Integer.parseInt(sc.nextLine());
                    switch (choiceDisplay) {
                        case 1:
                            motoController.displayMoto();
                            break;
                        case 2:
                            carController.display();
                            break;
                        case 3:
                            truckController.displayTrucks();
                            break;
                        case 4:
                            return;
                    }
                    break;
                case 2:
                    System.out.println("Chọn phương tiện cần thêm: \n" +
                            "1.Thêm mới xe máy \n" +
                            "2.Thêm mới ô tô \n" +
                            "3.Thêm mới xe tải \n" +
                            "4.Trở ve ");
                    int choiceAdd = Integer.parseInt(sc.nextLine());
                    switch (choiceAdd) {
                        case 1:
                            motoController.addMoto();
                            break;
                        case 2:
                            carController.addCar();
                            break;
                        case 3:
                            truckController.addTrucks();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Nhập biển kiểm soát cần xoá");
                    String numberControlDeleted = sc.nextLine();
                    Boolean flagDc = carController.deleteCar(numberControlDeleted);
                    Boolean flagDm = motoController.deleteMoto(numberControlDeleted);
                    Boolean flagTm = truckController.deleteTruck(numberControlDeleted);
                    if (!(flagDc && flagDm && flagTm)) {
                        System.out.println("Không tìm thấy biển kiểm soát");

                    }
                    break;
                case 4:
                    System.out.println("Nhập biển kiểm soát cần tim");
                    String numberControl = sc.nextLine();
                    Boolean flagSc = carController.searchCar(numberControl);
                    Boolean flagSm = motoController.searchMoto(numberControl);
                    Boolean flagSt = truckController.searchTruck(numberControl);
                    if (!(flagSc && flagSm && flagSt)) {
                        System.out.println("Không tìm thấy biển kiểm soát");
                    }
                        break;
                    case 5:
                        return;
            }
        } while (true);
    }
}

