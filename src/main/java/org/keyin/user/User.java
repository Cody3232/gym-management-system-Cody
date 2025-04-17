// Script for User.java “I created a base User class to hold shared properties like name, password, and role. The Trainer, Member, and Admin classes inherit from this, which helps reduce code duplication and follows object-oriented programming best practices like inheritance and encapsulation.”

//“Since the login logic only needs a few user details, I added a second constructor to support loading users from the database without requiring all their contact information.”

package org.keyin.user;//

//*
// This is the parent class for all users, There are 3 types of users: Trainer, Member, and Admin
//
// *// Protected => used to restrict access to members of a class such that they are accessible within their own package and by subclasses
public class User {
    protected long id;
    protected String username;
    protected String password;
    protected String role;
    protected String email;
    protected String phoneNumber;
    protected String address;


// Constructors
public User() {
    // no-arg constructor
}

public User(String username, String password, String role, String email, String phoneNumber, String address) {
    this.username = username;
    this.password = password;
    this.role = role;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
}

public User(long id, String username, String password, String role) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.role = role;
}

// getter and setters
public String getUsername() {
    return username;
}

public void setUsername (String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getRole() {
    return role;
}

public void setRole (String role) {
    this.role = role;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber (String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

@Override
public String toString() {
    return "User{" +
            "username='" + username + '\'' +
            ", role='" + role + '\'' +
            ", email='" + email + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", address='" + address + '\'' +
            '}';
}
}