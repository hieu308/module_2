package bai_tap_them.controller;

import bai_tap_them.model.Brand;
import bai_tap_them.model.Trucks;
import bai_tap_them.service.truck_service.ITruckService;
import bai_tap_them.service.truck_service.TruckService;

import java.util.List;
import java.util.Scanner;

public class TruckController {
    Scanner sc = new Scanner(System.in);
    ITruckService iTruckService = new TruckService();
    List<Trucks> trucksList = iTruckService.findInfoOfTruck();

    public void displayTrucks() {
        for (Trucks truck : trucksList) {
            if (truck != null) {
                System.out.println(truck);
            }
        }
    }
    public boolean searchTruck(String numberControl) {
        boolean flag = false;
        if (iTruckService.checkCodeTruck(numberControl) != null) {
            System.out.println(iTruckService.checkCodeTruck(numberControl));
            flag = true;
        }
        return flag;

    }
    public boolean deleteTruck(String brand) {
        boolean flag = false;
        if (iTruckService.checkCodeTruck(brand) != null) {
            trucksList.remove(iTruckService.checkCodeTruck(brand));
            System.out.println("Xoá xe tai thành công");
            flag = true;
        }
        return flag;
    }
    public void addTrucks() {
        System.out.println("Nhập Biển kiểm soát ");
        String licensePlate = sc.nextLine();
        while (iTruckService.checkCodeTruck(licensePlate) != null) {
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
        System.out.println("Nhập trọng tải của xe");
        int payLoad = Integer.parseInt(sc.nextLine());

        Brand brandModel = new Brand(codeCar, brand, country);
        Trucks truck = new Trucks(licensePlate, brandModel, factureYear, nameOwner, payLoad);
        trucksList.add(truck);
    }
}

