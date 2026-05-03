package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Instructor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idInstructor;

    private String name;
    // Question 5 & 6
    // ManyToMany Instructor <-> Course
    // Bidirectionnel(cas2)
    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)

    private List<Course> courses;

    // Question 7
    // Instructor avec School ManyToOne bidirectionnelle

    @ManyToOne
    private School school;
    public Instructor() {}

    // GETTERS et SETTERS

    public Integer getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Integer idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}