package bai_tap_them.repository.car_repo;

import bai_tap_them.model.Brand;
import bai_tap_them.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    public static List<Car> list;

    static {
        list = new ArrayList<Car>();
        Brand brand = new Brand("sdff", "dsfefdf", "dfefdfe");
        Car car1 = new Car("12f5", brand, "2012",
                "David Tèo", 4, "xe gia đình");
        Brand brand2 = new Brand("sfdf", "dsfdf", "dfefdfe");
        Car car2 = new Car("125", brand2, "2012",
                "David Tèo", 4, "xe gia đình");
        list.add(car1);
        list.add(car2);
    }

    @Override
    public List<Car> findInfo() {
        return list;
    }

    @Override
    public void addCar(Car car) {
        list.add(car);
    }

    @Override
    public Car checkCode(String code) {
        for (Car car : list) {
            if (car.getControlPlate().equals(code)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void deleteCar(Car car) {
        list.remove(car);
    }
}


