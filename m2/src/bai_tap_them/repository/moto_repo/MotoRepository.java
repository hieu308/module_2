package bai_tap_them.repository.moto_repo;

import bai_tap_them.model.Brand;
import bai_tap_them.model.Car;
import bai_tap_them.model.Moto;

import java.util.ArrayList;
import java.util.List;

public class MotoRepository implements IMotoRepository {
    public static List<Moto> listMoto;

    static {
        listMoto = new ArrayList<Moto>();
        Brand brand = new Brand("sdff", "dsfefdf", "dfefdfe");
        Moto moto1 = new Moto("234f", brand, "1998", "jhon", 150);
        listMoto.add(moto1);
    }

    @Override
    public List<Moto> findInfoOfMoto() {
        return listMoto;
    }

    @Override
    public void addMoto(Moto moto) {
        listMoto.add(moto);
    }

    @Override
    public Moto checkCode(String code) {
        for (Moto moto : listMoto) {
            if (moto.getControlPlate().equals(code)) {
                return moto;
            }
        }
        return null;
    }

    @Override
    public void deleteCar(Moto moto) {

    }
}
