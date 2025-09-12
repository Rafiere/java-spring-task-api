package com.grallotbr.java_spring_task_api.security.adapter.input.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grallotbr.java_spring_task_api.security.application.service.output.LoginOutput;

public record LoginResponse(@JsonProperty("access_token") String accessToken,
							@JsonProperty("refresh_token") String refreshToken) {

	public static LoginResponse from(final LoginOutput output) {

		return new LoginResponse(output.accessToken(), output.refreshToken());
	}
}
