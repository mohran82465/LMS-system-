package com.mohran.udemy.repository;

import com.mohran.udemy.models.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends GenericRepository<Question,Long>{
}
