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
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String name ;

    private String email;

    private String firstName;

    private String lastName;

    private String profilePicture;

    private String phoneNumber;

    private String address;

    private String bio ;

    @ManyToMany
    @JoinTable(name = "userRole",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    private Date createAt;

    private Date updatedAt;

//
//    first_name: String, first name of the user
//    last_name: String, last name of the user
//    profile_picture: String, URL to the user's profile picture
//    phone_number: String, phone number of the user
//    date_of_birth: Date, user's birthdate
//    address: String, user's address
//    bio: String, short biography or description of the user
//    role: Enum/String, indicating the role (student, instructor, admin)
//    created_at: Timestamp, when the user was created
//    updated_at: Timestamp, when the user details were last updated
}
