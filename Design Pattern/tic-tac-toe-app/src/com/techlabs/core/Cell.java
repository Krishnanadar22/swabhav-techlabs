package com.techlabs.core;

import com.techlabs.core.exceptions.MarkAlreadySetOnCellException;

public class Cell {
	private Mark mark;

	public Cell() {
		mark = Mark.EMPTY;
	}

	public void setMark(Mark m) {
		if (this.mark != Mark.EMPTY) {
			throw new MarkAlreadySetOnCellException();
		}
		this.mark = m;
	}

	public Mark getMark() {
		return this.mark;
	}

	@Override
	public String toString() {
		return this.mark.toString();
	}
}
