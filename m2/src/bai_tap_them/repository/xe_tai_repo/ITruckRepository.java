package bai_tap_them.repository.xe_tai_repo;

import bai_tap_them.model.Car;
import bai_tap_them.model.Trucks;

import java.util.List;

public interface ITruckRepository {
    List<Trucks> findInfoOfTruck();

    void addTruck(Trucks truck);

    Trucks checkCodeTruck(String code);
    void deleteCar(Car car);
}
