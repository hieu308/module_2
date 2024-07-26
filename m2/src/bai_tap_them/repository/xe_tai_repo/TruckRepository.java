package bai_tap_them.repository.truck_repo;

import bai_tap_them.model.Brand;
import bai_tap_them.model.Car;
import bai_tap_them.model.Trucks;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    public static List<Trucks> listTrucks;

    static {
        listTrucks = new ArrayList<>();

        Brand brand = new Brand("123T", "senzo", "usa");
        Trucks truck1 = new Trucks("234T", brand, "1998", "jhon", 550);
        listTrucks.add(truck1);
    }


    @Override
    public List<Trucks> findInfoOfTruck() {
        return listTrucks;
    }

    @Override
    public Trucks checkCode(String code) {
        for (Trucks truck : listTrucks) {
            if (truck.getControlPlate().equals(code)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public void addTruck(Trucks truck) {
        listTrucks.add(truck);
    }

    @Override
    public void deleteCar(Car car) {
    }
}
