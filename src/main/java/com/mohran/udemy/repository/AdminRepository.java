package com.mohran.udemy.repository;

import com.mohran.udemy.models.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends GenericRepository<Admin,Long> {
}
