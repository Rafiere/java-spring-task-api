package com.grallotbr.java_spring_task_api.user.application.service;

import com.grallotbr.java_spring_task_api.user.application.port.in.GetUserUseCase;
import com.grallotbr.java_spring_task_api.user.application.service.output.GetUserOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class GetUserService implements GetUserUseCase {

	public GetUserOutput execute(final UUID id) {

		return null;
	}
}
