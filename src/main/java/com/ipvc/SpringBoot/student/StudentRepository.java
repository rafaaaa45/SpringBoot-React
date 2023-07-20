package com.ipvc.SpringBoot.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //@Query("Select s From Student s Where s.email = ?1")
    Optional<Student> findByEmail(String Email);
}
