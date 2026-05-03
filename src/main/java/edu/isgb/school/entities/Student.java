package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idStudent;

    private String name;
    private Date birthDate;

    // Question 4
    //Student avec  AddressOneToOne Unidirectionnel ( on chosit cas3)
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    // Question 7
    // Student <-> School
    // ManyToOne
    @ManyToOne
    private School school;
    //constructeur vide
    public Student() {}
    //getters et setters//
    public Integer getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}