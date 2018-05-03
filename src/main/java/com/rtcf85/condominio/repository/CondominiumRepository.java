package com.rtcf85.condominio.repository;

import com.rtcf85.condominio.entity.Condominium;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CondominiumRepository extends PagingAndSortingRepository<Condominium, Long> {

    Condominium findByName(String name);

    List<Condominium> findByAddressCityStateName(String stateName);

    List<Condominium> findByAddressCityName(String cityName);
}
