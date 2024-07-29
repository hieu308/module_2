package bai_tap_them.service.truck_service;

import bai_tap_them.model.Car;
import bai_tap_them.model.Trucks;
import bai_tap_them.repository.xe_tai_repo.ITruckRepository;
import bai_tap_them.repository.xe_tai_repo.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {
    ITruckRepository iTruckRepository = new TruckRepository();

    public TruckService() {
        super();
    }

    @Override
    public List<Trucks> findInfoOfTruck() {
       return iTruckRepository.findInfoOfTruck();
    }

    @Override
    public void addTruck(Trucks truck) {
        iTruckRepository.addTruck(truck);
    }

    @Override
    public Trucks checkCodeTruck(String code) {
        return iTruckRepository.checkCodeTruck(code);
    }

    @Override
    public void deleteCar(Car car) {

    }
}
