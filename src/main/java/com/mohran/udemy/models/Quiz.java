package com.mohran.udemy.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quiz extends Section{
    private String name;
    private String description;
    private Set<Question> questions;
    private Date createAt ;
    private Date updateAt ;

}
