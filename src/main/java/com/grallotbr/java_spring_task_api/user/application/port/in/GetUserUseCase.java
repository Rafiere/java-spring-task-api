package com.grallotbr.java_spring_task_api.user.application.port.in;

import com.grallotbr.java_spring_task_api.user.application.service.output.GetUserOutput;

import java.util.UUID;

public interface GetUserUseCase {

	GetUserOutput execute(UUID id);
}
