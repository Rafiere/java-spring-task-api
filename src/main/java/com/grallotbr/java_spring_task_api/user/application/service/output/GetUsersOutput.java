package com.grallotbr.java_spring_task_api.user.application.service.output;

import java.util.List;

public record GetUsersOutput(List<GetUserOutput> users) {

	public static GetUsersOutput from(final List<GetUserOutput> users) {

		return new GetUsersOutput(users);
	}

	public record GetUserOutput(String email,
	                            String firstName,
	                            String lastName) {

		public static GetUserOutput from(final String email,
		                                 final String firstName,
		                                 final String lastName) {

			return new GetUserOutput(email, firstName, lastName);
		}
	}
}
