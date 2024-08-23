package com.mohran.udemy.repository;

import com.mohran.udemy.models.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends GenericRepository<Student,Long>{
}
