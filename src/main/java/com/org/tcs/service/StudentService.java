package com.org.tcs.service;

import com.org.tcs.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentService {
    public Student getById( Integer id);
    public void createStudent(Student student);
    public void updateStudent( Student student );
    public List<Student> getAll();
    public String deleteById(Integer id);

}
