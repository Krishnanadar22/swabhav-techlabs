package com.techlabs.core.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.core.Board;
import com.techlabs.core.Mark;
import com.techlabs.core.Player;
import com.techlabs.core.exceptions.OutOfBoardException;

public class TestBoard {

	Board board = new Board();
	Player p = new Player("K", Mark.O);

	@Test
	public void testSetMark() {

		board.setCell(0, 0, p);

		assertEquals(board.getCell(0, 0), Mark.O);
	}

	@Test(expected = OutOfBoardException.class)
	public void testOutOfBoardException() {
		board.setCell(5, 5, p);
	}

	@Test
	public void testIsNotFull() {
		board.setCell(0, 0, p);
		board.setCell(0, 1, p);
		board.setCell(0, 2, p);
		board.setCell(1, 0, p);
		board.setCell(1, 1, p);
		board.setCell(1, 2, p);
		board.setCell(2, 0, p);
		board.setCell(2, 1, p);
		// board.setCell(2, 2, p);

		assertEquals(board.isFull(), false);
	}

	@Test
	public void testIsFull() {
		board.setCell(0, 0, p);
		board.setCell(0, 1, p);
		board.setCell(0, 2, p);
		board.setCell(1, 0, p);
		board.setCell(1, 1, p);
		board.setCell(1, 2, p);
		board.setCell(2, 0, p);
		board.setCell(2, 1, p);
		board.setCell(2, 2, p);

		assertEquals(board.isFull(), true);
	}
}
