package com.uco.campusmapservice.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CoordinateNotFoundException extends RuntimeException{

    public CoordinateNotFoundException(String message){
        super(message);
    }
}
