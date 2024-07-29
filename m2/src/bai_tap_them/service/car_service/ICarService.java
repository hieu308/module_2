package bai_tap_them.service.car_service;

import bai_tap_them.model.Car;

import java.util.List;

public interface ICarService {
    List<Car> findInfo();
void addCar(Car car);
    Car checkCode(String code);
}
