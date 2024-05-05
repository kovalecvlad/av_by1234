package com.example.av_by.model.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BibiCostUpdateDto {
    private Long id;

    @Min(0)
    private Double cost;
}
