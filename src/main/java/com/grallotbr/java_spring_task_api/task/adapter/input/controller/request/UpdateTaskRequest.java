package com.grallotbr.java_spring_task_api.task.adapter.input.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

public record UpdateTaskRequest(@JsonProperty("task_name")
                                @Size(min = 1, max = 50, message = "Task name must be between 1 and 50 characters")
                                String taskName,

                                @JsonProperty("task_description")
                                @Size(max = 50, message = "Task description must be up to 50 characters")
                                String taskDescription,

                                @JsonProperty("task_status")
                                String taskStatus,

                                @JsonProperty("task_completion_datetime")
                                @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}(:\\d{2})?$", message = "Task completion datetime must be in the format YYYY-MM-DDTHH:MM or YYYY-MM-DDTHH:MM:SS")
                                String taskCompletionDatetime,

                                @JsonProperty("epic_id")
                                String epicId,

                                @JsonProperty("subtasks") List<UpdateSubtaskRequest> subtasks) {

	public record UpdateSubtaskRequest(@JsonProperty("subtask_id")
	                                   @NotBlank(message = "Subtask ID is required")
	                                   String subtaskId,

									   @JsonProperty("subtask_name")
	                                   @Size(min = 1, max = 50, message = "Subtask name must be between 1 and 50 characters")
	                                   String subtaskName,

	                                   @JsonProperty("subtask_description")
	                                   @Size(max = 50, message = "Subtask description must be up to 50 characters")
	                                   String subtaskDescription,

	                                   @JsonProperty("subtask_status")
	                                   String subtaskStatus,

	                                   @JsonProperty("subtask_completion_datetime")
	                                   @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}(:\\d{2})?$", message = "Subtask completion datetime must be in the format YYYY-MM-DDTHH:MM or YYYY-MM-DDTHH:MM:SS")
	                                   String subtaskCompletionDatetime) {
	}
}
