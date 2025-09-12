package com.grallotbr.java_spring_task_api.user.application.service;

import com.grallotbr.java_spring_task_api.user.application.port.in.GetUsersUseCase;
import com.grallotbr.java_spring_task_api.user.application.service.output.GetUsersOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GetUsersService implements GetUsersUseCase {

	public GetUsersOutput execute() {

		return null;
	}
}
