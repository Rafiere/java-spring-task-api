package com.grallotbr.java_spring_task_api.security.application.port.input;

import com.grallotbr.java_spring_task_api.security.application.service.command.RefreshTokenCommand;
import com.grallotbr.java_spring_task_api.security.application.service.output.RefreshTokenOutput;

public interface RefreshTokenUseCase {

	RefreshTokenOutput execute(RefreshTokenCommand command);
}
