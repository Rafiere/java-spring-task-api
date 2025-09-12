package com.grallotbr.java_spring_task_api.task.application.service;

import com.grallotbr.java_spring_task_api.task.application.port.input.GetTasksByUserUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.output.GetTasksByUserOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class GetTasksByUserService implements GetTasksByUserUseCase {

	public GetTasksByUserOutput execute() {

		return null;
	}
}
