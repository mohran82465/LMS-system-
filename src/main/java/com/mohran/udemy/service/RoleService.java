package com.mohran.udemy.service;

import com.mohran.udemy.models.Role;
import com.mohran.udemy.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class RoleService {
    private RoleRepository repository;
    @Autowired
    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }


    public List<Role> getAllRoles(){
        return repository.findAll();
    }

    public Role getRoleById(Long id){
        return repository.findById(id).get();
    }
    public Role getRoleByName(String role){
        return repository.findByName(role);

    }
}
