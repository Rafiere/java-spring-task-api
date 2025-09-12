package com.grallotbr.java_spring_task_api.task.application.service;

import com.grallotbr.java_spring_task_api.task.application.port.input.UpdateEpicUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.command.UpdateEpicCommand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UpdateEpicService implements UpdateEpicUseCase {

	public void execute(final UpdateEpicCommand command) {

	}
}
