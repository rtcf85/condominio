package com.rtcf85.condominio.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Condominium {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address address;
}