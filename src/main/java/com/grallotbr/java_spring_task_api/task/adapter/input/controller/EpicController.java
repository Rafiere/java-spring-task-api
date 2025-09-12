package com.grallotbr.java_spring_task_api.task.adapter.input.controller;

import com.grallotbr.java_spring_task_api.task.adapter.input.controller.request.CreateEpicRequest;
import com.grallotbr.java_spring_task_api.task.adapter.input.controller.request.UpdateEpicRequest;
import com.grallotbr.java_spring_task_api.task.application.port.input.CreateEpicUseCase;
import com.grallotbr.java_spring_task_api.task.application.port.input.UpdateEpicUseCase;
import com.grallotbr.java_spring_task_api.task.application.service.command.CreateEpicCommand;
import com.grallotbr.java_spring_task_api.task.application.service.command.UpdateEpicCommand;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/v1/epics")
public class EpicController {

	private final CreateEpicUseCase createEpicUseCase;
	private final UpdateEpicUseCase updateEpicUseCase;

	public EpicController(final CreateEpicUseCase createEpicUseCase,
	                      final UpdateEpicUseCase updateEpicUseCase) {

		this.createEpicUseCase = Objects.requireNonNull(createEpicUseCase);
		this.updateEpicUseCase = Objects.requireNonNull(updateEpicUseCase);
	}

	@PostMapping
	public ResponseEntity<Void> createEpic(@Valid @RequestBody final CreateEpicRequest request) {

		final CreateEpicCommand command = new CreateEpicCommand(
				request.name(),
				request.color()
		);

		createEpicUseCase.execute(command);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping("/{epicId}")
	public ResponseEntity<Void> updateEpic(@PathVariable final UUID epicId,
	                                       @Valid @RequestBody final UpdateEpicRequest request) {

		final UpdateEpicCommand command = new UpdateEpicCommand(
				epicId,
				request.name(),
				request.color()
		);

		updateEpicUseCase.execute(command);

		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
