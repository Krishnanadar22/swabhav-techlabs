package com.techlabs.core.exceptions;

@SuppressWarnings("serial")
public class OutOfBoardException extends RuntimeException {
	@Override
	public String toString() {
		return ("Please enter correct co-ordinates");
	}
}
