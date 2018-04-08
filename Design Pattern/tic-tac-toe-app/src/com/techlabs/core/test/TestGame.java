package com.techlabs.core.test;

import com.techlabs.core.Board;
import com.techlabs.core.Game;
import com.techlabs.core.Mark;
import com.techlabs.core.Player;
import com.techlabs.core.ResultAnalyser;

public class TestGame {
	public static void main(String args[]) {
		Board b = new Board();
		ResultAnalyser ra = new ResultAnalyser(b);
		Player p1 = new Player("Krishna", Mark.X);
		Player p2 = new Player("Pratik", Mark.O);
		Player p[] = { p1, p2 };

		Game game = new Game(b, p, ra);
		System.out.println(game.play(0, 0));
		System.out.println(game.play(0, 1));
		System.out.println(game.play(0, 2));
		System.out.println(game.play(1, 1));
		System.out.println(game.play(1, 0));
		System.out.println(game.play(1, 2));
		System.out.println(game.play(2, 2));
		System.out.println(game.play(2, 0));
		System.out.println(game.play(2, 1));
	}
}
