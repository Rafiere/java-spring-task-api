package com.grallotbr.java_spring_task_api.user.application.service;

import com.grallotbr.java_spring_task_api.user.application.port.in.CreateUserUseCase;
import com.grallotbr.java_spring_task_api.user.application.service.command.CreateUserCommand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CreateUserService implements CreateUserUseCase {

	public void execute(final CreateUserCommand command) {

	}
}
