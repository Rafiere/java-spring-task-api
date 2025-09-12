package com.grallotbr.java_spring_task_api.security.application.service;

import com.grallotbr.java_spring_task_api.security.application.port.input.LoginUseCase;
import com.grallotbr.java_spring_task_api.security.application.service.command.LoginCommand;
import com.grallotbr.java_spring_task_api.security.application.service.output.LoginOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService implements LoginUseCase {

	public LoginOutput execute(final LoginCommand command) {

		return null;
	}
}
