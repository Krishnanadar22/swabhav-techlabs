package ocp.refactor.test;

import ocp.refactor.Festival_Holi;
import ocp.refactor.FixedDeposit;

public class TestFixedDeposit {
	public static void main(String args[]) {
		FixedDeposit fd = new FixedDeposit(0, "Krishna", 8000, 5,
				new Festival_Holi());
		System.out.println(fd.calculateTotalInterest());
	}
}
