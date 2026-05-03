package edu.isgb.school.service;

import edu.isgb.school.entities.*;
import edu.isgb.school.repository.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SchoolService {

    //Repositories Injection

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private InstructorRepository instructorRepository;

    @Autowired
    private CourseRepository courseRepository;


    // 8.a — Créer School

    public School createSchool(School school) {

        return schoolRepository.save(school);

    }


    // 8.b — Retourner School par ID


    public School getSchoolById(Integer id) {

        return schoolRepository.findById(id).orElse(null);

    }

    // 8.c — Créer Student


    public Student createStudent(Student student) {

        return studentRepository.save(student);

    }


    // 8.d — Lister Students


    public List<Student> getAllStudents() {

        return studentRepository.findAll();

    }


    // 8.e — Créer Instructor


    public Instructor createInstructor(Instructor instructor) {

        return instructorRepository.save(instructor);

    }

    // 8.f — Lister Instructor par nom


    public List<Instructor> getInstructorByName(String name) {

        return instructorRepository.findByName(name);

    }


    // 8.g — Retourner Instructor par ID


    public Instructor getInstructorById(Integer id) {

        return instructorRepository.findById(id).orElse(null);

    }


    // 8.h — Retourner Course par ID

    public Course getCourseById(Integer id) {

        return courseRepository.findById(id).orElse(null);

    }


    // 8.i — Lister Courses d’un Instructor

    public List<Course> getCoursesByInstructor(Integer instructorId) {

        Instructor instructor =
                instructorRepository.findById(instructorId).orElse(null);

        if (instructor != null) {

            return instructor.getCourses();

        }

        return null;

    }

    // 8.j — Ajouter Course à Instructor


    public Instructor addCourseToInstructor(
            Integer instructorId,
            Integer courseId) {

        Instructor instructor =
                instructorRepository.findById(instructorId).orElse(null);

        Course course =
                courseRepository.findById(courseId).orElse(null);

        if (instructor != null && course != null) {

            instructor.getCourses().add(course);

            return instructorRepository.save(instructor);

        }

        return null;

    }

}