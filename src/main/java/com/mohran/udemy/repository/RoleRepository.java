package com.mohran.udemy.repository;

import com.mohran.udemy.models.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends GenericRepository<Role,Long>{
    Role findByName(String role);
}
