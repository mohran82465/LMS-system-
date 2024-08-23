package com.mohran.udemy.models;

import jakarta.persistence.*;
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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    private Double price;
    private String courseImg;
    private String promotionalVideo;
    private Date createAt;
    private Date updatedAt;

    @ManyToMany(mappedBy = "enrollments")
    private Set<Student> enrolledStudents;

    @ManyToMany(mappedBy = "completedCourses")
    private Set<Student> completedBy;

    @ManyToMany(mappedBy = "wishlistCourses")
    private Set<Student> wishlistedBy;

    @ManyToMany(mappedBy = "favourites")
    private Set<Student> favouritedBy;

    // Uncomment and properly annotate if needed
    // @OneToMany(mappedBy = "course")
    // private List<Section> contents;
}
