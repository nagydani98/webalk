package com.example.webdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdemo.model.Student;
import com.example.webdemo.persist.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class StudentService {

    private final StudentRepository studentRepository;

    public Student getStudentByNeptunCode(String neptunCode) {
        return studentRepository.findByNeptunCode(neptunCode);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.saveAndFlush(student);
    }

}
