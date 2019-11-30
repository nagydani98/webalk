package com.example.webdemo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.webdemo.model.Student;
import com.example.webdemo.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "students")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class StudentController {

    private final StudentService studentService;

    @GetMapping("{neptunCode}")
    public ResponseEntity<Student> getStudentByNeptunCode(@PathVariable String neptunCode) {
        return ResponseEntity.ok(studentService.getStudentByNeptunCode(neptunCode));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }
    
    

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentService.createStudent(student);
        return ResponseEntity.created(
                URI.create(savedStudent.getNeptunCode()))
                .body(savedStudent);
    }

}
