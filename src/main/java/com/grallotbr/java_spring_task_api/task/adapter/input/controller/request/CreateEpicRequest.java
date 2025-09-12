package com.grallotbr.java_spring_task_api.task.adapter.input.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CreateEpicRequest(@JsonProperty("name")
                                @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
                                @NotBlank(message = "Name is required")
                                String name,

                                @Size(min = 7, max = 7, message = "Color must be a valid hex color code")
                                @NotBlank(message = "Color is required")
                                @JsonProperty("color")
                                @Pattern(regexp = "^#([A-Fa-f0-9]{6})$", message = "Color must be a valid hex color code")
                                String color) {

}
