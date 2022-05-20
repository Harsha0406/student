package com.org.tcs.controller;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import com.org.tcs.service.StudentService;
import com.org.tcs.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentCntrl {
    @Autowired
    StudentService studentService ;


    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);

    }
    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student ){
        studentService.updateStudent(student);
    }
    @GetMapping("/getAll")
    public List<Student> getAll(){
        List<Student> list= studentService.getAll();
        return list;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        String s = studentService.deleteById(id);
        return s;
    }




}
