package bai_tap_them.service;

import bai_tap_them.model.Car;
import bai_tap_them.repository.car_repo.CarRepository;

import java.util.List;

public class CarService implements ICarService {
    CarRepository carRepository = new CarRepository();

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public List<Car> findInfo() {
        return carRepository.findInfo();

    }

    @Override
    public Car checkCode(String code) {
        return carRepository.checkCode(code);
    }
}

