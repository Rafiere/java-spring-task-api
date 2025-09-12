package com.grallotbr.java_spring_task_api.task.application.service;

import com.grallotbr.java_spring_task_api.task.application.port.input.UpdateTaskUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.command.UpdateTaskCommand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UpdateTaskService implements UpdateTaskUseCase {

	public void execute(final UpdateTaskCommand command) {

	}
}
