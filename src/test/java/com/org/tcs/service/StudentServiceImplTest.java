package com.org.tcs.service;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {
    @InjectMocks
    private StudentServiceImpl studentService;
    @Mock
    private StudentRepo studentRepo;

    @Test
    void createStudent() {
        Student student=new Student();
        student.setId(100);
        student.setName("Harsha");
        student.setAddress("VSP");
        studentService.createStudent(student);
        Mockito.verify(studentRepo,Mockito.times(1)).save(student);

    }

    @Test
    void updateStudent() {
    }

    @Test
    void getAll() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void getById() {
    }
}