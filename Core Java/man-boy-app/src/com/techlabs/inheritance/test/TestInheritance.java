package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.Infant;
import com.techlabs.inheritance.Kid;
import com.techlabs.inheritance.Man;

public class TestInheritance {
	public static void main(String args[]) {
		// case1();
		case2();
		// case3();
		// case4();
	}

	public static void case1() {
		System.out.println("CASE 1:");
		Man man;
		man = new Man();
		man.eat();
		man.play();
		man.read();
	}

	public static void case2() {
		System.out.println("CASE 2");
		Boy boy;
		boy = new Boy();
		boy.eat();
		boy.play();
		boy.read();
		boy.walk();
	}

	public static void case3() {
		System.out.println("CASE 3");
		Man man;
		man = new Boy();
		man.eat();
		man.play();
		man.read();
	}

	public static void case4() {
		System.out.println("CASE 4");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}

	public static void atThePark(Man man) {
		man.play();
	}
}