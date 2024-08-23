package com.mohran.udemy.repository;

import com.mohran.udemy.models.Admin;
import com.mohran.udemy.models.Instructor;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends GenericRepository<Instructor,Long> {
}
