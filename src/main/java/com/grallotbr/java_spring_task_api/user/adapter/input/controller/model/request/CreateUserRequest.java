package com.grallotbr.java_spring_task_api.user.adapter.input.controller.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateUserRequest(@JsonProperty("email")
                                @NotBlank(message = "Email is required")
                                @Email(message = "Email must be a valid email address")
                                @Size(max = 255, message = "Email cannot exceed 255 characters")
                                String email,

                                @JsonProperty("first_name")
                                @NotBlank(message = "First name is required")
                                @Size(min = 1, max = 50, message = "First name must be between 1 and 50 characters")
                                String firstName,

                                @JsonProperty("last_name")
                                @NotBlank(message = "Last name is required")
                                @Size(min = 1, max = 50, message = "Last name must be between 1 and 50 characters")
                                String lastName,

                                @JsonProperty("password")
                                @NotBlank(message = "Password is required")
                                @Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
                                String password) {

}
