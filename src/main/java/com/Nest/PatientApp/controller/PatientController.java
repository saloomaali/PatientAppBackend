package com.Nest.PatientApp.controller;

import com.Nest.PatientApp.dao.PatientDao;
import com.Nest.PatientApp.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {

    @Autowired

    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> addPatient(@RequestBody Patients p){
        System.out.println(p.getPtn_Id());
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getMobNo());
        dao.save(p);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<Patients> viewPatient(){

        return (List<Patients>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<Patients> searchPatient(@RequestBody Patients p){

        System.out.println(p.getPtn_Id());
        return (List<Patients>) dao.searchPatient(p.getPtn_Id());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> deletePatient(@RequestBody Patients p){

        System.out.println(p.getId());
        dao.deletePatient(p.getId());

        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }



}
