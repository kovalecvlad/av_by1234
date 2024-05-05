package com.example.av_by.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
public class BibiYearUpdateDto {
    private Long id;

    private Integer year;
}
