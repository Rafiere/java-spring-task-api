package com.grallotbr.java_spring_task_api.task.application.port.input;

import com.grallotbr.java_spring_task_api.task.application.service.output.GetTasksByUserOutput;

import java.util.UUID;

public interface GetTasksByUserUseCase {

	GetTasksByUserOutput execute(UUID userId);
}
