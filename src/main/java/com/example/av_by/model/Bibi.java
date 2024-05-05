package com.example.av_by.model;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity(name =  "bibi")
@Data
public class Bibi
{
    @Id
    @SequenceGenerator(name = "bibisec", sequenceName = "bibi_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "bibisec")
    private Long id;

    @Column(name="marka", nullable = false)
    private String marka;

    @Column(name="model", nullable = false)
    private String model;

    @Column(name="year", nullable = false)
    private Integer year;

    @Column(name="color", nullable = false)
    private String color;

    @Column(name="cost", nullable = false)
    private Double cost;

    @Column(name="registr_number", nullable = false)
    private String registrNumber;

    @Column(name="city", nullable = false)
    private String city;

    @Column(name="vin", nullable = false)
    private String vin;
}
