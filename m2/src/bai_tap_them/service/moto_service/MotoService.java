package bai_tap_them.service.moto_service;

import bai_tap_them.model.Moto;
import bai_tap_them.repository.moto_repo.IMotoRepository;
import bai_tap_them.repository.moto_repo.MotoRepository;

import java.util.List;

public class MotoService implements IMotoService {
    IMotoRepository iMotoRepository = new MotoRepository();

    @Override
    public List<Moto> findInfoOfMoto() {
       return iMotoRepository.findInfoOfMoto();

    }

    @Override
    public void addMoto(Moto moto) {

    }

    @Override
    public Moto checkCode(String code) {
        return iMotoRepository.checkCode(code);
    }
}
