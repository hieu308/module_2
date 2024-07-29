package bai_tap_them.service.car_service;

import bai_tap_them.model.Car;
import bai_tap_them.repository.car_repo.CarRepository;
import bai_tap_them.repository.car_repo.ICarRepository;

import java.util.List;

public class CarService implements ICarService {
    ICarRepository iCarRepository = new CarRepository();

    @Override
    public void addCar(Car car) {

        iCarRepository.addCar(car);
    }

    @Override
    public List<Car> findInfo() {
        return iCarRepository.findInfo();

    }

    @Override
    public Car checkCode(String code) {
        return iCarRepository.checkCode(code);
    }
}

