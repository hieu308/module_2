package bai_tap_them.repository.car_repo;

import bai_tap_them.model.Car;
import quang_ly_code_gym.model.Student;

import java.util.List;

public interface ICarRepository {
    List<Car> findInfo();

    void addCar(Car car);

    Car checkCode(String code);
    void deleteCar(Car car);
}
