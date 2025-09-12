package com.grallotbr.java_spring_task_api.report.adapter.input.controller;

import com.grallotbr.java_spring_task_api.report.adapter.input.controller.response.GetTasksByUsersReportResponse;
import com.grallotbr.java_spring_task_api.report.application.port.input.GetTasksByUsersReportUseCase;
import com.grallotbr.java_spring_task_api.report.application.service.output.GetTasksByUsersReportOutput;
import com.grallotbr.java_spring_task_api.task.application.port.input.GetTasksByUserUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.output.GetTasksByUserOutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/reports")
public class ReportController {

	private final GetTasksByUsersReportUseCase getTasksByUsersReportUseCase;

	public ReportController(final GetTasksByUsersReportUseCase getTasksByUsersReportUseCase) {

		this.getTasksByUsersReportUseCase = getTasksByUsersReportUseCase;
	}

	@GetMapping("/users/tasks")
	public ResponseEntity<GetTasksByUsersReportResponse> getTasksByUser() {

		final GetTasksByUsersReportOutput output = getTasksByUsersReportUseCase.execute();

		final GetTasksByUsersReportResponse response = GetTasksByUsersReportResponse.from(output);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
