package com.techlabs.core;

public class Game {
	private Board board;
	private Player[] players = new Player[2];
	private Player currentPlayer;
	private ResultAnalyser resultAnalyser;

	public Game(Board board, Player[] players, ResultAnalyser ra) {
		this.board = board;
		this.players = players;
		this.resultAnalyser = ra;
		this.currentPlayer = players[0];
	}

	public String play(int x, int y) {
		board.setCell(x, y, currentPlayer);
		Result r = resultAnalyser.analyse(currentPlayer);
		if (r == Result.WIN) {
			return (currentPlayer + " Wins");
		} else if (r == Result.TIE) {
			return ("Its a Tie");
		} else {
			changePlayer();
			return r.toString();
		}
	}

	private void changePlayer() {
		if (currentPlayer.toString().equals(players[0].toString())) {
			currentPlayer = players[1];
		} else {
			currentPlayer = players[0];
		}
	}
}
