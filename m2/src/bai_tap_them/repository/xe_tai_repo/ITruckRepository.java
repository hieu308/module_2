package bai_tap_them.repository.truck_repo;

import bai_tap_them.model.Car;
import bai_tap_them.model.Trucks;

import java.util.List;

public interface ITruckRepository {
    List<Trucks> findInfoOfTruck();

    void addTruck(Trucks truck);

    Trucks checkCode(String code);
    void deleteCar(Car car);
}
