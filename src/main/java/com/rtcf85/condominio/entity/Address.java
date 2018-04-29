package com.rtcf85.condominio.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    City city;

    String cep;

    String street;

    String number;

    String complement;
}
