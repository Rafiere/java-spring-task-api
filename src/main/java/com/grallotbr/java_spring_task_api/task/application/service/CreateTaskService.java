package com.grallotbr.java_spring_task_api.task.application.service;

import com.grallotbr.java_spring_task_api.task.application.port.input.CreateTaskUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.command.CreateTaskCommand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CreateTaskService implements CreateTaskUseCase {

	public void execute(final CreateTaskCommand command) {

	}
}
