package com.example.av_by.repository;

import com.example.av_by.model.Bibi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface BibiRepository extends JpaRepository<Bibi, Long>
{
    List<Bibi> findBibiByMarka(String marka);
    List<Bibi> findBibiByMarkaAndModel(String marka, String model);
    List<Bibi> findBibiByYearBetween(Integer startYear, Integer endYear);
    List<Bibi> findBibiByColor(String color);
    List<Bibi> findBibiByCostBetween(Double start, Double end);
    List<Bibi> findBibiByCity(String city);
    List<Bibi> findBibiByVin(String vin);
}
