package com.techlabs.app.exceptions;

@SuppressWarnings("serial")
public class ExportException extends RuntimeException {
	@Override
	public String getMessage() {
		return ("Exception occured while trying to create resumes");
	}
}
