package com.grallotbr.java_spring_task_api.task.application.port.input;

import java.util.UUID;

public interface DeleteTaskUseCase {

	void execute(UUID id);
}
