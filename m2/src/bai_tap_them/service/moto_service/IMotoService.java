package bai_tap_them.service.moto_service;

import bai_tap_them.model.Moto;

import java.util.List;

public interface IMotoService {
    List<Moto> findInfoOfMoto();

    void addMoto(Moto moto);

    Moto checkCode(String code);
}
