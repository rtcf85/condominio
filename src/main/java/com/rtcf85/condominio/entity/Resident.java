package com.rtcf85.condominio.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Resident {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String name;

    private String nationalId;

    private String number;

    private String block;

    @ManyToOne
    private Condominium condominium;
}
