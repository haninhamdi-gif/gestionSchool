package edu.isgb.school.controller;

import edu.isgb.school.entities.*;
import edu.isgb.school.service.SchoolService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/school")
public class TestSchoolController {

    private final SchoolService schoolService;

    public TestSchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    // 8.a — Create School
    @PostMapping("/createSchool")
    public School createSchool(@RequestBody School school) {
        return schoolService.createSchool(school);
    }

    // 8.b — Get School by ID
    @GetMapping("/getSchool/{id}")
    public School getSchoolById(@PathVariable Integer id) {
        return schoolService.getSchoolById(id);
    }

    // 8.c — Create Student
    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {
        return schoolService.createStudent(student);
    }

    // 8.d — List Students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return schoolService.getAllStudents();
    }

    // 8.e — Create Instructor
    @PostMapping("/createInstructor")
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return schoolService.createInstructor(instructor);
    }

    // 8.f — Get Instructor by Name
    @GetMapping("/instructorByName")
    public List<Instructor> getInstructorByName(@RequestParam String name) {
        return schoolService.getInstructorByName(name);
    }

    // 8.g — Get Instructor by ID
    @GetMapping("/getInstructor/{id}")
    public Instructor getInstructorById(@PathVariable Integer id) {
        return schoolService.getInstructorById(id);
    }

    // 8.h — Get Course by ID
    @GetMapping("/getCourse/{id}")
    public Course getCourseById(@PathVariable Integer id) {
        return schoolService.getCourseById(id);
    }

    // 8.i — Get Courses of Instructor
    @GetMapping("/getInstructor/{id}/courses")
    public List<Course> getCoursesByInstructor(@PathVariable Integer id) {
        return schoolService.getCoursesByInstructor(id);
    }

    // 8.j — Add Course to Instructor
    @PostMapping("/instructor/{id}/addCourse/{courseId}")
    public Instructor addCourseToInstructor(
            @PathVariable Integer id,
            @PathVariable Integer courseId) {
        return schoolService.addCourseToInstructor(id, courseId);
    }
}