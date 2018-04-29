package com.rtcf85.condominio.service;

import com.rtcf85.condominio.entity.Condominium;
import com.rtcf85.condominio.repository.CondominiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CondominiumServiceImpl implements CondominiumService {

    @Autowired
    private CondominiumRepository condominiumRepository;

    @Override
    public Iterable<Condominium> findAll() {
        return condominiumRepository.findAll();
    }

    @Override
    public Condominium save(Condominium condominium) {
        return condominiumRepository.save(condominium);
    }

    @Override
    public Optional<Condominium> get(Long id) {
        return condominiumRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        condominiumRepository.deleteById(id);
    }
}
