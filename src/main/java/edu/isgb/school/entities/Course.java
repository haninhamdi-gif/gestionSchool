package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idCourse;

    private String name;

    // Question 6
    // ManyToMany  instructor et courses bidirectionnelle (cas 2)
    @ManyToMany(mappedBy = "courses")

    private List<Instructor> instructors;
    //constructeur vide

    public Course() {}

    // GETTERS et SETTERS

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
}
