package com.mohran.udemy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    private Long id ;
    private String questionContent;
    private String options;
    private String correctAnswer;
    private Date createAt;
    private Date updateAt;

}
