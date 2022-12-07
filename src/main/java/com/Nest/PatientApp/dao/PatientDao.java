package com.Nest.PatientApp.dao;

import com.Nest.PatientApp.model.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patients, Integer> {
}
