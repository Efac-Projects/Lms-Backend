package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentRepository sRepo;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return sRepo.findAll();
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return sRepo.save(student);
    }

    @GetMapping("/students/{id}")
    public Student getAStudent(@PathVariable Long id) {
        return sRepo.findById(id).get();
    }


    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return sRepo.save(student);
    }
}


