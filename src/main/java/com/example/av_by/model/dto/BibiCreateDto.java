package com.example.av_by.model.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
public class BibiCreateDto {
    private String marka;

    private String model;

    private Integer year;

    private String color;

    @Min(0)
    private Double cost;

    @Pattern(regexp = "[1-9]{4}")
    private String registrNumber;

    private String city;

    @Size(min = 17, max = 17)
    private String vin;
}
