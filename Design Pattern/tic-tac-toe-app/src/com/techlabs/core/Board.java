package com.techlabs.core;

import com.techlabs.core.exceptions.OutOfBoardException;

public class Board {
	public Cell[][] cell = { { new Cell(), new Cell(), new Cell() },
			{ new Cell(), new Cell(), new Cell() },
			{ new Cell(), new Cell(), new Cell() } };

	public Board() {

	}

	public void setCell(int x, int y, Player p) {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			throw new OutOfBoardException();
		}
		cell[x][y].setMark(p.getMark());
	}

	public Mark getCell(int x, int y) {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			throw new OutOfBoardException();
		}
		return cell[x][y].getMark();
	}

	public Cell[][] getAllCells() {
		return cell;
	}

	public Boolean isFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (cell[i][j].getMark() == Mark.EMPTY)
					return false;
			}
		}
		return true;
	}
}
