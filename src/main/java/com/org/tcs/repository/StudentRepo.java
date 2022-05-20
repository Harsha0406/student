package com.org.tcs.repository;

import org.springframework.stereotype.Repository;

import com.org.tcs.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
