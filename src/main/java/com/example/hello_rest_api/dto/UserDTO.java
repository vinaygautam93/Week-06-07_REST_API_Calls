package com.example.hello_rest_api.dto;


// DTO class for user details in UC4 and UC5
public class UserDTO {
    private String firstName;
    private String lastName;

    // Default Constructor
    public UserDTO() {}

    // Parameterized Constructor
    public UserDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
