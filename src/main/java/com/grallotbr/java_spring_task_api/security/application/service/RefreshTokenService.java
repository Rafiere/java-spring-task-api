package com.grallotbr.java_spring_task_api.security.application.service;

import com.grallotbr.java_spring_task_api.security.application.port.input.RefreshTokenUseCase;
import com.grallotbr.java_spring_task_api.security.application.service.command.RefreshTokenCommand;
import com.grallotbr.java_spring_task_api.security.application.service.output.RefreshTokenOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RefreshTokenService implements RefreshTokenUseCase {

	public RefreshTokenOutput execute(final RefreshTokenCommand command) {

		return null;
	}
}
