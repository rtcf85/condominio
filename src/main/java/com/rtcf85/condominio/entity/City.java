package com.rtcf85.condominio.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class City {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private State state;
}
