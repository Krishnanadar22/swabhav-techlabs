package com.techlabs.core.unittesting;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.techlabs.core.EngineeringCollege;
import com.techlabs.core.Professor;

public class TestProfessor {

	@Test
	public void salaryShouldBeCorrect() {
		Professor professor = new Professor(0, "k", "Powai", new Date());
		EngineeringCollege sjcet = new EngineeringCollege();
		int basicPay = 500;
		int hra = 500;
		int bonus = 250;
		double total = basicPay + hra + bonus;
		professor.setSalaryDetails(basicPay, hra, bonus);
		sjcet.addProfessor(professor);
		assertEquals(total, professor.getSalary(), 0);
	}
}
