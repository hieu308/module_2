package bai_tap_them.controller;

import bai_tap_them.model.Brand;
import bai_tap_them.model.Car;
import bai_tap_them.service.car_service.CarService;
import bai_tap_them.service.car_service.ICarService;

import java.util.List;
import java.util.Scanner;

public class CarController {
    Scanner sc = new Scanner(System.in);
    ICarService carService = new CarService();
    List<Car> carList = carService.findInfo();

    public void display() {
        for (Car car : carList) {
            if (car != null) {
                System.out.println(car);
            }
        }
    }

    public boolean searchCar(String numberControl) {
        boolean flag = false;
        if (carService.checkCode(numberControl) != null) {
            System.out.println(carService.checkCode(numberControl));
            flag = true;
        }
        return flag;

    }
    public boolean deleteCar(String brand) {
        boolean flag = false;
        if (carService.checkCode(brand) != null) {
            carList.remove(carService.checkCode(brand));
            System.out.println("Xoá Ô tô thành công");
            flag = true;
        }
        return flag;
    }

    public void addCar() {
        System.out.println("Nhập Biển kiểm soát ");
        String licensePlate = sc.nextLine();
        while (carService.checkCode(licensePlate) != null) {
            System.out.println("Biển đã tồn tại mời nhập lại");
            licensePlate = sc.nextLine();
        }
        System.out.println("Nhập Năm sản xuất");
        String factureYear = sc.nextLine();
        System.out.println("Nhập tên chủ sỡ hữu");
        String nameOwner = sc.nextLine();
        System.out.println("Nhập mã số xe");
        String codeCar = sc.nextLine();
        System.out.println("Nhập tên hãng");
        String brand = sc.nextLine();
        System.out.println("Nhập quoc gia sản xuất");
        String country = sc.nextLine();
        System.out.println("Nhập số chỗ ngồi của xe");
        int seats = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu xe");
        String model = sc.nextLine();
        Brand brandModel = new Brand(codeCar, brand, country);
        Car car = new Car(licensePlate, brandModel, factureYear, nameOwner, seats, model);
        carList.add(car);
    }
}
