package com.example.av_by.model.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BibiRegistrNumberUpdateDto {
    private Long id;

    @Pattern(regexp = "[1-9]{4}")
    private String registrNumber;
}
