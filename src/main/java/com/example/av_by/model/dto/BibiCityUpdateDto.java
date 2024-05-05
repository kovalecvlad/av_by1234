package com.example.av_by.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BibiCityUpdateDto {
    private Long id;

    private String city;
}
