package com.uco.campusmapservice.controller;

import com.uco.campusmapservice.dao.CoordinateRepository;
import com.uco.campusmapservice.model.Coordinate;
import com.uco.campusmapservice.model.Request;
import com.uco.campusmapservice.service.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/campusmapservice")
public class Controller {

    @Autowired
    private CoordinateService service;

    @RequestMapping(path = "/getcoordinate/{name}", method = RequestMethod.GET)
    public Coordinate getCoordinate(@PathVariable String name)
    {
        return service.findById(name);
    }

    @RequestMapping(path = "/getroute", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public List<Coordinate> getRoute(@RequestBody Request request)
    {
        List<Coordinate> list = new ArrayList<>();
        list.add(service.findById(request.getFrom()));
        list.add(service.findById(request.getTo()));
        return list;
    }
}
