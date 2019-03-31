package com.uco.campusmapservice.dao;

import com.uco.campusmapservice.model.Coordinate;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CoordinateRepository  extends Repository<Coordinate, String> {

    Optional<Coordinate> findByName(String name);

}
