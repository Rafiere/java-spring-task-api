package com.grallotbr.java_spring_task_api.task.application.service.command;

import com.grallotbr.java_spring_task_api.task.adapter.input.controller.request.UpdateTaskRequest;

import java.util.List;
import java.util.UUID;

public record UpdateTaskCommand(UUID taskId,
                                String taskName,
                                String taskDescription,
                                String taskStatus,
                                String taskCompletionDatetime,
                                String epicId,
                                List<UpdateSubtaskCommand> subtasks) {

	public static UpdateTaskCommand from(final UUID taskId, final UpdateTaskRequest request) {

		return new UpdateTaskCommand(
				taskId,
				request.taskName(),
				request.taskDescription() != null ? request.taskDescription() : null,
				request.taskStatus(),
				request.taskCompletionDatetime() != null ? request.taskCompletionDatetime() : null,
				request.epicId(),
				request.subtasks() != null ? request.subtasks().stream().map(UpdateSubtaskCommand::from).toList() : List.of()
		);
	}

	public record UpdateSubtaskCommand(UUID subtaskId,
	                                  String subtaskName,
	                                  String subtaskDescription,
	                                  String subtaskStatus,
	                                  String subtaskCompletionDatetime) {

		public static UpdateSubtaskCommand from(final UpdateTaskRequest.UpdateSubtaskRequest request) {
			return new UpdateSubtaskCommand(
					UUID.fromString(request.subtaskId()),
					request.subtaskName(),
					request.subtaskDescription() != null ? request.subtaskDescription() : null,
					request.subtaskStatus(),
					request.subtaskCompletionDatetime()
			);
		}
	}
}
