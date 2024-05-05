package com.example.av_by.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BibiColorUpdateDto {
    private Long id;

    private String color;
}
