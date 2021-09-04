package com.stefanini.apilucas.model;

import javax.persistence.*;

@Entity(name = "contrato")
public class ContratoModel {
    @Id
    @SequenceGenerator(name = "contrato_number_seq", sequenceName = "contrato_number_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contrato_number_seq")
    @Column(name = "number")
    private Integer number;
    @Column(name = "name")
    private String name;


    public ContratoModel() {
    }

    public ContratoModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
