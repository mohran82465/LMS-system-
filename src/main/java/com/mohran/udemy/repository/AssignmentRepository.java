package com.mohran.udemy.repository;

import com.mohran.udemy.models.Assignment;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends GenericRepository<Assignment,Long> {
}
