package com.mohran.udemy.repository;


import com.mohran.udemy.models.Lecture;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends GenericRepository<Lecture,Long> {
}
