package com.grallotbr.java_spring_task_api.security.adapter.input.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(@JsonProperty("email")
                           @NotBlank(message = "Email is required")
                           @Email(message = "Email must be a valid email address")
                           @Size(max = 255, message = "Email cannot exceed 255 characters")
                           String email,

                           @JsonProperty("password")
                           @NotBlank(message = "Password is required")
                           @Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
                           String password) {

}
