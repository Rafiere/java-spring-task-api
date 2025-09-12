package com.grallotbr.java_spring_task_api.user.application.service.command;

public record CreateUserCommand(String email,
                                String firstName,
                                String lastName,
                                String password) {

	public static CreateUserCommand with(final String email,
	                                     final String firstName,
	                                     final String lastName,
	                                     final String password) {

		return new CreateUserCommand(email, firstName, lastName, password);
	}
}
