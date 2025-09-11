package com.grallotbr.java_spring_task_api.security.application.port.input;

import com.grallotbr.java_spring_task_api.security.application.service.command.LoginCommand;
import com.grallotbr.java_spring_task_api.security.application.service.output.LoginOutput;

public interface LoginUseCase {

	LoginOutput execute(LoginCommand command);
}
