package com.techlabs.core.exceptions;

@SuppressWarnings("serial")
public class MarkAlreadySetOnCellException extends RuntimeException {
	@Override
	public String toString() {
		return ("Cell was already marked");
	}
}
