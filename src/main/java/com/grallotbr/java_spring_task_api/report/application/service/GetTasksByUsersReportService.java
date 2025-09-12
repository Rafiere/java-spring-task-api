package com.grallotbr.java_spring_task_api.report.application.service;

import com.grallotbr.java_spring_task_api.report.application.port.input.GetTasksByUsersReportUseCase;
import com.grallotbr.java_spring_task_api.report.application.service.output.GetTasksByUsersReportOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GetTasksByUsersReportService implements GetTasksByUsersReportUseCase {

	public GetTasksByUsersReportOutput execute() {

		return null;
	}
}
