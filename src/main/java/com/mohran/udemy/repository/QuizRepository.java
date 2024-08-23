package com.mohran.udemy.repository;

import com.mohran.udemy.models.Quiz;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends GenericRepository<Quiz,Long>{
}
