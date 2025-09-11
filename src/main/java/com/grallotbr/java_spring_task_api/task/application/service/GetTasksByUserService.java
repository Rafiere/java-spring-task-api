package com.grallotbr.java_spring_task_api.task.application.service;

import com.grallotbr.java_spring_task_api.task.application.port.input.GetTasksByUserUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.output.GetTasksByUserOutput;

import java.util.UUID;

public class GetTasksByUserService implements GetTasksByUserUseCase {

	public GetTasksByUserOutput execute(final UUID userId) {

		return null;
	}
}
