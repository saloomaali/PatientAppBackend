package com.Nest.PatientApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addPatient(){
        return "patient added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public String viewPatient(){

        return "patient view";
    }

}
