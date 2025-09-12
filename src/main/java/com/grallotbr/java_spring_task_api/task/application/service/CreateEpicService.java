package com.grallotbr.java_spring_task_api.task.application.service;

import com.grallotbr.java_spring_task_api.task.application.port.input.CreateEpicUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.command.CreateEpicCommand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CreateEpicService implements CreateEpicUseCase {

	public void execute(final CreateEpicCommand command) {

	}
}
