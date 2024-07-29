package bai_tap_them.repository.moto_repo;

import bai_tap_them.model.Car;
import bai_tap_them.model.Moto;

import java.util.List;

public interface IMotoRepository {
    List<Moto> findInfoOfMoto();

    void addMoto(Moto moto);

    Moto checkCode(String code);
    void deleteCar(Moto moto);
}
