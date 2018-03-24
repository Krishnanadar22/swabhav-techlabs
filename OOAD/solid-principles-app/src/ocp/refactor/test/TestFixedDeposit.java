package ocp.refactor.test;

import ocp.refactor.FestivalHoli;
import ocp.refactor.FixedDeposit;

public class TestFixedDeposit {
	public static void main(String args[]) {
		FixedDeposit fd = new FixedDeposit(0, "Krishna", 8000, 5,
				new FestivalHoli());
		System.out.println(fd.calculateTotalInterest());
	}
}
