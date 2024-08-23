package com.mohran.udemy.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User {

    @ManyToMany
    @JoinTable(
            name = "student_enrollments",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> enrollments;

    @ManyToMany
    @JoinTable(
            name = "student_completed_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> completedCourses;

    @ManyToMany
    @JoinTable(
            name = "student_wishlist_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> wishlistCourses;

    @ManyToMany
    @JoinTable(
            name = "student_favourite_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> favourites;

    // private Progress progress; // Example placeholder for future relationships
}
