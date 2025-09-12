package com.grallotbr.java_spring_task_api.report.adapter.input.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grallotbr.java_spring_task_api.report.application.service.output.GetTasksByUsersReportOutput;

import java.util.List;

public record GetTasksByUsersReportResponse(List<GetTasksByUserReportResponse> users) {

	public static GetTasksByUsersReportResponse from(final GetTasksByUsersReportOutput output) {

		return new GetTasksByUsersReportResponse(
				output.users().stream().map(GetTasksByUserReportResponse::from).toList()
		);
	}

	public record GetTasksByUserReportResponse(@JsonProperty("user_id") String userId,
	                                           @JsonProperty("first_name") String firstName,
	                                           @JsonProperty("last_name") String lastName,
	                                           @JsonProperty("tasks") List<GetTaskReportResponse> tasks) {

		public static GetTasksByUserReportResponse from(final GetTasksByUsersReportOutput.GetTasksByUserReportOutput output) {

			return new GetTasksByUserReportResponse(
					output.userId(),
					output.firstName(),
					output.lastName(),
					output.tasks().stream().map(task -> new GetTasksByUsersReportOutput(task)).toList()
			);
		}
	}

	public record GetTaskReportResponse(@JsonProperty("task_id") String taskId,
	                                    @JsonProperty("task_name") String taskName,
	                                    @JsonProperty("task_description") String taskDescription,
	                                    @JsonProperty("task_completion_datetime") String taskCompletionDatetime,
	                                    @JsonProperty("epic_id") String epicId,
	                                    @JsonProperty("epic_name") String epicName,
	                                    @JsonProperty("epic_color") String epicColor,
	                                    @JsonProperty("subtasks") List<GetSubtaskReportResponse> subtasks) {

		public static GetTaskReportResponse from(final GetTasksByUsersReportOutput.GetTaskReportOutput output) {

			return new GetTaskReportResponse(
					output.taskId(),
					output.taskName(),
					output.taskDescription() != null ? output.taskDescription() : null,
					output.taskCompletionDatetime() != null ? output.taskCompletionDatetime().toString() : null,
					output.epicId() != null ? output.epicId() : null,
					output.epicName() != null ? output.epicName() : null,
					output.epicColor() != null ? output.epicColor() : null,
					output.subtasks().stream().map(GetSubtaskReportResponse::from).toList()
			);
		}
	}

	public record GetSubtaskReportResponse(@JsonProperty("subtask_id") String subtaskId,
	                                       @JsonProperty("subtask_name") String subtaskName,
	                                       @JsonProperty("subtask_description") String subtaskDescription,
	                                       @JsonProperty("subtask_completion_datetime") String subtaskCompletionDatetime) {

		public static GetSubtaskReportResponse from(final GetTasksByUsersReportOutput.GetSubtaskReportOutput output) {

			return new GetSubtaskReportResponse(
					output.subtaskId(),
					output.subtaskName(),
					output.subtaskDescription() != null ? output.subtaskDescription() : null,
					output.subtaskCompletionDatetime() != null ? output.subtaskCompletionDatetime() : null
			);
		}
	}
}
