package com.grallotbr.java_spring_task_api.task.application.service.command;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record UpdateEpicCommand(UUID epicId,
                                String name,
                                String color) {

}
