package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDepartment;

    private String name;
    // Question 2
    // ManyToOne avecSchool Bidirectionnel
    @ManyToOne

    private School school;
    //constructeur vide

    public Department() {}

    // GETTERS et SETTERS

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}