package com.uco.campusmapservice.service;

import com.uco.campusmapservice.controller.CoordinateNotFoundException;
import com.uco.campusmapservice.dao.CoordinateRepository;
import com.uco.campusmapservice.model.Coordinate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoordinateService {
    private final CoordinateRepository repository;

    @Autowired
    CoordinateService(CoordinateRepository repository) {
        this.repository = repository;
    }

    public Coordinate findById(String id) {
        Coordinate found = findTodoById(id);
        return found;
    }

    private Coordinate findTodoById(String name) {
        Optional<Coordinate> result = repository.findByName(name);
        return result.orElseThrow(() -> new CoordinateNotFoundException(name));
    }
}
