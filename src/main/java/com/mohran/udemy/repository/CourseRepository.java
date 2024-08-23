package com.mohran.udemy.repository;

import com.mohran.udemy.models.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends GenericRepository<Course,Long> {
}
