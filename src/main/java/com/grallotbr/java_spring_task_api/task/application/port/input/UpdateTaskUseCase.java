package com.grallotbr.java_spring_task_api.task.application.port.input;

import com.grallotbr.java_spring_task_api.task.application.service.command.UpdateTaskCommand;

public interface UpdateTaskUseCase {

	void execute(UpdateTaskCommand command);
}
