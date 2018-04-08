package com.techlabs.core.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.core.Cell;
import com.techlabs.core.Mark;
import com.techlabs.core.exceptions.MarkAlreadySetOnCellException;

public class TestCell {

	Cell cell = new Cell();

	@Test
	public void testCellCreatedWithNoMark() {
		assertEquals(cell.getMark(), Mark.EMPTY);
	}

	@Test
	public void testSetMark() {

		cell.setMark(Mark.X);

		assertEquals(cell.getMark(), Mark.X);
	}

	@Test(expected = MarkAlreadySetOnCellException.class)
	public void testMarkAlreadySetOnCellException() {
		cell.setMark(Mark.O);
		cell.setMark(Mark.O);
	}
}
