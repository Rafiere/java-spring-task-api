package com.grallotbr.java_spring_task_api.task.adapter.input.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grallotbr.java_spring_task_api.task.application.service.output.GetTasksByUserOutput;

import java.util.List;

public record GetTasksByUserResponse(@JsonProperty("task_name") String taskName,
                                     @JsonProperty("task_description") String taskDescription,
                                     @JsonProperty("task_status") String taskStatus,
                                     @JsonProperty("task_completion_datetime") String taskCompletionDatetime,
                                     @JsonProperty("epic_id") String epicId,
                                     @JsonProperty("epic_name") String epicName,
                                     @JsonProperty("epic_color") String epicColor,
                                     @JsonProperty("subtasks") List<GetTasksSubtasksByUserResponse> subtasks) {

	public static GetTasksByUserResponse from(final GetTasksByUserOutput output) {

		return new GetTasksByUserResponse(
			output.taskName(),
			output.taskDescription(),
			output.taskStatus(),
			output.taskCompletionDatetime() != null ? output.taskCompletionDatetime() : null,
			output.epicId() != null ? output.epicId() : null,
			output.epicName() != null ? output.epicName() : null,
			output.epicColor() != null ? output.epicColor() : null,
			output.subtasks().stream().map(GetTasksSubtasksByUserResponse::from).toList()
		);
	}

	public record GetTasksSubtasksByUserResponse(@JsonProperty("subtask_id") String subtaskId,
	                                             @JsonProperty("subtask_name") String subtaskName,
	                                             @JsonProperty("subtask_description") String subtaskDescription,
	                                             @JsonProperty("subtask_status") String subtaskStatus,
	                                             @JsonProperty("subtask_completion_datetime") String subtaskCompletionDatetime) {

		public static GetTasksSubtasksByUserResponse from(final GetTasksByUserOutput.GetTasksSubtasksByUserOutput subtask) {

			return new GetTasksSubtasksByUserResponse(
				subtask.subtaskId(),
				subtask.subtaskName(),
				subtask.subtaskDescription() != null ? subtask.subtaskDescription() : null,
				subtask.subtaskStatus(),
				subtask.subtaskCompletionDatetime() != null ? subtask.subtaskCompletionDatetime() : null
			);
		}
	}
}
