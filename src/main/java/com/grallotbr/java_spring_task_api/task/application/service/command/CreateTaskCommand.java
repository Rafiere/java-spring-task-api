package com.grallotbr.java_spring_task_api.task.application.service.command;

import com.grallotbr.java_spring_task_api.task.adapter.input.controller.request.CreateTaskRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

public record CreateTaskCommand(String taskName,
                                String taskDescription,
                                String taskStatus,
                                String taskCompletionDatetime,
                                String epicId,
                                List<CreateSubtaskCommand> subtasks) {

	public static CreateTaskCommand from(final CreateTaskRequest request) {

		return new CreateTaskCommand(
			request.taskName(),
			request.taskDescription(),
			request.taskStatus(),
			request.taskCompletionDatetime() != null ? request.taskCompletionDatetime() : null,
			request.epicId() != null ? request.epicId() : null,
			CreateSubtaskCommand.from(request.subtasks())
		);
	}

	public record CreateSubtaskCommand(String subtaskName,
	                                   String subtaskDescription,
	                                   String subtaskStatus,
	                                   String subtaskCompletionDatetime) {

		public static List<CreateSubtaskCommand> from(final List<CreateTaskRequest.CreateSubtaskRequest> subtasks) {

			return subtasks.stream()
				.map(subtask -> new CreateSubtaskCommand(
					subtask.subtaskName(),
					subtask.subtaskDescription(),
					subtask.subtaskStatus(),
					subtask.subtaskCompletionDatetime() != null ? subtask.subtaskCompletionDatetime() : null
				)).toList();
		}
	}
}
