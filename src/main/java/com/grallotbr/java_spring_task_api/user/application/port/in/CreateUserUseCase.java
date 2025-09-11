package com.grallotbr.java_spring_task_api.user.application.port.in;

import com.grallotbr.java_spring_task_api.user.application.service.command.CreateUserCommand;

public interface CreateUserUseCase {

	void execute(CreateUserCommand command);
}
