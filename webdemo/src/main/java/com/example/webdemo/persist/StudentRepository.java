package com.example.webdemo.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webdemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByNeptunCode(String neptunCode);

}
