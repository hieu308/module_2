package bai_tap_them.service.truck_service;

import bai_tap_them.model.Car;
import bai_tap_them.model.Trucks;

import java.util.List;

public interface ITruckService {
    List<Trucks> findInfoOfTruck();

    void addTruck(Trucks truck);

    Trucks checkCodeTruck(String code);
    void deleteCar(Car car);
}
