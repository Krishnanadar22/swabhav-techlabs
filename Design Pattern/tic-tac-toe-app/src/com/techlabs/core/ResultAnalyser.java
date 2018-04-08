package com.techlabs.core;

public class ResultAnalyser {
	private Board board;
	private Cell cell[][];

	public ResultAnalyser(Board board) {
		this.board = board;
		cell = board.getAllCells();
	}

	public Result analyse(Player p) {
		if (win()) {
			return Result.WIN;
		} else if (board.isFull()) {
			return Result.TIE;
		}
		return Result.ONGOING;
	}

	private Boolean win() {
		{
			if (horizontal(0) || horizontal(1) || horizontal(2)) {
				return true;
			} else if (vertical(0) || vertical(1) || vertical(2)) {
				return true;
			} else if (diagonal()) {
				return true;
			}
		}
		return false;
	}

	private Boolean horizontal(int x) {
		if (cell[x][0].getMark() != Mark.EMPTY
				&& cell[x][0].getMark() == cell[x][1].getMark()
				&& cell[x][1].getMark() == cell[x][2].getMark()) {
			return true;
		} else {
			return false;
		}
	}

	private Boolean vertical(int x) {
		if (cell[0][x].getMark() != Mark.EMPTY
				&& cell[0][x].getMark() == cell[1][x].getMark()
				&& cell[1][x].getMark() == cell[2][x].getMark()) {
			return true;
		} else {
			return false;
		}
	}

	private Boolean diagonal() {
		if (cell[0][0].getMark() != Mark.EMPTY
				&& cell[0][0].getMark() == cell[1][1].getMark()
				&& cell[1][1].getMark() == cell[2][2].getMark()) {
			return true;
		} else if (cell[0][2].getMark() != Mark.EMPTY
				&& cell[0][2].getMark() == cell[1][1].getMark()
				&& cell[1][1].getMark() == cell[2][0].getMark()) {
			return true;
		} else {
			return false;
		}
	}
}
