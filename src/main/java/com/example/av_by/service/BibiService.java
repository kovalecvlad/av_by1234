package com.example.av_by.service;

import com.example.av_by.model.Bibi;
import com.example.av_by.model.dto.*;
import com.example.av_by.repository.BibiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BibiService {
    private final BibiRepository bibiRepository;

    @Autowired
    public BibiService(BibiRepository bibiRepository) {
        this.bibiRepository = bibiRepository;
    }

    public Optional<Bibi> getBibiById(Long id) {
        return bibiRepository.findById(id);
    }

    public List<Bibi> getAllBibi() {
        return bibiRepository.findAll();
    }

    public List<Bibi> getByMarka(String marka) {
        return bibiRepository.findBibiByMarka(marka);
    }

    public List<Bibi> getByMarkaAndModel(String marka, String model) {
        return bibiRepository.findBibiByMarkaAndModel(marka, model);
    }

    public List<Bibi> findBibiByYearBetween(Integer startYear, Integer endYear) {
        return bibiRepository.findBibiByYearBetween(startYear, endYear);
    }

    public List<Bibi> findBibiByColor(String color) {
        return bibiRepository.findBibiByColor(color);
    }

    public List<Bibi> findBibiByCostBetween(Double start, Double end) {
        return bibiRepository.findBibiByCostBetween(start, end);
    }

    public List<Bibi> findBibiByCity(String city) {
        return bibiRepository.findBibiByCity(city);
    }

    public List<Bibi> findBibiByVin(String vin) {
        return bibiRepository.findBibiByVin(vin);
    }

    public Boolean createBibi(BibiCreateDto bibiCreateDto) {
        Bibi bibi = new Bibi();
        bibi.setMarka(bibiCreateDto.getMarka());
        bibi.setModel(bibiCreateDto.getModel());
        bibi.setYear(bibiCreateDto.getYear());
        bibi.setColor(bibiCreateDto.getColor());
        bibi.setCost(bibiCreateDto.getCost());
        bibi.setRegistrNumber(bibiCreateDto.getRegistrNumber());
        bibi.setCity(bibiCreateDto.getCity());
        bibi.setVin(bibiCreateDto.getVin());

        Bibi createdBibi = bibiRepository.save(bibi);
        return getBibiById(createdBibi.getId()).isPresent();
    }

    public Boolean bibiUpdate(BibiUpdateDto bibiUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setMarka(bibiUpdateDto.getMarka());
            updatedBibi.setModel(bibiUpdateDto.getModel());
            updatedBibi.setYear(bibiUpdateDto.getYear());
            updatedBibi.setColor(bibiUpdateDto.getColor());
            updatedBibi.setCost(bibiUpdateDto.getCost());
            updatedBibi.setRegistrNumber(bibiUpdateDto.getRegistrNumber());
            updatedBibi.setCity(bibiUpdateDto.getCity());
            updatedBibi.setVin(bibiUpdateDto.getVin());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateMarka(BibiMarkaUpdateDto bibiMarkaUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiMarkaUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setMarka(bibiMarkaUpdateDto.getMarka());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateModel(BibiModelUpdateDto bibiModelUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiModelUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setModel(bibiModelUpdateDto.getModel());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateYear(BibiYearUpdateDto bibiYearUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiYearUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setYear(bibiYearUpdateDto.getYear());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateColor(BibiColorUpdateDto bibiColorUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiColorUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setColor(bibiColorUpdateDto.getColor());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateCost(BibiCostUpdateDto bibiCostUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiCostUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateRegistrNumber(BibiRegistrNumberUpdateDto bibiRegistrNumberUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiRegistrNumberUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setRegistrNumber(bibiRegistrNumberUpdateDto.getRegistrNumber());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateCity(BibiCityUpdateDto bibiCityUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiCityUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setCity(bibiCityUpdateDto.getCity());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean bibiUpdateVin(BibiVinUpdateDto bibiVinUpdateDto) {
        Optional<Bibi> bibi = getBibiById(bibiVinUpdateDto.getId());
        if (bibi.isPresent()) {
            Bibi updatedBibi = bibi.get();
            updatedBibi.setVin(bibiVinUpdateDto.getVin());
            return updatedBibi.equals(bibiRepository.saveAndFlush(updatedBibi));
        }
        return false;
    }

    public Boolean deleteById(Long id) {
        Optional<Bibi> bibi = getBibiById(id);
        if (bibi.isEmpty()) {
            return false;
        }
        bibiRepository.delete(bibi.get());
        return true;
    }

}
