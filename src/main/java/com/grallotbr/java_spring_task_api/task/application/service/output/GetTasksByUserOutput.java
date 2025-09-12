package com.grallotbr.java_spring_task_api.task.application.service.output;

import java.util.List;

public record GetTasksByUserOutput(String taskName,
                                   String taskDescription,
                                   String taskStatus,
                                   String taskCompletionDatetime,
                                   String epicId,
                                   String epicName,
                                   String epicColor,
                                   List<GetTasksSubtasksByUserOutput> subtasks) {

	public record GetTasksSubtasksByUserOutput(String subtaskId,
 	                                           String subtaskName,
 	                                           String subtaskDescription,
 	                                           String subtaskStatus,
 	                                           String subtaskCompletionDatetime) {

 	}

}
