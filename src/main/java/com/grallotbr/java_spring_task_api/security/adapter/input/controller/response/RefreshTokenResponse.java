package com.grallotbr.java_spring_task_api.security.adapter.input.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grallotbr.java_spring_task_api.security.application.service.output.RefreshTokenOutput;

public record RefreshTokenResponse(@JsonProperty("access_token") String accessToken,
                                   @JsonProperty("refresh_token") String refreshToken) {

	public static RefreshTokenResponse from(final RefreshTokenOutput output) {

		return new RefreshTokenResponse(output.accessToken(), output.refreshToken());
	}
}
