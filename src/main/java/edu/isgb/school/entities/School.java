package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class School implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSchool;

    private String name;

    private Integer phone;

    // Question 2
    // Relation School avecDepartmen OneToMany BIDIRECTIONNEL (Cas 3 )
    @OneToMany(mappedBy = "school",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Department> departments;
    // Question 7
    // Relation School avec Student OneToMany BIDIRECTIONNEL


    @OneToMany(mappedBy = "school",
            cascade = CascadeType.ALL)

    private List<Student> students;

    // Question 7
    // Relation School avec Instructor OneToMany BIDIRECTIONNElle
    @OneToMany(mappedBy = "school",
            cascade = CascadeType.ALL)

    private List<Instructor> instructors;

    public School() {}

    // .GETTERS et SETTERS

    public Integer getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(Integer idSchool) {
        this.idSchool = idSchool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
}