package com.mohran.udemy.repository;

import com.mohran.udemy.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User,Long>{

}