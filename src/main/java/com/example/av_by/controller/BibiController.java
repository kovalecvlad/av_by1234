package com.example.av_by.controller;

import com.example.av_by.exception.CustomValidationException;
import com.example.av_by.model.Bibi;
import com.example.av_by.model.dto.*;
import com.example.av_by.service.BibiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import org.apache.coyote.Response;
import org.springframework.beans.factory.NamedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Tag(name="AV_BY на минималках",description = "Продажа автомобилей")
@RestController
@RequestMapping("/bibi")
public class BibiController {
    private final BibiService bibiService;

    @Autowired
    public BibiController(BibiService bibiService) {
        this.bibiService = bibiService;
    }

    @Operation(summary = "Просмотреть все авто")
    @GetMapping
    public ResponseEntity<List<Bibi>> getAllBibi() {
        List<Bibi> bibiList = bibiService.getAllBibi();
        if (bibiList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bibiList, HttpStatus.OK);
    }

    @Operation(summary = "Просмотреть авто по Id")
    @GetMapping("/{id}")
    public ResponseEntity<Bibi> getBibiById(@PathVariable Long id) {
        Optional<Bibi> bibi = bibiService.getBibiById(id);
        if (bibi.isPresent()) {
            return new ResponseEntity<>(bibi.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Operation(summary = "Добавление объявления")
    @PostMapping
    public ResponseEntity<HttpStatus> createBibi(@RequestBody @Valid BibiCreateDto bibiCreateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.createBibi(bibiCreateDto) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактирование объявления")
    @PutMapping
    public ResponseEntity<HttpStatus> updateBibi(@RequestBody @Valid BibiUpdateDto bibiUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdate(bibiUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать марку автомобиля в объявлении")
    @PutMapping("/marka")
    public ResponseEntity<HttpStatus> updateMarkaBibi(@RequestBody @Valid BibiMarkaUpdateDto bibiMarkaUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateMarka(bibiMarkaUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать модель автомобиля в объявлении")
    @PutMapping("/model")
    public ResponseEntity<HttpStatus> updateModelBibi(@RequestBody @Valid BibiModelUpdateDto bibiModelUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateModel(bibiModelUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать цвет автомобиля в объявлении")
    @PutMapping("/color")
    public ResponseEntity<HttpStatus> updateColorBibi(@RequestBody @Valid BibiColorUpdateDto bibiColorUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateColor(bibiColorUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать цену автомобиля в объявлении")
    @PutMapping("/cost")
    public ResponseEntity<HttpStatus> updateCostBibi(@RequestBody @Valid BibiCostUpdateDto bibiCostUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateCost(bibiCostUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать регистрационный номер автомобиля в объявлении")
    @PutMapping("/registr-number")
    public ResponseEntity<HttpStatus> updateRegistrNumberBibi(@RequestBody @Valid BibiRegistrNumberUpdateDto bibiRegistrNumberUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateRegistrNumber(bibiRegistrNumberUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать город в котором находится автомобиль")
    @PutMapping("/city")
    public ResponseEntity<HttpStatus> updateCityBibi(@RequestBody @Valid BibiCityUpdateDto bibiCityUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateCity(bibiCityUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать VIN автомобиля в объявлении")
    @PutMapping("/vin")
    public ResponseEntity<HttpStatus> updateVINBibi(@RequestBody @Valid BibiVinUpdateDto bibiVinUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateVin(bibiVinUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Редактировать год производства автомобиля в объявлении")
    @PutMapping("/year")
    public ResponseEntity<HttpStatus> updateYearBibi(@RequestBody @Valid BibiYearUpdateDto bibiYearUpdateDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors().toString());
        }
        return new ResponseEntity<>(bibiService.bibiUpdateYear(bibiYearUpdateDto) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "Удаление объявления")
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        return new ResponseEntity<>(bibiService.deleteById(id) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
    }


}
