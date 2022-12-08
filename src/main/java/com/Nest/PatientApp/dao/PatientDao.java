package com.Nest.PatientApp.dao;

import com.Nest.PatientApp.model.Patients;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientDao extends CrudRepository<Patients, Integer> {

    @Query(value = "SELECT `id`, `age`, `mob_no`, `name`, `ptn_id` FROM `patients` WHERE `ptn_id` LIKE %:ptn_Id%", nativeQuery = true)
    List<Patients> searchPatient(Integer ptn_Id);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id` = :id", nativeQuery = true)
    void deletePatient(Integer id);
}
