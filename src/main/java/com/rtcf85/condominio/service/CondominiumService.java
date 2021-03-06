package com.rtcf85.condominio.service;

import com.rtcf85.condominio.entity.Condominium;

import java.util.List;
import java.util.Optional;

public interface CondominiumService {
    Iterable<Condominium> findAll();

    Condominium save(Condominium condominium);

    Optional<Condominium> get(Long id);

    void delete(Long id);

    List<Condominium> findByStateName(String stateName);

    List<Condominium> findByCityName(String cityName);
}
