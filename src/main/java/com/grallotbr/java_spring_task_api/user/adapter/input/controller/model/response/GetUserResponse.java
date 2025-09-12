package com.grallotbr.java_spring_task_api.user.adapter.input.controller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grallotbr.java_spring_task_api.user.application.service.output.GetUserOutput;

public record GetUserResponse(@JsonProperty("email") String email,
                              @JsonProperty("first_name") String firstName,
                              @JsonProperty("last_name") String lastName) {

	public static GetUserResponse from(final GetUserOutput output) {

		return new GetUserResponse(output.email(), output.firstName(), output.lastName());
	}
}
