package com.Nest.PatientApp.controller;

import com.Nest.PatientApp.dao.PatientDao;
import com.Nest.PatientApp.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired

    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addPatient(@RequestBody Patients p){
        System.out.println(p.getPtn_Id());
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getMobNo());
        dao.save(p);

        return "patient added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<Patients> viewPatient(){

        return (List<Patients>) dao.findAll();
    }

}
