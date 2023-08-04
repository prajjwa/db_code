package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> hello()
    {
        return List.of(new Student(23,2L,"Jake Paul", LocalDate.of(2012,12,3),"prajjwalfire@gmail.com"));
    }
}
