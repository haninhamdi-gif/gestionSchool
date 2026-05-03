package edu.isgb.school.repository;

import edu.isgb.school.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructorRepository
        extends JpaRepository<Instructor, Integer> {

    // Question 8 — f
    // Lister Instructor par nom

    List<Instructor> findByName(String name);

}