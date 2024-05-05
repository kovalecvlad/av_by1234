package com.example.av_by.model.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BibiVinUpdateDto {
    private Long id;

    @Size(min = 17, max = 17)
    private String vin;
}
