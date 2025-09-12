package com.grallotbr.java_spring_task_api.user.adapter.input.controller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grallotbr.java_spring_task_api.user.application.service.output.GetUsersOutput;

import java.util.List;

public record GetUsersResponse(@JsonProperty("users") List<GetUserResponse> users) {

	public static GetUsersResponse from(final GetUsersOutput output) {

		return new GetUsersResponse(output.users().stream()
		                             .map(user -> GetUserResponse.from(user.email(), user.firstName(), user.lastName()))
		                             .toList());
	}

	public record GetUserResponse(@JsonProperty("email") String email,
	                              @JsonProperty("first_name") String firstName,
	                              @JsonProperty("last_name") String lastName) {

		public static GetUserResponse from(final String email, final String firstName, final String lastName) {

			return new GetUserResponse(email, firstName, lastName);
		}
	}
}
