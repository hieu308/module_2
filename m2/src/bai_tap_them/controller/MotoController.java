package bai_tap_them.controller;

import bai_tap_them.model.Brand;
import bai_tap_them.model.Car;
import bai_tap_them.model.Moto;
import bai_tap_them.service.car_service.CarService;
import bai_tap_them.service.car_service.ICarService;
import bai_tap_them.service.moto_service.IMotoService;
import bai_tap_them.service.moto_service.MotoService;

import java.util.List;
import java.util.Scanner;

public class MotoController {
    Scanner sc = new Scanner(System.in);
    IMotoService iMotoService = new MotoService();
    List<Moto> motoList = iMotoService.findInfoOfMoto();

    public void displayMoto() {
        for (Moto moto : motoList) {
            if (moto != null) {
                System.out.println(moto);
            }
        }
    }
    public boolean deleteMoto(String brand) {
        boolean flag = false;
        if (iMotoService.checkCode(brand) != null) {
            motoList.remove(iMotoService.checkCode(brand));
            System.out.println("Xoá xe máy thành công");
            flag = true;
        }
        return flag;
    }
    public boolean searchMoto(String numberControl) {
        boolean flag = false;
        if (iMotoService.checkCode(numberControl) != null) {
            System.out.println(iMotoService.checkCode(numberControl));
            flag = true;
        }
        return flag;

    }

    public void addMoto() {
        System.out.println("Nhập Biển kiểm soát ");
        String licensePlate = sc.nextLine();
        while (iMotoService.checkCode(licensePlate) != null) {
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
        System.out.println("Nhập công xuất xe");
        int power = Integer.parseInt(sc.nextLine());

        Brand brandModel = new Brand(codeCar, brand, country);
        Moto moto = new Moto(licensePlate, brandModel, factureYear, nameOwner, power);
        motoList.add(moto);
    }
}

