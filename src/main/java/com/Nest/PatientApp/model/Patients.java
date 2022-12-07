package com.Nest.PatientApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patients {


    @Id
    @GeneratedValue
    private int id;
    private int ptn_Id;
    private String name;
    private int age;
    private String mobNo;

    public Patients() {
    }

    public Patients(int id, int ptn_Id, String name, int age, String mobNo) {
        this.id = id;
        this.ptn_Id = ptn_Id;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPtn_Id() {
        return ptn_Id;
    }

    public void setPtn_Id(int ptn_Id) {
        this.ptn_Id = ptn_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
